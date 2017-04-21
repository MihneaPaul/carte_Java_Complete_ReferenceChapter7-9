/**
 * Created by Mihnea on 11.04.2017.
 */
 abstract class AnotherFigure {
    double dim1;
    double dim2;

    AnotherFigure(double a, double b) {
        dim1=a;
        dim2=b;
    }
    abstract double area();
}

class Rectangle1 extends AnotherFigure {
    Rectangle1(double a, double b) {
        super(a,b);
    }
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1*dim2;
    }
}

class Triangle1 extends AnotherFigure {
    Triangle1(double a, double b) {
        super(a,b);
    }
    double area() {
        System.out.println("Inside Area for Triange.");
        return dim1*dim2/2;
    }
}

class AbstractAreas {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(9,5);
        Triangle1 t = new Triangle1(10,8);
        AnotherFigure figref;

        figref = r;
        System.out.println("Area is "+figref.area());
        figref = t;
        System.out.println("Area is "+figref.area());
    }
}