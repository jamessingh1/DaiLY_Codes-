package echo;
import java.io.*;
import java.net.*;

public class echotcpclient {


    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost", 7070);

            // User input
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter text: ");
            String msg = console.readLine();

            // Send to server
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(msg);

            // Receive echo back
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println("Echo: " + in.readLine());

            soc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

