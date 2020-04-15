package zadanieDomowe.Obiektowosc;

public class Punkt {
    private int x = 0;
    private int y = 0;

    int[] punkt;

    public Punkt(int x, int y){
      punkt(x,y);
    }

    public int[] punkt(int x, int y){
        punkt = new int[]{x,y};
        return punkt;
    }
}
