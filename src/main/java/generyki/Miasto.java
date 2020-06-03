package generyki;

import java.util.List;

public class Miasto<T extends Mieszkaniec> {

    private String nazwa;
    private List<T> mieszkancy;

    public void setMieszkancy(List<T> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public Miasto(List<T> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public T znajdzMieszkancaPoImieniu(String imie) {
        for (T mieszkaniec : mieszkancy) {
            if (mieszkaniec.getImie().equals(imie)) {
                return mieszkaniec;
            }
        }
        return null;
    }

    public Miasto(String nazwa) {
        this.nazwa = nazwa;
    }
}
