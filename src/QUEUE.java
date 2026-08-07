public class QUEUE {
    // SIMPLE QUEUE afterward Ciricular Queue not accurate right now
    public static void main(String[] args) {
        QUEUE queue = new QUEUE();
         queue.enqueue(10);
         queue.enqueue(35);
         queue.enqueue(90);
         queue.enqueue(90);
         //queue.enqueue(9);

        System.out.println(queue.dequeue());


         queue.show();
    }


    public class queue{
        int data;
    }

    private int front = 0;
    private int rear = -1; //rear size will always be -1 in Queue;
    private int size = 0;
    private int[] arr = new int[4];

    //-------- Enqueue ------------

    public void enqueue(int data){
        rear++;
        arr[rear] = data;
        size++;
    }

    //--------- Dequeue --------------
    // dequeue will always be int be it value it will return;
    // In queue it follows FIFO Pattern mind it babuaaa!!
    public int dequeue(){
        int data = arr[front];
        front++;
        return data;
    }

    public void show(){
        for(int i = front; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
