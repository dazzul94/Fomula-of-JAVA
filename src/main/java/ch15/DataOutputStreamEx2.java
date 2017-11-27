package ch15;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataOutputStreamEx2 {

    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        
        byte[] result = null;
        try {
            dos.writeInt(10);
            dos.writeFloat(20.2f);
            dos.writeBoolean(true);
            
            result = bos.toByteArray();
            
            String[] hex = new String[result.length];
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
