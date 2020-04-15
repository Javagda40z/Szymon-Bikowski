package zadanieDomowe;

import java.util.ArrayList;
import java.util.List;

public class Varags {

    public static void main(String[] args) {
        nElementow(1,2,3,4,5);
        nImion("Justyna","Tomasz","Beata","Szymon","Iga");

    }

    public static void nElementow(int element0, int... elemnt) {
        int suma = 0;
        int wynik = 0;
        int dodawanie = 0;
        for (int i = 0; i < elemnt.length; i++) {
            suma += elemnt[i];
        }

        for (int j:elemnt) {
            wynik += j;
        }

        for (int i = elemnt.length - 1; i >= 0; i--) {
            dodawanie += elemnt[i];
        }

        System.out.println(suma);
        System.out.println(wynik);
        System.out.println(dodawanie);

    }

    public static void nImion(String imie, String... imiona){
        int element = 0;
        List<String> listaImion = new ArrayList<>();
        for (String i : imiona){
            listaImion.add(i);
        }

        while (element < imiona.length){
            System.out.println(imiona[element]);
            element++;
        }
    }






}
