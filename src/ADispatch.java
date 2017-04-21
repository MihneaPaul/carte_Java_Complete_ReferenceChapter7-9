/**
 * Created by Mihnea on 10.04.2017.
 */
public class ADispatch {
    void callme() {
        System.out.println("Inside A's callme() method");
    }
}

class BDispatch extends ADispatch {
    void callme() {
        System.out.println("Inside B's callme() method");
    }
}

class CDispatch extends BDispatch {
    void callme() {
        System.out.println("Inside C's callme() method");
    }
}

class Dispatch {
    public static void main(String[] args) {
        ADispatch a = new ADispatch();
        BDispatch b = new BDispatch();
        CDispatch c = new CDispatch();

        a.callme();
        b.callme();
        c.callme();

        System.out.println();

        ADispatch r;

        r=a;
        r.callme();

        r=b;
        r.callme();

        r=c;
        r.callme();
    }
}
