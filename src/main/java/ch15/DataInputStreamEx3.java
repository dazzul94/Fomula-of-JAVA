package ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class DataInputStreamEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;
        
        try (DataInputStream in = new DataInputStream(new FileInputStream("score.dat"));
                ){
            while (true) {
                score = in.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch (EOFException e) {
            System.out.println(sum);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
