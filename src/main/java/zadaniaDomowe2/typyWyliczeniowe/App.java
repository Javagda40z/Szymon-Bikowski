package zadaniaDomowe2.typyWyliczeniowe;

public class App {
    public static void main(String[] args) {

        Liczby.CZTERY.setLiczba(6);

        for (Liczby liczba : Liczby.values()) {
            System.out.println(liczba + " to " + liczba.getLiczba());
        }


    }
}
