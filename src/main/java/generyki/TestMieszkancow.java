package generyki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMieszkancow {
    public static void main(String[] args) {
        Miasto miasto = new Miasto("?");
        List<Mieszkaniec> mieszkaniecList = new ArrayList<>();
        Mieszkaniec mieszkaniec = new Mieszkaniec();
        mieszkaniec.setId(1);
        mieszkaniec.setImie("Mateusz");
        Mieszkaniec mieszkaniec1 = new Mieszkaniec();
        mieszkaniec1.setId(2);
        mieszkaniec1.setImie("Adam");
        mieszkaniecList.add(mieszkaniec);
        mieszkaniecList.add(mieszkaniec1);
        miasto.setMieszkancy(mieszkaniecList);

        Gdanszczanin gdanszczanin = new Gdanszczanin();
        mieszkaniecList.add(gdanszczanin);

        Miasto<Gdanszczanin> gdansk = new Miasto<Gdanszczanin>("Gdańsk");
        Miasto<Gdynianin> gdynia = new Miasto<Gdynianin>("Gdynia");

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(1.3);

        System.out.println(sum(doubles));

        List<Integer> integers = Arrays.asList(1,2,3,4);

        System.out.println(sum(integers));
    }

    private static double sum(List<? extends Number> doubles){           //<?> wilde card przyjmuje każdy typ
        double sum = 0.0;
        for (Number liczba : doubles) {
            sum+=liczba.doubleValue();
        }
        return sum;
    }


}
