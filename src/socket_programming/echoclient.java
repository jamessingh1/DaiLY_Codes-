package socket_programming;
import java.io.*;
import java.net.Socket;

public class echoclient {
    public static void main(String[] args) {
        try{
            System.out.println("Client Started");
            Socket soc = new Socket("localhost",7070);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter a String");
            String str = userInput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }
        catch(Exception e){
            System.out.println("Exception Handling in Progress!" + e);
        }
    }
}
