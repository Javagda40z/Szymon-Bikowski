package zadaniaDomowe2.wypozyczalniaSamochodow;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Wyszukaj {
    private double cenaOd = 0;
    private double cenaDo = 0;
    private double spalanieOd = 0;
    private double spalanieDo = 0;
    private TypPojazdu typPojazu = TypPojazdu.BRAK;
    private List<Pojazd> wypzyczalnia = BazaPojazdow.getWypozyczalnia();

    public Wyszukaj() {

        Scanner scanner = new Scanner(System.in);
        int sc;
        do {
            System.out.println("Wybierz kryteria wyszukiwania");
            System.out.println("1: Cena");
            System.out.println("2: Spalanie");
            System.out.println("3: Typ pojazdu");
            System.out.println("4: Szukaj");
            System.out.println("5: Wyjdź");

            sc = scanner.nextInt();
            switch (sc) {
                case 1:
                    System.out.println("Cena od: ");
                    this.cenaOd = scanner.nextDouble();
                    System.out.println("Cena do: ");
                    this.cenaDo = scanner.nextDouble();
                    continue;
                case 2:
                    System.out.println("Spalanie od: ");
                    this.spalanieOd = scanner.nextDouble();
                    System.out.println("Spalanie do: ");
                    this.spalanieDo = scanner.nextDouble();
                    continue;
                case 3:
                    System.out.println("Typ pojazdu: ");
                    typPojazu = TypPojazdu.valueOf(scanner.next().toLowerCase());
                    continue;
                case 4:
                    szukaj();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Podałes niepoprawną wartość");
            }

        } while (sc == 5);
    }

    private void szukaj() {
        List<Pojazd> pojazd = BazaPojazdow.znajdzPojazdWeslugKryteriow(p -> {
            return (p.getCena() > this.cenaDo) &&
                    (p.getCena() < this.cenaDo) &&
                    (p.getSpalanie() > this.spalanieOd) &&
                    (p.getSpalanie() < this.spalanieDo) &&
                    p.getTypPojazdu().equals(this.typPojazu);
        });


    }
}
