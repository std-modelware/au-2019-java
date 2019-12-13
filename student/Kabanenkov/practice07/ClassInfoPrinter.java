package practice07;

import java.lang.reflect.*;

public class ClassInfoPrinter<T> {
    private Class<T> cl;

    public ClassInfoPrinter(Class<T> cl) {
        this.cl = cl;
    }

    public void printCanonicalName() {
        System.out.println("Class: \"" + cl.getCanonicalName() + "\"");
    }

    public void printConstructors(int mod) {
        System.out.println("Ctors:");
        for(Constructor ctor : cl.getConstructors()) {
            if((ctor.getModifiers() & mod) != 0) {
                System.out.println(methodToString(ctor));
            }
        }
    }

    public void printMethods(int mod) {
        System.out.println("Methods:");
        for(Method m : cl.getDeclaredMethods()) {
            if((m.getModifiers() & mod) != 0) {
                System.out.println(methodToString(m));
            }
        }
    }

    public void printFields(int mod) {
        System.out.println("Fields:");
        for(Field f : cl.getDeclaredFields()) {
            if((f.getModifiers() & mod) != 0) {
                System.out.println(Modifier.toString(f.getModifiers()) + ' ' + f.getType().getName() + ' ' + f.getName());
            }
        }
    }

    private String methodToString(Executable e) {
        String result = new String("");

        for(Type t : e.getParameterTypes())
            result += t.getTypeName() + ", ";

        return Modifier.toString(e.getModifiers()) + ' ' + e.getName() + '(' + result + ')';
    }
}
