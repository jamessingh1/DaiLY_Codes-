public class Q {
    public static void main(String[] args) {
        Q queue = new Q();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(40);
        queue.enqueue(30);

        queue.show();
    }

    private Q(){
         int front = 0;
         int rear = -1;
         int[] arr = new int[4];
         int size = 0;
    }

    public void enqueue(int data){

    }

    public void show(){

    }
}
