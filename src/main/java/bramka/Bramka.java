package bramka;

import pojazd.Pojazd;

public class Bramka implements Szlaban {

    private final Raport raport;
    private RejestrPojazdow rejestrPojazdow;
    private KalkulatorOplat kalkulatorOplat;

    public Bramka(RejestrPojazdow rejestrPojazdow) {
        this.rejestrPojazdow = rejestrPojazdow;
        raport= new Raport();
    }

    @Override
    public void wjazd(Pojazd pojazd) {
        boolean czyWjechal = rejestrPojazdow.wpisz(pojazd);
        if (!czyWjechal) {
            zawolajPomoc(pojazd);
        } else {

            System.out.println("Pojazd o nr rejestracyjnym " + pojazd.getRejestracja() + " wjechał na parking");
        }
    }

    private void zawolajPomoc(Pojazd pojazd) {
        System.out.println("Wolam pomoc dla pojazdu: " + pojazd.getRejestracja());
    }

    @Override
    public void wyjazd(Pojazd pojazd, int zaplata) {
        Wjazd wjazd = rejestrPojazdow.wypisz(pojazd);
        int koszt = kalkulatorOplat.policz(wjazd);

        if (koszt > zaplata) {
            zawolajPomoc(pojazd);
        }

        raport.dodajPojazd(pojazd.getTyp());
        raport.dodajKase(zaplata);
        raport.dodajKoszt(koszt);

        System.out.println("Wyjeżdża pojazd o nr rejestracyjnym; " + wjazd.getPojazd().getRejestracja()
                + " zapłacono: " + zaplata + " a koszt to: " + koszt);
    }

    public void setKalkulatorOplat(KalkulatorOplat kalkulatorOplat) {
        this.kalkulatorOplat = kalkulatorOplat;
    }

    public Raport przygottujRaport(){
        return raport;
    }
}