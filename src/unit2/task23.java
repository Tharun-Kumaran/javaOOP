package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.lang.reflect.*;
class Student {
    private String name="Divya";
    private int age=20;
    private void displayInfo() {
        System.out.println("Name: "+name+", Age: "+age);
    }
}
public class task23 {
    public static void main(String[] args) throws Exception {
        Student s=new Student();
        Class<?> c=s.getClass();

        System.out.println("Fields:");
        for(Field f:c.getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println(f.getName()+" = "+f.get(s));
        }

        System.out.println("Methods:");
        for(Method m:c.getDeclaredMethods())
            System.out.println(m.getName());

        Method m=c.getDeclaredMethod("displayInfo");
        m.setAccessible(true);
        m.invoke(s);
    }
}
