package zadaniaDomowe2.wyjatki;

public class TriangleException extends Thread {
    @Override
    public void run() {
        System.out.println("Nie można utworzyć trójkąta");
    }
}
