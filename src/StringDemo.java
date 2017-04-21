/**
 * Created by Mihnea on 10.04.2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        String myString = "This is a test";
        System.out.println(myString);
        System.out.println();
        String myString2 = ", probably.";
        String myString3 = myString+myString2;
        System.out.println(myString3);
        System.out.println("Length of myString: "+myString.length());
        System.out.println("Char at index 3 in myString: "+myString.charAt(3));
    }
}
