package Daytime;
import java.io.*;
import java.net.*;

public class TCPDaytimeClient {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost", 5050);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            // Receive date & time from server
            System.out.println(in.readLine());
            soc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

