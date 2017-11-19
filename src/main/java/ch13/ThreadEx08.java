package ch13;

public class ThreadEx08 {
    public static void main(String[] args) {
        ThreadEx08_1 t1 = new ThreadEx08_1();
        ThreadEx08_2 t2 = new ThreadEx08_2();
        
        t2.setPriority(7);
        System.out.println("Priority of t1(-) :" + t1.getPriority());
        System.out.println("Priority of t2(|) :" + t2.getPriority());
        t1.start();
        t2.start();
    }

}
class ThreadEx08_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("-");
            for (int x = 0; x < 10000000; x++);
        }
    }
}
class ThreadEx08_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("|");
            for (int x = 0; x < 10000000; x++);
        }
    }
}
