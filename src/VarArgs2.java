/**
 * Created by Mihnea on 10.04.2017.
 */
public class VarArgs2 {
    static void vaTest(String msg, int...v){
        System.out.print(msg+" length is "+v.length+", contains: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
            System.out.println();

    }

    public static void main(String[] args) {
        vaTest("One VarArg: ",8);
        vaTest("Three VarArgs: ",1,2,3);
        vaTest("No VarArgs: ");
    }
}
