package zadanieDomowe.obiektowosc;

public class Odcinek {
    private Punkt punktPoczatkowy;
    private Punkt punktKoncowy;


    public Odcinek(Punkt punktPoczatkowy, Punkt punktKoncowy) {
        this.punktPoczatkowy = punktPoczatkowy;
        this.punktKoncowy = punktKoncowy;
    }

    public double dlOdcinka() {
        double dlugoscOdcinka = Math.sqrt(Math.pow((this.punktKoncowy.punkt[0] - this.punktPoczatkowy.punkt[0]), 2) + Math.pow((this.punktKoncowy.punkt[1] - this.punktPoczatkowy.punkt[1]), 2));
        return dlugoscOdcinka;
    }

    public void rysuj() {
        int i = 0;
        System.out.print("|");
        while (i < (int) dlOdcinka()) {

            System.out.print("-");
            i++;
        }
        System.out.print("|");
    }

}
