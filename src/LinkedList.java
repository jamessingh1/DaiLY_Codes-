class node{
    int data;
    node next;// (reference = next);

    public node(int data){//constructor
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    node head = null;

    public void add(int data) {
        node newNode = new node(data);

        node current = head;
        if (head == null)
            head = newNode;

        else {
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}



