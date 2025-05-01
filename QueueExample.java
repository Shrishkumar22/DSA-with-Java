public class QueueExample {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public QueueExample(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value){
        if (size == capacity){
            System.out.println("Queue is full");
        }
        rear = rear+1;
        array[rear]=value;
        size++;
    }

    public int dequeue(){
        if(size==0){
            System.out.println("Queue is Empty");
        }
        int remitem = array[front];
        front = front + 1;
        size-- ;
        return remitem;
    }

    
}
