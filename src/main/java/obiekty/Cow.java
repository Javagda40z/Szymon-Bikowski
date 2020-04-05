package obiekty;

public class Cow implements Animal {
    public void dajMaleko() {
        //krowa daje mleko
    }

    @Override
    public void makeSound() {
        System.out.println("muuuu!");
    }

    @Override
    public void move() {
        System.out.println("Chodzi");
    }
}
