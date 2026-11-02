package Daytime;
import java.io.*;
import java.net.*;
import java.util.Date;

public class TCPDaytimeserver {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5050);
            System.out.println("Daytime TCP Server running on port 5050...");

            while (true) {
                Socket soc = ss.accept(); // Wait for client
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                
                // Send current date and time
                out.println("Server Date & Time: " + new Date().toString());
                soc.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

