package chat;
import java.io.*;
import java.net.*;

public class tcpchatclient {

    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost", 8080);
            System.out.println("Connected to Chat Server! Start chatting.\n");

            // Streams for network and console input
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            String clientMsg = "", serverMsg = "";

            while (!clientMsg.equalsIgnoreCase("bye")) {
                // 1. Send message from client console
                System.out.print("Client: ");
                clientMsg = console.readLine();
                out.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("bye")) {
                    break;
                }

                // 2. Receive message from server
                serverMsg = in.readLine();
                System.out.println("Server: " + serverMsg);
            }

            soc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

