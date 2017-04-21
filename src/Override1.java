/**
 * Created by Mihnea on 10.04.2017.
 */
public class Override1 {
    int i, j;

    Override1(int a, int b) {
        i=a;
        j=b;
    }

    void show(int a, int b) {
        i=a;
        j=b;
        System.out.println("i and j: "+i+" "+j);
    }
}

class SubOverride1 extends Override1 {
    int k;

    SubOverride1(int a, int b, int c) {
        super(a,b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override {
    public static void main(String[] args) {
        SubOverride1 subObj = new SubOverride1(1,2,3);
        Override1 superObj = new Override1(7,8);
        subObj.show("This is k: "); // this calls show() in subclass
        subObj.show(0,1); // this calls show() in superclass
        superObj.show(123,345); // can call only show() from superclass

    }
}
