package enumy.calculator;

public class App {
    public static void main(String[] args) {
        double x = 10;
        double y = -5;

        System.out.println("Wynik odejmowania: " + Operation.MINUS.calculate(x, y));
        System.out.println("Wynik dodwania: " + Operation.PLUS.calculate(x, y));
        System.out.println("Wynik mnożenia: " + Operation.MNOŻENIE.calculate(x, y));
        System.out.println("Wynik dzielenia: " + Operation.DZIELENIE.calculate(x, y));

    }
}
