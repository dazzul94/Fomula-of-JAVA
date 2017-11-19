package ch13;

import javax.swing.JOptionPane;

public class ThreadEx14 {
    public static void main(String[] args) {
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();
        
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println(input);
        
        th1.interrupted();
        System.out.println(th1.isInterrupted());
        
    }

}
class ThreadEx14_1 extends Thread {
    @Override
    public void run() {
        int i = 10;
        
        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                interrupted();
            }
        }
        System.out.println("카운트가 종료되었습니다");
    }
}