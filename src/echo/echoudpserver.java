package echo;
import java.net.*;

public class echoudpserver {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(7070);
            byte[] buf = new byte[1024];

            // 1. Receive packet
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            ds.receive(packet);

            // 2. Extract details and echo back same data
            InetAddress clientIP = packet.getAddress();
            int clientPort = packet.getPort();
            DatagramPacket echoPacket = new DatagramPacket(packet.getData(), packet.getLength(), clientIP, clientPort);
            
            ds.send(echoPacket);
            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
    
