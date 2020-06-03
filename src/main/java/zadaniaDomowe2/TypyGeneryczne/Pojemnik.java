package zadaniaDomowe2.TypyGeneryczne;

import java.util.List;

public class Pojemnik<T extends Przedmiot> {

    private String nazwa;
    private List<T> przedmioty;

    public Pojemnik(List<T> przedmioty) {
        this.przedmioty = przedmioty;
    }

    public void setPrzedmioty(List<T> przedmioty) {
        this.przedmioty = przedmioty;
    }

    public Pojemnik(String nazwa) {
        this.nazwa = nazwa;
    }
}
