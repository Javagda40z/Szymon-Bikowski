package obiekty;

public class Dog implements Animal {
    public void aportuj() {
        //pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("Hau Hau!");
    }
}
