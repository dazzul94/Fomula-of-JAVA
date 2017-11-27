package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {
    public static void main(String[] args) {
        String fileName = "UserInfo2.ser";
        try(ObjectOutputStream out = new ObjectOutputStream
                (new BufferedOutputStream
                        (new FileOutputStream(fileName)));
                ) {
            UserInfo2 u1 = new UserInfo2("JavaMan", "1234", 30);
            UserInfo2 u2 = new UserInfo2("JavaWoman", "4321", 24);
            
            ArrayList<UserInfo2> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);
            
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            System.out.println("직렬화 끝");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
