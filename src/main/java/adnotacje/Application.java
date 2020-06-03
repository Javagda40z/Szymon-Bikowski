package adnotacje;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Application {

    @SuperMetoda
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List undefinedList = new ArrayList();
        integerList = (List<Integer>) undefinedList;

        for (Annotation declaredAdnotation : KlasaTestowa.class.getDeclaredAnnotations()){
            Class<? extends Annotation> annotation = declaredAdnotation.annotationType();
            System.out.println(annotation);
            System.out.println(declaredAdnotation.annotationType());

            for (Method method : annotation.getMethods()){
                System.out.println(method.getName());
            }
        }
    }
}
