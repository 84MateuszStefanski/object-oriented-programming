package metadane;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SuperMethodMain {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class class1 = Employe.class;
        String name = class1.getName();
        System.out.println(name);
        System.out.println(class1.getSimpleName());
        Constructor[] constructors = class1.getConstructors();
        System.out.println(constructors.length);
        Constructor constructor = constructors[1];
        //Object o = constructor.newInstance();
        Employe emp5 = new Employe();
        Method [] methods = class1.getMethods();
        System.out.println(methods.length);
        Class returnType = methods[0].getReturnType();
        System.out.println(returnType);
        Class<?>[] exceptionTypes = methods[0].getExceptionTypes();
        Annotation[] annotations = methods[0].getAnnotations();
        for (int i =0;i<methods.length;i++){
            System.out.println(methods[i].getName());
        }
        //System.out.println(class1.getClasses());
        Field[] fields = class1.getDeclaredFields();
        for (int i = 0; i<fields.length; i++){
            System.out.println(fields[i].getName());
        }
        for (int i = 0; i< fields.length; i++){
            System.out.println(fields[i].getType().getSimpleName());
        }
        //zmieniłem .getName na .getSimpleName żeby wyświetliło tylko "String" - wcześniej było java.lang.String
    }
}
