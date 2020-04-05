package obiekty;

public class Vet {

    public void sayHello(Cat cat) {

        System.out.println("Witaj: " + cat.getImie());

    }

    public void sayHello(Dog dog) {

        System.out.println("Witaj: " + dog.getImie());

    }

    public static void main(String[] args) {
        Cat kot = new Cat("Filemon");
        Dog pies = new Dog("Niko");
        Vet weterynarz = new Vet();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);
    }

}
