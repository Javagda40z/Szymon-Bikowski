package funkcyjne;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        Czlowiek czlowiek = new Czlowiek(20, "Mateusz");
        Czlowiek czlowiek1 = new Czlowiek(15, "Adam");
        Czlowiek czlowiek2 = new Czlowiek(19, "JakiesImie");


        Checker checker = czl -> {
            return true;
        };

        List<Czlowiek> czlowieki = Arrays.asList(czlowiek, czlowiek1, czlowiek2);
        drukuj(czlowieki, czl -> {
            return czl.getAge() >= 18;
        });


        czlowieki.stream()
                .filter(p -> p.getAge() >= 18)
                .filter(p -> p.getAge() < 30).map(p-> p.getImie());


//                .forEach(p -> System.out.println(p));


        // a -> {  }

    }


    public static void drukuj(List<Czlowiek> czlowieki, Predicate<Czlowiek> checker) {
        for (Czlowiek czlowiek : czlowieki) {
            if (checker.test(czlowiek)) {
                System.out.println(czlowiek.getImie());
            }
        }

    }


}
