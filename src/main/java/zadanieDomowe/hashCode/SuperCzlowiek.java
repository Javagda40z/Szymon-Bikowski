package zadanieDomowe.hashCode;

public class SuperCzlowiek extends Czlowiek {
    int cokolwiek;

    public SuperCzlowiek(String imie, int wiek) {
        super(imie, wiek);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SuperCzlowiek that = (SuperCzlowiek) o;

        return cokolwiek == that.cokolwiek;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cokolwiek;
        Integer[] array = new Integer[10];
        return result;
    }

    public int getCokolwiek() {
        return cokolwiek;
    }

    public void setCokolwiek(int cokolwiek) {
        this.cokolwiek = cokolwiek;
    }
}
