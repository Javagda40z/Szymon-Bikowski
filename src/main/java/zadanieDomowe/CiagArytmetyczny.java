package zadanieDomowe;

public class CiagArytmetyczny {

    public static void main(String[] args) {
        stowrzCiag(5, 1, 1);
    }

    private static void stowrzCiag(int dlugosc, int pierwszyElement, int roznicaCiagu) {
        int[] tablica = new int[dlugosc];

        for (int i = 0; i < dlugosc; i++) {
            if (i == 0) {
                tablica[0] = pierwszyElement;
                System.out.println(tablica[i]);
            } else {
                tablica[i] = tablica[i - 1] + roznicaCiagu;
                System.out.println(tablica[i]);
            }
        }
    }
}
