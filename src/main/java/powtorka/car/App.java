package powtorka.car;

public class App {

    public static void main(String[] args) {

        Car car = new Car("Audi","80");
        Car car2 = new Car("Ford","Mondeo");

        System.out.println(car.description());
        System.out.println(car2.description());
        System.out.println(car.getBrand());

        Car[] cars = new Car[2];
        cars[0] = car;
        cars[1] = car2;

        for (Car auto : cars) {
            System.out.println(auto.description());
        }
    }
}
