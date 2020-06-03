package zadaniaDomowe2.wyjatki;

public class App {
    private static int a = 5;
    protected static int b = 0;

    public static void main(String[] args) {
        int wiek = 18;
        CzyPelnoletni czyPelnoletni = new CzyPelnoletni(wiek);
        Trojkat trojkat = new Trojkat(1, 1, 1);

        System.out.println(dziel(a, b));
    }

    private static double dziel(int a, int b) {
        if (b != 0) {
            return a / b;
        } else
            throw new IllegalArgumentException("Nie można dzielić przez 0");
    }


}
