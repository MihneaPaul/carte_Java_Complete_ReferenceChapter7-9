/**
 * Created by Mihnea on 10.04.2017.
 */
public class VarArgs3 {

    static void vaTest(int...v) {
        System.out.print("vaTest(int...): " + "Number of args: " + v.length+", contains: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

        static void vaTest(boolean...v){
        System.out.print("vaTest(boolean...): "+ "Number of args: "+v.length+", contains: ");
        for(boolean x : v){
            System.out.print(x+" ");
    }
            System.out.println();
    }

    static void vaTest(String msg, int...v){
        System.out.print("vaTest(String, int...): "+msg+ "Number of args: "+v.length+", contains: ");
        for(int x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3,4);
        vaTest(true,false,false);
        vaTest("Testing Strings: ",10,20,30,40);
    }
}
