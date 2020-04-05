package zmienne;

public class Application {
    public static void main(String[] args) {
        int i = 5;
        double d = 5.1;
        float f = 10;

        System.out.println(dodaj(5,5));
        System.out.println(odejmij(10,2));
        System.out.println(pomoz(5,5));
        System.out.println(podziel(3,2));


    }

    public static int dodaj(int a, int b) {

        return a+b;
    }

    public static int odejmij(int a, int b) {

        return a-b;
    }

    public static int pomoz(int a, int b) {

        return a*b;
    }

    public static double podziel(int a, int b) {

        return a/b;
    }
}
