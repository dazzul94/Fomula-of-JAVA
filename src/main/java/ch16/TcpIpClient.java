package ch16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {
    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        System.out.println("서버에 연결중입니다. 서버 IP : " + serverIp);
        try {
            Socket socket = new Socket(serverIp, 7777);
            
            DataInputStream in = new DataInputStream(socket.getInputStream());
            System.out.println("서버로부터 받은 메시지" + in.readUTF());
            System.out.println("연결을 종료합니다");
            
            in.close();
            socket.close();
            System.out.println("연결이 종료되었습니다");
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
