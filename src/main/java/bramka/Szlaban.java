package bramka;

import pojazd.Pojazd;

public interface Szlaban {
    void wjazd(Pojazd pojazd);

    void wyjazd(Pojazd pojazd, int zaplata);
}
