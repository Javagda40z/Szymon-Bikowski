package zadaniaDomowe2.wypozyczalniaSamochodow;

public class Pojazd {
    private String rejestracja;
    private String vin;
    private String kolor;
    private double cena;
    private double spalanie;
    private double stanZbiornika;
    private double licznikKilometrow;
    private StanWypozyczenia stanWypozyczenia = StanWypozyczenia.NIEWYPPOZYCZONY;
    private TypPojazdu typPojazdu;

    public TypPojazdu getTypPojazdu() {
        return typPojazdu;
    }

    public StanWypozyczenia getStanWypozyczenia() {
        return stanWypozyczenia;
    }

    public void setStanWypozyczenia(StanWypozyczenia stanWypozyczenia) {
        this.stanWypozyczenia = stanWypozyczenia;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setStanZbiornika(double stanZbiornika) {
        this.stanZbiornika = stanZbiornika;
    }

    public void setLicznikKilometrow(double licznikKilometrow) {
        this.licznikKilometrow = licznikKilometrow;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public String getVin() {
        return vin;
    }

    public String getKolor() {
        return kolor;
    }

    public double getCena() {
        return cena;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public double getStanZbiornika() {
        return stanZbiornika;
    }

    public double getLicznikKilometrow() {
        return licznikKilometrow;
    }

    public Pojazd(String rejestracja, String vin, String kolor, double cena, double spalanie, double stanZbiornika, double licznikKilometrow, StanWypozyczenia stanWypozyczenia, TypPojazdu typPojazdu) {
        this.rejestracja = rejestracja;
        this.vin = vin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.stanZbiornika = stanZbiornika;
        this.licznikKilometrow = licznikKilometrow;
        this.stanWypozyczenia = stanWypozyczenia;
        this.typPojazdu = typPojazdu;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "rejestracja='" + rejestracja + '\'' +
                ", vin='" + vin + '\'' +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                ", spalanie=" + spalanie +
                ", stanZbiornika=" + stanZbiornika +
                ", licznikKilometrow=" + licznikKilometrow +
                ", stanWypozyczenia=" + stanWypozyczenia +
                ", typPojazdu=" + typPojazdu +
                '}';
    }
}
