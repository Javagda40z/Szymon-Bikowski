package zadaniaDomowe2.wyjatki;

public class CzyPelnoletni {

    private int wiek;

    public CzyPelnoletni(int wiek) {
        this.wiek = wiek;
        if (wiek >= 18) {
            System.out.println("Jestes pełnoletni");
        } else
            new AgeExeption();
    }
}
