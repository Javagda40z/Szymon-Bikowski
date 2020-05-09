package wyjatki;

import java.io.IOException;

public class Testowa {
    public static void main(String[] args) {
        boolean zmienna = true;
//        try{
//            metodaKtoraRzucaCzasemWyjotki(zmienna);
//        } catch (IOException e) {
//            System.out.println("Poleciał wyjątek używam innej metody");
//            metodaBezWyjatku(zmienna);
//        } finally {
//            zerwijPoloczenieZBaza();
//        }
//    }
        try(DBConnector connector = new DBConnector()) {
            metodaKtoraRzucaCzasemWyjotki(zmienna);
        } catch (Exception e) {
            System.out.println("Poleciał wyjątek używam innej metody");
            metodaBezWyjatku(zmienna);
        }
    }

    private static void zerwijPoloczenieZBaza() {
        System.out.println("KONCZE POLĄCZENIE Z BAZĄ DANYCH");
    }

    private static void metodaBezWyjatku(boolean zmienna) {
        if (zmienna) {
            throw new RuntimeException();
        }
    }

    private static void metodaKtoraRzucaCzasemWyjotki(boolean zmienna) throws IOException {
        if (zmienna) {
            throw new IOException();
        }
        System.out.println("OK");
    }
}
