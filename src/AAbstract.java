/**
 * Created by Mihnea on 11.04.2017.
 */
public abstract class AAbstract {
//    abstract void callme();

    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}
class Babstract extends AAbstract {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Babstract b = new Babstract();

        b.callme();
        b.callmetoo();
    }
}
