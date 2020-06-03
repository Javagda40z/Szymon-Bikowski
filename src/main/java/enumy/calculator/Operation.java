package enumy.calculator;

public enum Operation {
    PLUS, MINUS, MNOŻENIE, DZIELENIE, DODATKOWA_OPERACJA;

    double calculate(double x, double y) {

        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case MNOŻENIE:
                return x * y;
            case DZIELENIE:
                if (y != 0) {
                    return x / y;
                } else
                    throw new AssertionError("Nie można dzielić przez zero");
            default:
                throw new AssertionError("Nieznana operacja" + this);
        }
    }
}
