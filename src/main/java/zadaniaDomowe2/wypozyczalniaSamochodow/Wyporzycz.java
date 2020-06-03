package zadaniaDomowe2.wypozyczalniaSamochodow;

import java.util.Collections;

public class Wyporzycz {
    public static void wyporzycz(String rejestracja) {

        BazaPojazdow.getWypozyczalnia().stream().filter(pojazd -> {
            if (pojazd.getRejestracja().equals(rejestracja)) {
                if (pojazd.getStanWypozyczenia().equals(StanWypozyczenia.NIEWYPPOZYCZONY)) {
                    pojazd.setStanWypozyczenia(StanWypozyczenia.WYPOZYCZONY);
                    return true;
                }
            }
            return false;
        });
    }
}
