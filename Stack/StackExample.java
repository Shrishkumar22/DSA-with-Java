package Stack;
public class StackExample{
    private int maxsize;
    private int top;
    private int[] stackArr;

    public StackExample(int size){
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
        StackExample newobj = new StackExample(5);

        newobj.push(10);
        // newobj.pop();

        System.out.println("The top of the stack is " + newobj.top());
    }
}