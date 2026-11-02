package echo;
import java.io.*;
import java.net.*;

public class echotcpserver {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7070);
            Socket soc = ss.accept(); // Connect

            // IO Streams
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);

            // Read and Echo
            String msg = in.readLine();
            out.println(msg);

            soc.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

