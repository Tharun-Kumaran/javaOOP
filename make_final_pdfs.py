from pathlib import Path
import subprocess
import re
import tempfile

ROOT = Path.cwd()

def run_java(unit, src):
    outdir = Path(tempfile.mkdtemp(prefix=f"{unit}_"))
    files = [str(x) for x in (ROOT/"src"/unit).glob("*.java")]

    c = subprocess.run(
        ["javac", "-d", str(outdir)] + files,
        capture_output=True, text=True
    )

    if c.returncode != 0:
        return "Compilation Error:\n" + c.stderr

    try:
        r = subprocess.run(
            ["java", "-cp", str(outdir), f"{unit}.{src.stem}"],
            input=("1\n" * 30),
            capture_output=True,
            text=True,
            timeout=5
        )
        return r.stdout.strip() or "No console output."

    except subprocess.TimeoutExpired:
        return "Program requires interactive input / did not finish."

def make_unit(unit):
    srcdir = ROOT/"src"/unit
    files = sorted(
        srcdir.glob("task*.java"),
        key=lambda x: int(re.search(r"\d+", x.stem).group())
    )

    combined = ROOT/f".{unit}_combined.txt"

    with open(combined, "w", encoding="utf-8") as f:
        for src in files:
            f.write("\n\n")
            f.write("="*75 + "\n")
            f.write(f"                         {src.stem.upper()}\n")
            f.write("="*75 + "\n\n")

            f.write("SOURCE CODE\n")
            f.write("-"*75 + "\n")
            f.write(f"Name: Tharun-Kumaran\n")
            f.write(f"Roll No: 2117250020478\n\n")
            f.write(src.read_text(errors="replace"))
            f.write("\n\n")

            f.write("OUTPUT\n")
            f.write("-"*75 + "\n")
            f.write("Name: Tharun-Kumaran\n")
            f.write("Roll No: 2117250020478\n")
            f.write(run_java(unit, src))
            f.write("\n\n")

    pdf = ROOT/f"Java_OOP_{unit.title()}_Final.pdf"

    subprocess.run(
        [
            "enscript",
            "-Ejava",
            "--color",
            "-B",
            "-f",
            "Courier8",
            "-p",
            "-",
            str(combined)
        ],
        stdout=subprocess.PIPE,
        check=True
    )

    ps = ROOT/f".{unit}.ps"

    with open(ps, "wb") as p:
        subprocess.run(
            [
                "enscript",
                "-B",
                "-f",
                "Courier8",
                "-p",
                str(ps),
                str(combined)
            ],
            check=True
        )

    subprocess.run(["ps2pdf", str(ps), str(pdf)], check=True)

    return pdf

for unit in ["unit1", "unit2"]:
    pdf = make_unit(unit)
    print(f"Created: {pdf}")

print("\nDONE")
