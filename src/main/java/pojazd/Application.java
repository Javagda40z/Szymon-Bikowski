package pojazd;

import bramka.Bramka;
import bramka.KalkulatorOplat;
import bramka.Raport;
import bramka.RejestrPojazdow;

public class Application{
    //Sprawdzenie czy jest miejsce
    //Sprawdzenie popranowści rejestracji - statyczna metoda np. klasa w utilu
    //Stworzenie nowego kalkulatora opłat
    //Nie pozwalać na podmiane kalkulatora jeżeli ktoś jest na parkingu
    //Stosować stary kalkulator do pojazdów które wjechały przed podmianą
    //Zmiana opłat w zależności od godziny
    //Zmiana opłat w zależności od paliwa
    //Wydawanie reszty
    //Wzywanie policjii
    //Tworzyć pdf raportu albo wsysyłać maila
    //Ile samochodów wjechało ile wyjechało -> raport

    public static void main(String[] args) {
        RejestrPojazdow rejestrPojazdow = new RejestrPojazdow();
        Bramka bramka=new Bramka(rejestrPojazdow);
        bramka.setKalkulatorOplat(new KalkulatorOplat());

        Motocykl motocykl = new Motocykl("GD12345",Paliwo.PB);
        Samochod samochod = new Samochod("GD54321",Paliwo.ON);
        Autobus autobus = new Autobus("GD59321",Paliwo.PB);

        bramka.wjazd(motocykl);
        bramka.wjazd(samochod);
        bramka.wjazd(autobus);

        bramka.wyjazd(samochod,10);
        bramka.wyjazd(autobus,100);


//        bramka.wjazd(motocykl);
//        bramka.wjazd(samochod);

        Raport raport = bramka.przygottujRaport();

        raport.wyswietl(); //Raczej powinna byc klasa osobana do wyswietlania raportu
    }
}
