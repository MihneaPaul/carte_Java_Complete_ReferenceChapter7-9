/**
 * Created by Mihnea on 10.04.2017.
 */
public class BigBox {
    double h;
    double l;
    double Lu;
    double volume;

    public BigBox(double h, double l, double Lu) {
        this.h = h;
        this.l = l;
        this.Lu = Lu;
    }

    public BigBox() {
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getLu() {
        return Lu;
    }

    public void setLu(double lu) {
        Lu = lu;
    }

    double volume() {
        System.out.println("Below is the volume of the Box");
        volume = l*h*Lu;
        return volume;
    }
}

class ComputeVolume {
    public static void main(String[] args) {
        BigBox box1 = new BigBox(1, 2, 3);
        BigBox box2 = new BigBox(4, 5, 6);
        BigBox box3 = new BigBox();

        box3.setH(10);
        box3.setL(11);
        box3.setLu(12);

        System.out.println("Box 1 volume: "+box1.volume());
        System.out.println("Box 2 volume: "+box2.volume());
        System.out.println("Box 3 volume: "+box3.volume());
        System.out.println();

        box2.setLu(1);
        System.out.println("Box 2 volume is now: "+box2.volume());
        System.out.println(box2.getH()+" "+box2.getL()+" "+box2.getLu());
    }
}

