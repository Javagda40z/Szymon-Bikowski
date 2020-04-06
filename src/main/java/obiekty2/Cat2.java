package obiekty2;

public class Cat2 extends Animal2 {

    public Cat2(String imie) {
        super(imie);
    }

    @Override
    void makeSound() {
        System.out.println("Miau!");
    }

    @Override
    public void move() {
        System.out.println("Chodzę");
    }

}