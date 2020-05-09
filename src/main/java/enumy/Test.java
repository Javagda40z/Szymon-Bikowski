package enumy;

public class Test {
    public static void main(String[] args) {
        Koszulka koszulka = new Koszulka();
        koszulka.setRozmiar(Rozmiar.L);

        for (Rozmiar value : Rozmiar.values()) {
            System.out.println("Rozmiar dla: " + value);
            System.out.println("to: " + value.getDlugosc() + "x" + value.getSzerokosc());
        }
    }

}
