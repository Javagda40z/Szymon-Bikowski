package zadaniaDomowe2.TypyGeneryczne;

public class Ubrania {

    private String nazwa;
    private Rozmiar rozmiar;

    public Ubrania(String nazwa, Rozmiar rozmiar) {
        this.nazwa = nazwa;
        this.rozmiar = rozmiar;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
