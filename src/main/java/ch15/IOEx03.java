package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx03 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] temp = new byte[4];
        byte[] outSrc = null;
        
        ByteArrayInputStream in = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        int a = 0;
        try {
            while ((a = in.read(temp)) != -1) {
                out.write(temp,0,a);
                outSrc = out.toByteArray();
                
                System.out.println("temp: " + Arrays.toString(temp));
                System.out.println("outSrc: " + Arrays.toString(outSrc));
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
                
     }
}
