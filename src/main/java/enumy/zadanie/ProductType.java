package enumy.zadanie;

public enum ProductType {
    OWOCE("owoce",123), WARZYWA("warzywa",124), MIESO("mieso", 125);

    public String getOwoce() {
        return owoce;
    }

    public int getCode() {
        return code;
    }

    private String owoce;
    private int code;

    ProductType(String owoce, int code){
        this.owoce = owoce;
        this.code = code;
    }
}
