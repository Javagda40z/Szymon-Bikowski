package zadanieDomowe.obiektowosc;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Do listy nie wrzucę obiektu instancji Kolo, Odcinek, Kwadrat, Trojakat, Prosotkat, ponieważ oniekty będą różnego typu
        List<Figury> figuryList = new ArrayList<>();

        Figury kolo = new Kolo(3, "czerwony");
        Punkt punktPoczatkowy = new Punkt(2, 3);
        Punkt punktKoncowy = new Punkt(7, 8);
        Odcinek odcinek = new Odcinek(punktPoczatkowy, punktKoncowy);
        Figury prostokat = new Prostokat(3, 5, "Kolorowy");
        Figury kwadrat = new Kwadrat(5, "Zielony");
        Figury trojkat = new Trojkat(8, 4, "Żółty");

        figuryList.add(kolo);
        figuryList.add(prostokat);
        figuryList.add(kwadrat);
        figuryList.add(trojkat);

        System.out.println("Dlugosc odcinka: " + odcinek.dlOdcinka());
        odcinek.rysuj();
        System.out.println("");
        for (Figury figury : figuryList) {
            System.out.println("Pole " + figury.getName() + ": " + figury.polePowierzchni());
        }

    }
}