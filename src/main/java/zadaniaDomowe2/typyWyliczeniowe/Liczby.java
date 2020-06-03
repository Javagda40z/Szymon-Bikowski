package zadaniaDomowe2.typyWyliczeniowe;

public enum Liczby {
    JEDEN(1), DWA(2), TRZY(3), CZTERY(4);

    private int liczba;
    Liczby(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
}
