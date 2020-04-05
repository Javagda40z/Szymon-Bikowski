package zadania;

import org.apache.commons.lang3.math.NumberUtils;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Tablice {
    private static int[] tablicaLiczb = new int[]{1,3,3,5,2,9,7,6};

    public static void main(String[] args) {

//        Arrays.sort(tablicaLiczb);
//        System.out.println("Maksymalna warość: " + tablicaLiczb[0]);
//        System.out.println("Minimalna wartość: " + (tablicaLiczb[tablicaLiczb.length-1]));
        System.out.println(NumberUtils.max(tablicaLiczb));
        System.out.println((NumberUtils.min(tablicaLiczb)));

    }


}


