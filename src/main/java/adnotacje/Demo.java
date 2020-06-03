package adnotacje;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class<Test> cls = Test.class;
        Test obiekt = cls.getConstructor().newInstance();
        obiekt.method1();

        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method method3 = cls.getDeclaredMethod("method3", int.class);
        method3.invoke(obiekt, 50);

        Field field = cls.getDeclaredField("zmienna");
        field.setAccessible(true);
        field.set(obiekt,"TO JEST ZMIENNA ZMIENIONA KTORA JEST PRYWATNA WTF");
        obiekt.method1();

        Method prywatnaMetoda = cls.getDeclaredMethod("method2");
        prywatnaMetoda.setAccessible(true);
        prywatnaMetoda.invoke(obiekt);

    }
}
