package zadaniaDomowe2.TypyGeneryczne;

import java.util.List;

public class Walizka<T extends Ubrania> {

    private String nazwaListy;
    private List<T> ubrania;

    public Walizka(List<T> ubrania) {
        this.ubrania = ubrania;
    }

    public void setUbrania(List<T> ubrania) {
        this.ubrania = ubrania;
    }

    public Walizka(String nazwaListy) {
        this.nazwaListy = nazwaListy;
    }
}
