package doTestow;

public class Power {
    public long powValues(int value, int pow) {
        if (pow < 0){
            throw new IllegalArgumentException();
        }

        long result = 1;

        for (int i = 0; i < pow ; i++) {
            result *= value;
        }
        return result;
    }
}
