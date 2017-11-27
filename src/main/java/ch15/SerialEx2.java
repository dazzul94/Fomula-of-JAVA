package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialEx2 {
    public static void main(String[] args) {
        String fileName = "UserInfo2.ser";
        try(ObjectInputStream in = new ObjectInputStream
                (new BufferedInputStream
                        (new FileInputStream(fileName)));
                ) {
            UserInfo2 u1 = (UserInfo2)in.readObject();
            UserInfo2 u2 = (UserInfo2)in.readObject();
            
            ArrayList<UserInfo2> list = (ArrayList<UserInfo2>) in.readObject();
            
            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
