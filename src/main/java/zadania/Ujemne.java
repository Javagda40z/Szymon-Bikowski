package zadania;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Ujemne {

    public static void main(String[] args) {
        int[] tablica = new int[]{-1, 2, -3, 5, -8};
        int[] tablicaMinusy = new int[tablica.length];
        int iloscMinusowych = 0;
        int iteracja = 0;
        for (int i : tablica) {

            if (i < 0) {
                tablicaMinusy[iteracja] = i;
                iteracja++;
                iloscMinusowych++;
            }

        }

        System.out.println(iloscMinusowych);
        System.out.println(Arrays.toString(tablicaMinusy));
        System.out.println(Arrays.toString(policzUjemne(tablica)));
    }

    public static int[] policzUjemne(int[] tablica) {
        int[] tab = new int[0];
        for (int i : tablica) {
            if (i < 0)
                tab = ArrayUtils.add(tab, i);
        }
        return tab;
    }

}
