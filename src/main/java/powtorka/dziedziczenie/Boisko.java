package powtorka.dziedziczenie;

import java.util.Arrays;
import java.util.List;

public class Boisko {
    public static void main(String[] args) {
        Bramkarz bramkarz = new Bramkarz();
        Pilkarz pilkarz = new Pilkarz();

        Zawodnik bramkarz1 = new Bramkarz();
        Zawodnik pilkarz1 = new Pilkarz();

        bramkarz.kopnij();
        pilkarz.kopnij();

        Sprinter bramkarzSprinter = new Bramkarz();
        Sprinter pilkarzSprinter = new Pilkarz();

        nieWszyscySprinterzyBiegajaSprintem(Arrays.asList(bramkarzSprinter,pilkarzSprinter));

    }

    public static void nieWszyscySprinterzyBiegajaSprintem(List<Sprinter> sprinterList){
        for (Sprinter sprinter:sprinterList){
            sprinter.sprint();
        }
    }
}
