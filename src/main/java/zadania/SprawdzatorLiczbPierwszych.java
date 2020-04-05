package zadania;

public class SprawdzatorLiczbPierwszych {

    private int[] liczbyPierwsze;

    public SprawdzatorLiczbPierwszych(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    public boolean czyPierwsza(int a) {
        for (int i : liczbyPierwsze) {
            if (i == a)
                return true;
        }
        return false;
    }

}
