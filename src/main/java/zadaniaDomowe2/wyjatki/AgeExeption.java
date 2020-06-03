package zadaniaDomowe2.wyjatki;

public class AgeExeption extends Thread {

    @Override
    public void run() {
        System.out.println("Jesteś nie pełnoletni!!");
    }
}
