package ch15;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderEx1 {
    public static void main(String[] args) {
        String filename = "test.txt";
        try {
            FileInputStream fis = new FileInputStream(filename);
            FileReader fr = new FileReader(filename);
            
            int data = 0;
            
            while ((data = fis.read()) != -1) {
                System.out.println((char)data);
            }
            System.out.println();
            fis.close();
            
            while ((data = fr.read()) != -1) {
                System.out.println((char)data);
            }
            System.out.println();
            fis.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
