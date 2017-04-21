/**
 * Created by Mihnea on 16.04.2017.
 */
interface HasTail {
    int getTailLength();
}
abstract class Puma implements HasTail {
     public int getTailLength() {
        return 4;
    }
}
public class Cougar {
    public static void main(String[] args) {
        Cougar cougar = new Cougar();
        System.out.println(cougar.getTailLength(4));
    }
    public int getTailLength(int length) {
        return 2;
    }
}
