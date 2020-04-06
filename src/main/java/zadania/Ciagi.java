package zadania;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ciagi {

    public static void main(String[] args) {

//        List<Integer> lista = new ArrayList<>();
//        ///
//        lista.add(15);
//        lista.add(20);
//        lista.add(30);
//
//        System.out.println(lista);
//        lista.add(444);
//        System.out.println(lista);
//        lista.remove(0);
//        System.out.println(lista);
//        System.out.println(stworzCiagArytmetyczny(5, 1, 1));

//        List<String> listaPracownikow = new LinkedList<String>();
//        listaPracownikow.add("Mateusz");
//        listaPracownikow.add("Mateusz2");
//        listaPracownikow.add("Marika");
//
//        List<String> listaPracownikowZInnegoDzialu = new ArrayList<String>();
//
//        listaPracownikowZInnegoDzialu.add("Mateusz1");
//        listaPracownikowZInnegoDzialu.add("Mateusz3");
//        listaPracownikowZInnegoDzialu.add("Marika2");
//
//        dajPodwyzke(listaPracownikow);
//        dajPodwyzke(listaPracownikowZInnegoDzialu);

        List<Integer> ciag = stworzCiagArytmetyczny(10, 1, 1);
        System.out.println(ciag);
        System.out.println(sprawdzCzyCiagJestArytmetyczny(ciag));
        List<Integer> ciagNiearytmetyczny = Arrays.asList(1,2,3,4,2,2,4,7);
        System.out.println(ciagNiearytmetyczny);
        System.out.println(sprawdzCzyCiagJestArytmetyczny(ciagNiearytmetyczny));

    }


    public static void dajPodwyzke(List<String> pracownicy) {
        //daje podwyzke kazdemu pracownikowi

    }


    //Napisz funkcję tworzącą ciąg arytmetyczny o podanych:
    //długości, pierwszym elemencie, różnicy ciągu

    public static List<Integer> stworzCiagArytmetyczny(int dlugosc, int pierwszy, int roznica) {
        List<Integer> ciag = new LinkedList<Integer>();

        ciag.add(pierwszy);
        for (int i = pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i * roznica);
        }
        return ciag;
    }

    public static boolean sprawdzCzyCiagJestArytmetyczny(List<Integer> ciag) {
        for (int i = 1; i + 1 < ciag.size(); i++) {
            if ((ciag.get(i - 1) + ciag.get(i + 1)) / 2 != ciag.get(i)) {
                return false;
            }

        }
        return true;
    }
}