package ch15;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx2 {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("score.dat"));
            int[] result = new int[4];
            int a = 0;
            for(int i = 0; i < result.length; i++) {
                result[i] = in.readInt();
                System.out.println(result[i]);
            }
            
            System.out.println(result[0]+result[1]+result[2]+result[3]);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
