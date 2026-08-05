public class stack {
    public static void main(String[] args) {
        stack nums = new stack();
        nums.push(100);
        nums.push(20);
        nums.push(10);
        nums.push(20);

        nums.printout();
    }
    private int[] arr = new int[5];
    int top;
    int size;

    public stack(){
        size = arr.length;
        top = -1;
    }

    public void push(int data) {
        top++;
        arr[top] = data;
    }

    public void printout(){
        for(int n : arr){ //Enhanced (For Loop)
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
