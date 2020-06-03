package kolekjcje;

public class Gracz implements Comparable<Gracz> {
    private int iloscPunktow;
    private String imie;

    public int getIloscPunktow() {
        return iloscPunktow;
    }

    public void setIloscPunktow(int iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return "Gracz{" +
                "ranking=" + iloscPunktow +
                ", imie='" + imie + '\'' +
                '}';
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Gracz(int ranking, String imie) {
        this.iloscPunktow = ranking;
        this.imie = imie;
    }

    @Override
    public int compareTo(Gracz gracz) {
        // Odejmuje od wartości this wartość gracz, a następnie jeżeli wyjdzie >= 1 to jest pierwszy, =0 będzie równy,
        // jeżeli <= -1 gorszy
        // this - gracz
        //>= 1
        //= 0
        // <= -1
        return this.iloscPunktow - gracz.iloscPunktow;
    }
}
