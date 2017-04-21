/**
 * Created by Mihnea on 10.04.2017.
 */
public class SuperSuper {
    int i;
    int j=8;
}

class SubSuper extends SuperSuper {
    int i = 2;
    int j = 3;
    SubSuper(int a, int b) {
        super.i = a;
        this.i = b;
        j = b;
    }

    void show() {
        System.out.println("i in superclass: "+super.i);
        System.out.println("i in subclass is "+i);
        System.out.println("j is "+j);
        System.out.println("this.j is "+this.j);
        System.out.println("super.j is "+super.j);
    }
}
 class UseSuper {
     public static void main(String[] args) {
         SubSuper obj = new SubSuper(1,2);
         obj.show();
     }
 }