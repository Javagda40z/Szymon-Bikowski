package zadanieDomowe.hashCode;

public class EkstraCzlowiek extends Czlowiek {
    int costam;

    public int getCostam() {
        return costam;
    }

    public void setCostam(int costam) {
        this.costam = costam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EkstraCzlowiek that = (EkstraCzlowiek) o;

        return costam == that.costam;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + costam;
        return result;
    }

    public EkstraCzlowiek(String imie, int wiek) {
        super(imie, wiek);
    }
}
