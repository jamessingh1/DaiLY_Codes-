package socket_programming;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class echoserver {
    public static void main(String[] args){

        try{
            System.out.println("Waiting for Client.....");
            ServerSocket ss = new ServerSocket(7070);
            Socket soc = ss.accept();
            System.out.println("Connection Established!");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server says: "+str);
        }
        catch(Exception e){
            System.out.println("Exception handling in progress!" + e);
        }
    }
}
