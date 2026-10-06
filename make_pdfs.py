from pathlib import Path
import subprocess
import re
import html

ROOT = Path.cwd()
TMP = ROOT / ".pdf_temp"
TMP.mkdir(exist_ok=True)

def run_task(unit, srcfile):
    task = srcfile.stem
    package = unit
    classname = task
    fqcn = f"{package}.{classname}"

    # Compile the whole unit because some tasks depend on other classes/packages
    outdir = TMP / unit / "bin"
    outdir.mkdir(parents=True, exist_ok=True)

    javafiles = [str(x) for x in (ROOT/"src"/unit).rglob("*.java")]

    cp = subprocess.run(
        ["javac", "-d", str(outdir)] + javafiles,
        capture_output=True, text=True
    )

    if cp.returncode != 0:
        return "COMPILATION ERROR:\n" + cp.stderr

    # Give Scanner-based programs harmless sample input.
    sample_input = ("1\n" * 50).encode()

    try:
        p = subprocess.run(
            ["java", "-cp", str(outdir), fqcn],
            input=sample_input,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            timeout=5
        )
        output = p.stdout.decode(errors="replace").strip()

        if not output:
            output = "No console output."

        return output

    except subprocess.TimeoutExpired as e:
        output = e.stdout.decode(errors="replace").strip() if e.stdout else ""
        return (output + "\n\n[Program stopped after 5 seconds; "
                "it may require interactive input or continuous execution.]").strip()

def make_pdf(unit):
    srcdir = ROOT / "src" / unit
    files = sorted(srcdir.glob("task*.java"), key=lambda p: int(re.search(r"\d+", p.stem).group()))

    ps = TMP / f"{unit}.ps"

    with open(ps, "w", encoding="utf-8") as f:
        f.write("""%!PS
/Courier findfont 8 scalefont setfont
72 760 moveto
""")

        for src in files:
            code = src.read_text(errors="replace")
            output = run_task(unit, src)

            # New page
            f.write("showpage\n72 760 moveto\n")
            f.write(f"({src.stem.upper()}) show\n")
            f.write("0 -18 rmoveto\n")
            f.write("(========================================) show\n")
            f.write("0 -18 rmoveto\n")
            f.write("(SOURCE CODE) show\n")
            f.write("0 -14 rmoveto\n")

            for line in code.splitlines():
                line = line.replace("\\", "\\\\").replace("(", "\\(").replace(")", "\\)")
                if len(line) > 105:
                    line = line[:105]
                f.write(f"({line}) show\n0 -10 rmoveto\n")

            f.write("0 -14 rmoveto\n")
            f.write("(OUTPUT) show\n")
            f.write("0 -14 rmoveto\n")

            f.write("(Name: Tharun-Kumaran) show\n0 -10 rmoveto\n")
            f.write("(Roll No: 2117250020478) show\n0 -14 rmoveto\n")

            for line in output.splitlines():
                line = line.replace("\\", "\\\\").replace("(", "\\(").replace(")", "\\)")
                if len(line) > 105:
                    line = line[:105]
                f.write(f"({line}) show\n0 -10 rmoveto\n")

    pdf = ROOT / f"Java_OOP_{unit.title()}_With_Output.pdf"

    subprocess.run(
        ["ps2pdf", str(ps), str(pdf)],
        check=True
    )

    return pdf

for unit in ["unit1", "unit2"]:
    pdf = make_pdf(unit)
    print(f"Created: {pdf}")

print("\nDONE!")
