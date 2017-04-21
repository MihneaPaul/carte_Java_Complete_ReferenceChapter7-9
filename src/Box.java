/**
 * Created by Mihnea on 10.04.2017.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Box(Box obj) { // pass object to constructor
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // constructor used when all dimension specified
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor used when no dimensions specified {
    Box(){ // indicate an uninitialized Box
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor when cube is created
    Box(double len){
        width=height=depth=len;
    }

    // compute and return volume
    double volume(){
        return width*height*depth;
    }
}

// Here, Box is extended to include weight
class BoxWeight extends Box {
    double weight;

    // construct clone of an object
    BoxWeight(BoxWeight obj) { // pass object to constructor
        super(obj);
        weight = obj.weight;
    }
    // constructor for BoxWeight
    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    // constructor used when cube is created
    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    // default constructor
    BoxWeight() {
        super();
        weight=-1;
    }
}

class Shipment extends BoxWeight {
    double cost;

    // construct clone of object
    Shipment(Shipment obj) {
        super(obj);
        cost = obj.cost;
    }

    // constructor when all parameters are specified
    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width,height,depth,weight);
        this.cost = cost;
    }

    // constructor used when cube is created
    Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }

    // default constructor
    Shipment(){
        super();
        cost = -1;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of 1st shipment is "+vol);
        System.out.println("Weight of 1st shipment is "+shipment1.weight);
        System.out.println("Shipping cost of 1st shipment is $"+shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of 2nd shipment is "+vol);
        System.out.println("Weight of 2nd shipment is "+shipment2.weight);
        System.out.println("Shipping cost of 2nd shipment is $"+shipment2.cost);
        System.out.println();
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight myBox3 = new BoxWeight(); //default
        BoxWeight myCube = new BoxWeight(3,2);
        BoxWeight myClone = new BoxWeight(myBox1);


        double vol;

        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is "+vol);
        System.out.println("Weight of weightbox is "+weightbox.weight);
        System.out.println();

        // assign BoxWeight reference to Box reference
        plainbox = weightbox;

        vol = plainbox.volume(); //OK, volume() is defined in Box
        System.out.println("Volume of plainbox is "+vol);
        System.out.println();

        // plainbox.weight is INVALID because plainbox does not define a weight member.

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is "+vol);
        System.out.println("Weight of myBox1 is "+myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is "+vol);
        System.out.println("Weight of myBox2 is "+myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is "+vol);
        System.out.println("Weight of myBox3 is "+myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume of myClone is "+vol);
        System.out.println("Weight of myClone is "+myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume of myCube is "+vol);
        System.out.println("Weight of myCube is "+myCube.weight);
        System.out.println();
    }
}
