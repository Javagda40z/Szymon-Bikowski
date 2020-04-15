package zadanieDomowe.Obiektowosc;

public class Kolo extends Figury {
    private int promien;
    private String kolor;
    private String name = "Kolo";

    public Kolo(int promien, String kolor) {
        this.promien = promien;
        this.kolor = kolor;
    }

    @Override
    public double polePowierzchni() {
        return Math.PI * Math.pow(this.promien, 2);
    }

    @Override
    public String getName() {
        return name;
    }
}
