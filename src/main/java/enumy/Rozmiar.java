package enumy;

public enum Rozmiar {
    S(50,100),M(55,110),L(60,120),XL(100,200);

    private int dlugosc;
    private int szerokosc;

    Rozmiar(int dlugosc, int szerokosc){
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

      public int getSzerokosc() {
        return szerokosc;
    }


}
