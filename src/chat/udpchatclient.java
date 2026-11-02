package chat;
import java.io.*;
import java.net.*;

public class udpchatclient {


    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress serverIP = InetAddress.getByName("localhost");

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("UDP Chat Client Ready! Start chatting.\n");

            while (true) {
                System.out.print("Client: ");
                String clientMsg = console.readLine();
                byte[] sendBuffer = clientMsg.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverIP, 8080);
                ds.send(sendPacket);

                if (clientMsg.equalsIgnoreCase("bye")) {
                    break;
                }

                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                ds.receive(receivePacket);

                String serverMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server: " + serverMsg);
            }

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

