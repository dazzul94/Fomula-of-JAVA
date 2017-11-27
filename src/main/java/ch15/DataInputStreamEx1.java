package ch15;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx1 {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("sample.dat"));
            
            System.out.println(in.readInt());
            System.out.println(in.readFloat());
            System.out.println(in.readBoolean());
            in.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
