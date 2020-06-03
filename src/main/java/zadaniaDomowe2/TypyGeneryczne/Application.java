package zadaniaDomowe2.TypyGeneryczne;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {


        List<Przedmiot> przedmioty = new ArrayList<>();
        Pojemnik pojemnik = new Pojemnik("przedmioty");
        Przedmiot kwadrat = new Przedmiot();
        Przedmiot puzzle = new Przedmiot();
        Przedmiot wegorz = new Przedmiot();

        kwadrat.setId(0);
        kwadrat.setNazwaPrzedmiotu("Kwadrat");
        przedmioty.add(kwadrat);
        puzzle.setId(1);
        puzzle.setNazwaPrzedmiotu("Puzzle");
        przedmioty.add(puzzle);
        wegorz.setId(2);
        wegorz.setNazwaPrzedmiotu("Węgorz");
        przedmioty.add(wegorz);
        pojemnik.setPrzedmioty(przedmioty);

        przedmioty.forEach(przedmiot1 -> System.out.println(przedmiot1.getNazwaPrzedmiotu()));

    }
}
