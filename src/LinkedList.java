class node{
    int data;
    node next;// (reference = next);

    public node(int data){//constructor
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    
    public void add(int data){
        node newNode = new node(data);
    }

}




