package kolekjcje;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPorównywatorow {
    public static void main(String[] args) {
        Gracz gracz1 = new Gracz(1, "Gracz 1");
        Gracz gracz2 = new Gracz(2, "Gracz 2");
        Gracz gracz3 =new Gracz(3, "Gracz 3");
        Gracz gracz4 = new Gracz(4, "Gracz 4");
        List<Gracz> gracze = new ArrayList<>();
        gracze.add(gracz1);
        gracze.add(gracz2);
        gracze.add(gracz3);
        gracze.add(gracz4);
        System.out.println("Przed sortowaniem: ");
        System.out.println(gracze);
        Collections.sort(gracze);

        Collections.sort(gracze,new GraczComparator());

        System.out.println("Po sortowaniu");
        System.out.println(gracze);
    }
}
