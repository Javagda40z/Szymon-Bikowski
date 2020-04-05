package obiekty;

public class Cat implements Animal {

    private static int licznikKotow = 0;
    private int licznikZlapanychKotow = 0;
    private String imie;

    public int getLicznikZlapanychKotow() {
        return licznikZlapanychKotow;
    }

    public static Cat stworzKota(String imie) {
        Cat kot = new Cat(imie);
        return kot;
    }

    public Cat(String imie) {
        this.imie = imie;
    }

    public Cat() {
        this("Standardowe imię");  //wywołanie metody w metodzie
    }

    public String getImie() {
        return imie;
    }

    public void drap() {
        //kot drapie
    }

    public void eatMouse() {
        licznikZlapanychKotow++;
        System.out.println("Zjdałem " + licznikZlapanychKotow + " myszy");
    }

    @Override
    public void makeSound() {
        System.out.println("miau");
    }


    @Override
    public void move() {
        System.out.println("chodzi");
    }
}
