package zadania;

public class TabliczkaMnozenia {
    //    public static final int LICZBA = 5; // dostęp z zewnątrz, be tworzenia
    private final int liczba;

    public TabliczkaMnozenia(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczke() {
        System.out.println("Tabliczka mnożenia dla liczby: " + this.liczba);
        for (int i = 1; i <= liczba; i++) {
            System.out.println(liczba + " x " + i + " = " + this.liczba * i);
        }
    }
}