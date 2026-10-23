package socket_programming;
import java.net.Socket;

public class echoclient {
    public static void main(String[] args) {
        try{
            System.out.println("Client Started");
            Socket ss = new Socket("localhost",7070);
        }
        catch(Exception e){
            System.out.println("Exception is Handling!" + e);
        }
    }
}
