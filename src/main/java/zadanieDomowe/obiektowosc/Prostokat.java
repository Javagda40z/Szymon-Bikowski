package zadanieDomowe.obiektowosc;

public class Prostokat extends Figury {
    private int bokA;
    private int bokB;
    private String kolor;
    private String name = "Prostokat";

    public Prostokat(int bokA, int bokB, String kolor) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.kolor = kolor;
    }

    @Override
    public double polePowierzchni() {
        return bokA * bokB;
    }

    @Override
    public String getName() {
        return name;
    }
}
