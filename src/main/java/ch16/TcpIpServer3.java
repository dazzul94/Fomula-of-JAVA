package ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer3 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "서버가 준비되었습니다");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while (true) {
            System.out.println(getTime() + "연결요청을 기다립니다");
            try {
                serverSocket.setSoTimeout(5*1000);
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + "로부터 연결이 들어왔습니다");
                
                System.out.println("getPort(): " + socket.getPort());
                System.out.println("getLocalPort(): " + socket.getLocalPort());
                
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF("[Notice]) Test Message1 from Server");
                System.out.println(getTime() + "서버로 메세지를 전송했습니다");
                
                out.close();
                socket.close();
            } catch (SocketTimeoutException e) {
                System.out.println("지정된 시간동안 접속요청이 없어서 서버를 종료합니다");
                System.exit(0);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }

    private static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }

}
