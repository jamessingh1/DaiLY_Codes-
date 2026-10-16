interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    
    public void print() {
        System.out.println("Printing the document file to the physical printer...");
    }

    public void show() {
        System.out.println("Displaying the document text live on the monitor screen.");
    }
}

public class ex5 {
    public static void main(String[] args) {
        Document doc = new Document();
        
        doc.print();
        doc.show();
    }
}
