package zadania;

import java.util.ArrayList;
import java.util.List;

public class Ciagi {
    public static void main(String[] args) {
        System.out.println(stworzCiagArytmetyczny(5,1,2));

    }
    //Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie, różnicy ciągu

    public static List<Integer> stworzCiagArytmetyczny(int dlugosc, int pierwszyElement, int roznicaCiagu){
        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszyElement);
        for (int i=pierwszyElement;i<dlugosc;i++)
        {
            ciag.add(pierwszyElement + i*roznicaCiagu);
        }
        return ciag;
    }

}
