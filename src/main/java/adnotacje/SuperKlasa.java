package adnotacje;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SuperKlasa {
    String elemnt() default "defaultValue";

}
