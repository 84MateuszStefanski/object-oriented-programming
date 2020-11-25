package metahome;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException,
            InvocationTargetException, InstantiationException {

        Class proc1 = Processor.class;
        String name = proc1.getName();
        System.out.println(name);
        System.out.println(proc1.getSimpleName());
        Constructor[] constructors = proc1.getConstructors();
        System.out.println(constructors.length);
        Processor processor = new Processor();







    }
}
