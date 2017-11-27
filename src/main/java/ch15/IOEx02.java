package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx02 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];
        
        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        
        try {
            input.read(temp);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        output.write(temp,5,5);
        
        outSrc = output.toByteArray();
        
        System.out.println("Input Source :" + Arrays.toString(inSrc));
        System.out.println("temp :" + Arrays.toString(inSrc));
        System.out.println("output Source :" + Arrays.toString(outSrc));
        
    }

}
