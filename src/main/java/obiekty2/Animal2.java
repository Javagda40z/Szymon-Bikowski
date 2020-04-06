
package obiekty2;

import obiekty.Movable;

// Animal2 zeby zaoszczedzic czas na tworzeniu nowego projektu
public abstract class Animal2 implements Movable {

    private String imie;

    public Animal2(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    abstract void makeSound();

}