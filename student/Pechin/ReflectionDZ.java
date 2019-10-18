package com.academicuni.dz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class ReflectionDZ {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("The name of class is " + StackDZ.class.getName());
        System.out.println("The canonical name of class is " + StackDZ.class.getCanonicalName());
        System.out.println("The simple name of class is " + StackDZ.class.getSimpleName());
        System.out.println("StackDZ constructors");
        Constructor[] constructors = StackDZ.class.getConstructors();
        for (Constructor con : constructors) {
            System.out.println(con.toString());
        }
        Field[] fields = StackDZ.class.getDeclaredFields();
        System.out.println("StackDZ fields");
        for(Field field : fields){
            System.out.println(field.toString());
        }
        Method[] methods = StackDZ.class.getMethods();
        System.out.println("StackDZ methods");
        for(Method method : methods){
            System.out.println(method.toString());
        }

        Class c = Class.forName("com.academicuni.dz.StackDZ");
        Constructor con = c.getConstructor(int.class);
        Object o = con.newInstance(1);
        Method m1 = c.getMethod("push", int.class);
        Method m2 = c.getMethod("pop");
        m1.invoke(o, 1);
        m1.invoke(o, 123);
        System.out.println(m2.invoke(o));
        System.out.println(m2.invoke(o));
    }
}
