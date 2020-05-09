package wyjatki.zadanie;

public class Test {

    public static void main(String[] args) {
        Shop shop = new Shop(2);
        Person pelnoletnia = new Person(20);
        Person malolat = new Person(15);

        try {
            shop.sellVodka(pelnoletnia);
            shop.sellVodka(malolat);
            shop.sellVodka(pelnoletnia);
            shop.sellVodka(pelnoletnia);
        } catch (InvalidAgeException e) {
            System.out.println("Wykop ze sklepu");
        } catch (NoVodkaException e) {
            System.out.println("Przepraszam, dostawa niedługo");
        }
    }
}
