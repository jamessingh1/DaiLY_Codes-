package chat;
import java.io.*;
import java.net.*;

public class udpchatserver {
   
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(8080);
            System.out.println("UDP Chat Server running on port 8080...\n");

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            byte[] receiveBuffer = new byte[1024];

            while (true) {

                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                ds.receive(receivePacket);

                String clientMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Client: " + clientMsg);

                if (clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Client ended the chat.");
                    break;
                }

                InetAddress clientIP = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.print("Server: ");
                String serverMsg = console.readLine();
                byte[] sendBuffer = serverMsg.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientIP, clientPort);
                ds.send(sendPacket);
            }

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

