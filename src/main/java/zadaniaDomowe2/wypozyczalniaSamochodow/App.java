package zadaniaDomowe2.wypozyczalniaSamochodow;

import pojazd.Ciezarowka;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        BazaPojazdow bazaPojazdow = new BazaPojazdow();
        Pojazd audi = new Pojazd("GDA505UN", "GH0090393DMD0DK", "czarny", 120, 7.00,
                70.00, 50_000, StanWypozyczenia.NIEWYPPOZYCZONY, TypPojazdu.OSOBOWY);


        BazaPojazdow.addToWypozyczalnia(audi);
        Wyporzycz.wyporzycz(audi.getRejestracja());
        System.out.println(BazaPojazdow.getWypozyczalnia().stream().filter(pojazd -> pojazd.getStanWypozyczenia().equals(StanWypozyczenia.WYPOZYCZONY)).collect(Collectors.toList().toString());
        System.out.println(Util.dystans(audi.getStanZbiornika(), audi.getSpalanie()));


    }
}
