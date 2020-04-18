package zadanieDomowe;

public class Modulo {

    public static void main(String[] args) {
        System.out.println("Własna: ");
        System.out.println(moduloWlasne(5, 3));
        System.out.println(moduloWlasne(100, 10));
        System.out.println(moduloWlasne(999, 21));
        System.out.println("Wbudowane: ");
        System.out.println(moduloWbudowane(5, 3));
        System.out.println(moduloWbudowane(100, 10));
        System.out.println(moduloWbudowane(999, 21));

    }

    private static int moduloWlasne(int a, int b) {
        int dzielenie = a / b;
        int mnozenie = dzielenie * b;
        int odejmowanie = a - mnozenie;
        return odejmowanie;
    }
    private static int moduloWbudowane(int a, int b){
        return a%b;
    }

}
