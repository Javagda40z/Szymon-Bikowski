package util;

import java.util.concurrent.ThreadLocalRandom;

public class KalkulatorUtil {

    public static int randomBetween(int min, int max) {
        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        return localRandom.nextInt(min, max);
    }

}
