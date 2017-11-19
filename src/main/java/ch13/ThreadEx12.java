package ch13;

public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 t1 = new ThreadEx12_1();
        ThreadEx12_2 t2 = new ThreadEx12_2();
        t1.start();
        t2.start();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.print("<<main 종료>>");
    }

}

class ThreadEx12_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) 
            System.out.println("-");
        System.out.print("<<th1 종료>>");
    }
}

class ThreadEx12_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) 
            System.out.println("-");
        System.out.print("<<th2 종료>>");
    }
}