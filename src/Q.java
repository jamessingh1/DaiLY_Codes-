public class Q {
    public static void main(String[] args) {
        Q queue = new Q();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        queue.enqueue(30);
        queue.enqueue(80);
        queue.enqueue(100);
        queue.enqueue(120);

        queue.show();
    }
        private int front = 0;
        private int rear = -1;
        private int[] arr = new int[4];
        private int size = 0;


    public void enqueue(int data){
        if (size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) %4;
        arr[rear] = data;
        size++;
    }

    public int dequeue(){
        if (size == 0){
            System.out.println("Queue is empty");
            return 0;
        }
        int data = arr[front];
        front = (front + 1) %4;
        size--;
        return data;
    }

    public void show(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[(front + i) % 4] + " ");
        }
        return 0
    }
}
