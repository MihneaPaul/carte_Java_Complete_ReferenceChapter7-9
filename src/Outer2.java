/**
 * Created by Mihnea on 10.04.2017.
 */
public class Outer2 {
    int outer_x=10;

    void test2(){
        for (int i=0;i<11;i++){
            class Inner2 {
                void display2(){
                    System.out.println("Display: "+outer_x);
                    outer_x--;
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display2();
        }
    }
}
class Inner2ClassDemo {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.test2();
    }
}
