
class NNode{
    int data;
    NNode right;
    NNode left;

    public NNode(int data){
        this.data = data;
    }
}

public class BinarySearch {

    NNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public NNode insertRec(NNode root, int data){
        if(root == null)
            root = new NNode(data);
        else if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    //INORDER TRAVERSAL
    public void postorder(){
        postorderRec(root);
    }

    public void postorderRec(NNode root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");

        }
    }
}

