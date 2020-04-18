package zadanieDomowe;

import java.util.Arrays;
import java.util.Scanner;

public class Gwiazdki {
    private static String a;
    private static String b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        a = scanner.nextLine();
        System.out.println("Podaj drugą liczbę: ");
        b = scanner.nextLine();
        wyswietl(rysuj(Integer.parseInt(a),Integer.parseInt(b)));
    }

    private static char[][] rysuj(int a, int b) {
        char[][] tablica = new char[a][b];
        for (int i = 0; i < tablica.length - 1; i++) {
            for (int j = 0; j < tablica.length - 1; j++) {
                tablica[i][j] = '*';
            }
        }
        return tablica;
    }

    private static void wyswietl(char[][] tablica) {
        for (char[] i : tablica) {
            System.out.println("");
            for (char j : i) {
                System.out.print("*");
            }
        }
    }
}
