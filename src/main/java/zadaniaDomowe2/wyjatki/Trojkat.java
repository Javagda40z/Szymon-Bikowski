package zadaniaDomowe2.wyjatki;

public class Trojkat {
    private int bokA;
    private int bokB;
    private int bokC;


    public Trojkat(int bokA, int bokB, int bokC) {
        if (bokA != 0 && bokB != 0 && bokC != 0) {
            if (bokA + bokB > bokC) {
                System.out.println("Rysuj trójkąt");
            } else if (bokA + bokC > bokB) {
                System.out.println("Rysuj trójkąt");
            } else if (bokB + bokC > bokA) {
                System.out.println("Rysuj trójkąt");
            }
        } else
            new TriangleException().run();
    }
}
