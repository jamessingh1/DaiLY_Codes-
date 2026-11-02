package Daytime;
import java.net.*;

public class UDPDaytimeclient {
  
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress serverIP = InetAddress.getByName("localhost");

            byte[] sendData = "GetTime".getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverIP, 5056);
            ds.send(sendPacket);

            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            ds.receive(receivePacket);

            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println(response);

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

