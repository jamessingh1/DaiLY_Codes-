package socket_programming;
import java.net.ServerSocket;
import java.net.Socket;

public class echoserver {
    public static void main(String[] args){

        try{
            System.out.println("Waiting for Client.....");
            ServerSocket ss = new ServerSocket(7070);
            Socket soc = ss.accept();
            System.out.println("Connection Established!");
        }
        catch(Exception e){
            System.out.println("Exception handled!" + e);
        }
    }
}
