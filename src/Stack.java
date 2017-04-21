/**
 * Created by Mihnea on 10.04.2017.
 */
public class Stack {
    private int stck[];
    private int tos;

    // allocate and initialize stack
    Stack(int size){
        stck = new int[size];
        tos=-1;
    }

    // Push item onto the stack
    void push(int item){
        if(tos==stck.length)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    // Pop an item from the stack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else return stck[--tos];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        // push some numbers onto the stack
        for(int i=0;i<5;i++) mystack1.push(i);
        for(int j=0;j<8;j++) mystack2.push(j);

        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for(int i=0;i<5;i++) System.out.println(mystack1.pop());

        for(int j=0;j<8;j++) System.out.println(mystack2.pop());
    }
}
