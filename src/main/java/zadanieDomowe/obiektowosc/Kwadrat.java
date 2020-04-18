package zadanieDomowe.obiektowosc;

public class Kwadrat extends Figury {
    private int bok;
    private String kolor;
    private String name = "Kwadrat";

    public Kwadrat(int bok, String kolor) {
        this.bok = bok;
        this.kolor = kolor;
    }

    @Override
    public double polePowierzchni() {

        return Math.pow(this.bok, 2);
    }

    @Override
    public String getName() {
        return name;
    }
}
