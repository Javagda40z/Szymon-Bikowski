package zadanieDomowe.koszyk;

public class App {
    public static void main(String[] args) {
        Rachunek.dodajProdukt("Banany",10.00f);
        Rachunek.dodajProdukt("Mąka",5.50f);
        Rachunek.dodajProdukt("Mleko",2.30f);
        Rachunek.dodajProdukt("Chipsy",5.20f);
        Rachunek.pokarzKoszyk();
    }
}
