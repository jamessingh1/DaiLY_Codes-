package chat;
import java.io.*;
import java.net.*;

public class tcpchatserver {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("TCP Chat Server running on port 8080. Waiting for client...");
            Socket soc = ss.accept();
            System.out.println("Client connected! Start chatting.\n");

            // Streams for network and console input
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            String clientMsg = "", serverMsg = "";

            while (!clientMsg.equalsIgnoreCase("bye")) {
                // 1. Receive message from client
                clientMsg = in.readLine();
                if (clientMsg == null || clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Client ended the chat.");
                    break;
                }
                System.out.println("Client: " + clientMsg);

                // 2. Send message from server console
                System.out.print("Server: ");
                serverMsg = console.readLine();
                out.println(serverMsg);
            }

            soc.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
    
