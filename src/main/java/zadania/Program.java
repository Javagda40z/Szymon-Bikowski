package zadania;

public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        program.tabliczkaMnozenia(5);
        System.out.println(sumaLiczb(1,5));

    }

    public void tabliczkaMnozenia(int liczba) {
        for (int i = 1; i < liczba; i++) {
            System.out.println(liczba + "x" + i + "=" + liczba + i);
        }

    }

    public static int sumaLiczb(int x, int y) {
        int suma = 0;
        for (int i = x; i < y; i++) {
            suma = suma + i;
        }
        return suma;
    }

    // Napisz funkcję, która dla zadanych dwóch parametrów X i Y policzy sumę wszystkich liczb od X do Y
    public int silnia(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * silnia(a - 1);
    }
}
