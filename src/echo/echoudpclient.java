package echo;
import java.io.*;
import java.net.*;

public class echoudpclient {


    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter text: ");
            String msg = console.readLine();

            byte[] sendData = msg.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ip, 7070);
            ds.send(sendPacket);

      
            byte[] buf = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
            ds.receive(receivePacket);

            String echo = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Echo: " + echo);

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
    

