package Stack;
public class Stack_Static{
    private int maxsize;
    private int top;
    private int[] stackArr;

    public Stack_Static(int size){
        maxsize = size;
        stackArr = new int[maxsize];
        top = -1;
    }

    public void push(int value){
        if(top == maxsize-1){
            System.out.println("Stack overflow");
        }
        stackArr[++top]=value;
        System.out.println(value + " Added to the stack");
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedele = stackArr[--top];
        return poppedele;
    }

    public boolean is_empty(){
        return (top == -1);
    }

    public int top(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArr[top];
    }

    public static void main(String[] args){
        Stack_Static newobj = new Stack_Static(5);

        newobj.push(10);
        // newobj.pop();

        System.out.println("The top of the stack is " + newobj.top());
    }
}