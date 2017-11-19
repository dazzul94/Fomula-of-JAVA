package ch13;

public class ThreadWaitEx1 {
    public static void main(String[] args) throws Exception {
        Table table = new Table();
        new Thread(new Cook(table), "요리사1").start();
        new Thread(new Customer(table, "donut"), "손님1 ").start();
        new Thread(new Customer(table, "burger"),"손님2 ").start();
        
        Thread.sleep(5000);
        System.exit(0);
    }

}
