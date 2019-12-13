package practice07;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        try {
            Class cl = Class.forName("practice07.BoringClass");
            Constructor ctor = cl.getConstructors()[0];
            BoringClass bc = (BoringClass)ctor.newInstance();
            BoringClass.class.getMethod("sayHello", String.class).invoke(bc, "world");

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        ClassInfoPrinter<String> ci = new ClassInfoPrinter<>(String.class);

        ci.printCanonicalName();
        ci.printConstructors(Modifier.constructorModifiers());
        ci.printMethods(Modifier.methodModifiers());
        ci.printFields(Modifier.fieldModifiers());
    }
}
