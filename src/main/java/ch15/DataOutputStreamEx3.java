package ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx3 {
    public static void main(String[] args) {
        int[] score = {100, 90, 80, 70, 60};
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("score.dat"));
            
            for (int i = 0; i < score.length; i++) {
                out.writeInt(score[i]);
            }
            out.close();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
