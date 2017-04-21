/**
 * Created by Mihnea on 10.04.2017.
 */
public class Outer {
    static int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.test();
        inner.display();
    }

    static class Inner {
        public void test() {
            System.out.println("Testing the inner class...");
            System.out.println();
            System.out.println("--------------------------");
            System.out.println();
        }

        void display(){
            System.out.println("display: outer_x = "+outer_x);
        }
    }
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}