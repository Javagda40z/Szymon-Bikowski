package pojazd;

public abstract class Pojazd {

    private String rejestracja;
    private Typ typ;
    private Paliwo paliwo;

    public Pojazd(String rejestracja, Typ typ, Paliwo silnik) {
        this.rejestracja = rejestracja;
        this.typ = typ;
        this.paliwo = silnik;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public void setPaliwo(Paliwo paliwo) {
        this.paliwo = paliwo;
    }

    public Typ getTyp() {
        return typ;
    }

    public Paliwo getPaliwo() {
        return paliwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pojazd pojazd = (Pojazd) o;

        return rejestracja.equals(pojazd.rejestracja);
    }

    @Override
    public int hashCode() {
        return rejestracja.hashCode();
    }
}
