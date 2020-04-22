package zadanieDomowe;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        String sameCyfry = "93920293";
        String sameSlowa = "Cos tam sobie pisze tekst złożony z samych literek";
        String zdanie = "Cos tam sobie pisze tekst złożony z samych literek";
        String mieszane = "Pisze sobie e roku 2020 mieszany tekst razem z cyframi takimi jak 12, 21, 11, 89";
        String piecZnakow = "Justa";
        String numer1 = "123456789";
        String numer2 = "123-456-789";
        String numer3 = "123-2342345";

        System.out.println("Same cyfry: " + stringZCyfr(sameCyfry));
        System.out.println("Same słowa: " + stringZCyfr(sameSlowa));
        System.out.println("Mieszane: " + stringZCyfr(mieszane));
        System.out.println(zmienSlowo(sameSlowa));
        System.out.println(usunWszystkieBialeZnaki(mieszane));
        System.out.println("same litery o dlugosci 5(true): " + sameLiteryDlugosc5(piecZnakow));
        System.out.println("same litery o dlugosci 5(false): " + sameLiteryDlugosc5(mieszane));
        System.out.println("Czy zdanie: "+sprawdzCzyZdanie(zdanie));
        System.out.println("Sprawdzenie liczby zmienno przecinkowej: " + liczbaZmiennoPrzecinkowa("12.987"));
        System.out.println(numerTelefonu(numer1));
        System.out.println(numerTelefonu(numer2));
        System.out.println(numerTelefonu(numer3));


    }


    public static boolean stringZCyfr(String stringZCyfr) {
        return stringZCyfr.matches("[0-9]+");
    }

    public static String zmienSlowo(String zdanie) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz słowo na zamianę: ");
        String naZamiane = scanner.nextLine();
        return zdanie.replaceFirst("sobie", naZamiane);
    }

    public static String usunWszystkieBialeZnaki(String zdanie) {
        return zdanie.replaceAll("\\s+", "");
    }

    public static boolean sameLiteryDlugosc5(String zdanie) {
        return zdanie.matches("[a-zA-Z]{5}");
    }

    // Czemu nie działa ?
    public static boolean sprawdzCzyZdanie(String zdanie) {
        return zdanie.matches("^[A-Z]+(\\s\\w+)*$");
    }

    public static boolean liczbaZmiennoPrzecinkowa(String liczba) {
        return liczba.matches("[0-9]+[.]{1}[0-9]+");
    }

    public static boolean numerTelefonu(String numer) {
        if (numer.matches("^[0-9]{9}$"))
            return true;
        else if (numer.matches("^[0-9]{3}[-][0-9]{3}[-][0-9]{3}$"))
            return true;
        else
            return false;
    }

}
