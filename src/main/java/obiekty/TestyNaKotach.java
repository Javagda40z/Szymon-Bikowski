package obiekty;

public class TestyNaKotach {
    public static void main(String[] args) {
        Cat filemon =  Cat.stworzKota("Filemon");

        System.out.println(filemon.getLicznikZlapanychKotow());
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        System.out.println(filemon.getLicznikZlapanychKotow());

        if ((czyPowinienDostacMleko(filemon))){
            System.out.println("Daj mleko kotu");
        }else
            System.out.println("Nie wystarczająco zjedzonych myszy");
    }

    public static boolean czyPowinienDostacMleko(Cat cat) {
        if (cat.getLicznikZlapanychKotow() > 10) {
            return true;
        } else
            return false;
    }
}
