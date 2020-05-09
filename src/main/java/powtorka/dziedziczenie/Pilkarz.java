package powtorka.dziedziczenie;

public class Pilkarz extends Zawodnik implements Sprinter {
    public void strzelajbramke(){
        System.out.println("Strzał");
    }
    @Override
    public void biegaj() {

    }

    @Override
    public void kopnij() {
        System.out.println("Podaj");
    }

    @Override
    public void sprint() {

    }
}
