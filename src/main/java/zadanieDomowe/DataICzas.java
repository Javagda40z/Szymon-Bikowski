package zadanieDomowe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DataICzas {
    private static LocalDate data;
    private static LocalTime czas;


    public static void main(String[] args) {

        String dataOd = "1990-08-28";
        String dataDo = "1994-03-31";
        String dataPrzestepna = "2000-08-28";
        int dodajDni = 1311;
        String[] datyDoTestu = new String[]{"2000-08-28", "2010-08-28", "2020-08-28", "1700-08-28", "1600-08-28", "2028-08-28", "1990-08-28", "1800-08-28", "1904-08-28"};

        System.out.println("Data: " + data.now() + " Czas: " + czas.now());
        System.out.println("Minęło " + dniOdPoczatkuRoku(data.now()) + " dni w roku");
        System.out.println("Pozostalo " + dniDoKoncaRoku(data.now()) + " dni do końca roku");
        System.out.println("Pomiędzy " + dataOd + " a " + dataDo + " minęło " + ileMineloDniPomiedzyDatami(dataOd, dataDo) + " dni");
        System.out.println("Data " + ktoraPierwszaData(dataOd, dataDo) + " jest pierwsza");
        System.out.println("Do daty " + dataOd + " dodano " + dodajDni + " dni: " + dodajDniDoDaty(dataOd, dodajDni));
        System.out.println("Wbudowana funkcja czy rok jest przestępny: " + sprawdzCzyPrzestepnyWbudowana(dataPrzestepna));
        System.out.println("Moja funkcja czy rok jest przestepny: " + sprawdzCzyPrzestepnyMoja(dataPrzestepna));
        System.out.println("Test sprawdzający poprawność mojej metody roku przestępnego vs metoda wbudowana: " + testSprawdzajacyCzyPrzestepny(datyDoTestu));
        System.out.println(dataFormater());
    }

    public static int dniOdPoczatkuRoku(LocalDate data) {
        return data.getDayOfYear();
    }

    public static int dniDoKoncaRoku(LocalDate data) {
        if (sprawdzCzyPrzestepnyMoja(data)) {
            return 366 - data.getDayOfYear();
        } else
            return 365 - data.getDayOfYear();
    }

    public static long ileMineloDniPomiedzyDatami(String dataOd, String dataDo) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return ChronoUnit.DAYS.between(LocalDate.parse(dataOd, dateTimeFormatter), (LocalDate.parse(dataDo)));
    }

    public static LocalDate ktoraPierwszaData(String data1, String data2) {
        if (ileMineloDniPomiedzyDatami(data1, data2) > 0) {
            return LocalDate.parse(data1);
        } else
            return LocalDate.parse(data2);
    }

    public static LocalDate dodajDniDoDaty(String data, int dodajDni) {
        return LocalDate.parse(data).plusDays(dodajDni);
    }

    public static boolean sprawdzCzyPrzestepnyWbudowana(String data) {
        return LocalDate.parse(data).isLeapYear();
    }

    public static boolean sprawdzCzyPrzestepnyMoja(String data) {
        String rokJakoString = data.substring(0, 4);
        Integer rok = Integer.parseInt(rokJakoString);
        if (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0)) {
            return true;
        } else
            return false;
    }

    public static boolean sprawdzCzyPrzestepnyMoja(LocalDate data) {
        String rokJakoString = data.toString().substring(0, 4);
        Integer rok = Integer.parseInt(rokJakoString);
        if (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0)) {
            return true;
        } else
            return false;
    }

    public static boolean testSprawdzajacyCzyPrzestepny(String[] datyDoTestu) {
        List metodaWbudowana = new ArrayList();
        List mojaMetoda = new ArrayList();

        for (String data : datyDoTestu) {
            metodaWbudowana.add(sprawdzCzyPrzestepnyWbudowana(data));
            mojaMetoda.add(sprawdzCzyPrzestepnyMoja(data));
        }
        return metodaWbudowana.equals(mojaMetoda);
    }

    public static String dataFormater() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd-MM-yyyy");
        return LocalDateTime.now().format(formatter);
    }
}
