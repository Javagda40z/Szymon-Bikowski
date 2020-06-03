package zadaniaDomowe2.wypozyczalniaSamochodow;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BazaPojazdow {
    private static List<Pojazd> wypozyczalnia;

    public BazaPojazdow() {
        wypozyczalnia = new ArrayList<>();
    }

    public static void addToWypozyczalnia(Pojazd pojazd) {
        wypozyczalnia.add(pojazd);
    }

    public static List<Pojazd> getWypozyczalnia() {
        return wypozyczalnia;
    }

    public static List<Pojazd> znajdzPojazdWeslugKryteriow(Predicate<Pojazd> filtr) {
        return wypozyczalnia.stream().filter(filtr).collect(Collectors.toList());
    }


}
