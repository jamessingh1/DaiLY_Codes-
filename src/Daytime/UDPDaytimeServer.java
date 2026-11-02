package Daytime;
import java.net.*;
import java.util.Date;

public class UDPDaytimeServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(5056);
            System.out.println("Daytime UDP Server running on port 5050...");

            byte[] receiveBuffer = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                ds.receive(receivePacket);
                String dateTime = "Server Date & Time: " + new Date().toString();
                byte[] sendData = dateTime.getBytes();
                InetAddress clientIP = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIP, clientPort);
                ds.send(sendPacket);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

