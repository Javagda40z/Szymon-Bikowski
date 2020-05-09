package powtorka.dziedziczenie;

public abstract class Zawodnik {
    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    private  int numer;
    private  String imie;

    public void biegaj(){
        System.out.println("biekgaj");
    }

    public abstract void kopnij();

}
