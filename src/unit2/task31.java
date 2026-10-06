package unit2;
// Name: Tharun-Kumaran
// Roll No: 2117250020478

import java.lang.reflect.*;
interface Calculator {
    int add(int a,int b);
}
class CalculatorImpl implements Calculator {
    public int add(int a,int b) {
        return a+b;
    }
}
class LoggingHandler implements InvocationHandler {
    private final Object target;
    LoggingHandler(Object target) {
        this.target=target;
    }
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
        long start=System.nanoTime();
        Object result=method.invoke(target,args);
        long end=System.nanoTime();

        System.out.println("Method: "+method.getName());
        System.out.println("Result: "+result);
        System.out.println("Time: "+(end-start)+" ns");
        return result;
    }
}
public class task31 {
    public static void main(String[] args) {
		System.out.println("Name: Tharun-Kumaran");
		System.out.println("Roll No: 2117250020478");
        Calculator real=new CalculatorImpl();

        Calculator proxy=(Calculator)Proxy.newProxyInstance(
            Calculator.class.getClassLoader(),
            new Class<?>[]{Calculator.class},
            new LoggingHandler(real)
        );

        proxy.add(10,20);
    }
}
