package zadanieDomowe.hashCode;

public class Czlowiek {

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    String imie;
    int wiek;

    public Czlowiek(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;

        Czlowiek czlowiek = (Czlowiek) o;

        if (wiek != czlowiek.wiek) return false;
        return imie.equals(czlowiek.imie);
    }

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + wiek;
        return result;
    }
}
