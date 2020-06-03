package kolekjcje;

import java.util.Comparator;

public class GraczComparator implements Comparator<Gracz> {


    @Override
    public int compare(Gracz gracz, Gracz gracz1) {
        return gracz.getImie().compareTo(gracz1.getImie());
    }
}
