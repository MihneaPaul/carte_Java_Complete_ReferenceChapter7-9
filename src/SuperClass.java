/**
 * Created by Mihnea on 10.04.2017.
 */
public class SuperClass {
    int i,j;

    void showij(){
        System.out.println("i and j: "+i+" "+j);
    }
}

class SubClass extends SuperClass {
    int k;

    void showk() {
        System.out.println("k: "+k);
    }
    void sum() {
        System.out.println("i+h+k = "+(i+j+k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        SuperClass superObject = new SuperClass();
        SubClass subObject = new SubClass();

        // The superclass may be used by itself.
        superObject.i = 10;
        superObject.j = 20;
        System.out.println("Contents of superObject: ");
        superObject.showij();
        System.out.println();

        // Subclass has acces to all public members of its superclass.
        subObject.i = 7;
        subObject.j = 8;
        subObject.k = 9;
        System.out.println("Contents of subObject: ");
        subObject.showij();
        subObject.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subObject: ");
        subObject.sum();

    }
}
