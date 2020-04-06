package zadanieDomowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablice {


    public static void main(String[] args) {
        int[] tablica = new int[]{6, 3, 5, 7, 1, 1, 7, 9};
        int[] tablica2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        String[] imiona = new String[]{"mateusz", "kasia", "adam", "tomek", "andrzej"};

        System.out.println("Średnia: " + srednia(tablica));
        System.out.println("Max: " + max(tablica));
        System.out.println("Min: " + min(tablica));
        System.out.println("Suma tablic: " + suma(tablica, tablica2));
        System.out.println("Długość tablicy imiona: " + imiona.length);
        imiona[0] = "piotr";
        System.out.println("Tablica imiona: " + wypiszTablice(imiona));
        imiona[2] = ""; // Gdy usunę elemnt z tablicy jej wielkość się nie zmieni ponieważ wilekośc tablicy deklaruje się przy jej tworzeniu i jest ona niezmienialna
        System.out.println("Fuzja dwóch tablic: " + wypiszTablice(fuzjaDwochTablic(tablica, tablica2)));
        System.out.println("Odwrotna tablica: " + wypiszTablice(odwroconaTablica(tablica)));

    }

    public static int srednia(int[] tablica) {
        int suma = 0;
        for (int element : tablica) {
            suma += element;
        }
        return suma / 2;
    }

    public static String max(int[] tablica) {
        if (tablica.length != 0) {
            int max = tablica[0];
            for (int element : tablica) {
                if (element > max)
                    max = element;
            }
            return "" + max;
        }
        return "tablica jest pusta";
    }

    public static String min(int[] tablica) {
        if (tablica.length != 0) {
            int min = tablica[0];
            for (int element : tablica) {
                if (element < min)
                    min = element;
            }
            return "" + min;
        }
        return "tablica jest pusta";
    }

    public static int suma(int[]... tablica) {
        int suma = 0;
        for (int[] tablice : tablica) {
            for (int element : tablice) {
                suma += element;
            }
        }
        return suma;
    }

    public static String wypiszTablice(String[] tablica) {
        String wypiszTablice = "";
        for (String element : tablica) {
            char pierwszaLitera = element.toUpperCase().charAt(0);
            element = pierwszaLitera + element.substring(1);
            wypiszTablice += element + ", ";
        }
        return wypiszTablice;
    }

    public static String wypiszTablice(int[] tablica) {
        String wypiszTablice = "";
        for (int element : tablica) {
            wypiszTablice += element + ", ";
        }
        return wypiszTablice;
    }

    public static int[] fuzjaDwochTablic(int[] tablica, int[] tablica2) {
        int[] fuzja;
        List<Integer> lista = new ArrayList<>();
        Arrays.asList(tablica);
        for (int elementTablicy2 : tablica2) {
            if (!lista.contains(elementTablicy2)) {
                lista.add(elementTablicy2);
            }
        }
        fuzja = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            fuzja[i] = lista.get(i);
        }
        return fuzja;
    }

    public static int[] odwroconaTablica(int[] tablica) {
        int[] odwrotnaTablica = new int[tablica.length];
        for (int i = 0; i < tablica.length; i++) {
            odwrotnaTablica[(tablica.length -1)- i] = tablica[i];
        }
        return odwrotnaTablica;
    }

}
