package powtorka.dziedziczenie;

public class Bramkarz extends Zawodnik implements Sprinter{
    public void bron(){
        System.out.println("Bronie!");
    }

    @Override
    public void biegaj() {
        super.biegaj();
    }

    @Override
    public void kopnij() {
        System.out.println("wykop");
    }

    @Override
    public void sprint() {
        System.out.println("Mocny sprint");

    }
}
