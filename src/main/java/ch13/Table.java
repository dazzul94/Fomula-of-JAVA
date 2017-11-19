package ch13;

import java.util.ArrayList;

public class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6; 

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " 기다리고 있습니다");
            try {
                wait(); //Cook쓰레드를 기다리게 한다
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        dishes.add(dish);
        notify(); // 기다리고 있는 cus를 깨우기 위함
        System.out.println("Dishes: " + dishes.toString());
    }

    public void remove(String dishName) {
        synchronized(this) {
            String name = Thread.currentThread().getName();
            while (dishes.size() == 0) {
                System.out.println(name + " 기다리고 있습니다");
                try {
                    wait(); //cus를 기다리게 한다
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if(dishes.get(i).equals(dishName)) {
                        dishes.remove(i);
                        notify(); //Cook을 깨우기 위함
                        return;
                    }
                }//for
                try {
                    System.out.println(name + " 기다리고 있습니다.");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        }//synchronized
    }

    public int dishNum() {
        return dishNames.length;
    }
}
