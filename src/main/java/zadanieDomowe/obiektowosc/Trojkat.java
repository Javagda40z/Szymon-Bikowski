package zadanieDomowe.obiektowosc;

public class Trojkat extends Figury {
    private int podstawa;
    private int wysoksc;
    private String kolor;
    private String name = "Trojkat";

    public Trojkat(int podstawa, int wysoksc, String kolor) {
        this.podstawa = podstawa;
        this.wysoksc = wysoksc;
        this.kolor = kolor;
    }

    @Override
    public double polePowierzchni() {
        return (podstawa * wysoksc) / 2;
    }

    @Override
    public String getName() {
        return name;
    }
}
