package zadanieDomowe.koszyk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rachunek {

    private static List<Produkt> produkty = new ArrayList<>();

    public static void dodajProdukt(String nazwa, float cena) {
        Produkt produkt = new Produkt(nazwa, cena);
        produkty.add(produkt);
    }

    public static void pokarzKoszyk() {
        System.out.printf("Suma produktów w koszyku: %.2f%n",sumuj());
        System.out.printf("Wartosc brutto koszyka: %.2f%n", cenaBrutto(sumuj()));
        System.out.printf("Zwrot vat: %.2f%n", zwrocVat(sumuj(), cenaBrutto(sumuj())));
    }


    private static float cenaBrutto(float sumuj) {
        return Produkt.cenaBrutto(sumuj);
    }

    private static float sumuj() {
        float cenaRazem = 0;
        for (Produkt produkt : produkty
        ) {
            cenaRazem += produkt.getCena();
        }
        return cenaRazem;
    }

    private static float zwrocVat(float cenaRazem, float cenaBrutto) {
        return cenaBrutto - cenaRazem;
    }


}

