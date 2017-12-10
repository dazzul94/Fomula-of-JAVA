package ch07;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        
        b.buy(tv);
        b.buy(computer);
        b.buy(audio);

        b.summary();
        System.out.println();
        b.refund(computer);
        b.summary();
    }
}

class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);

    }
    public Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class TV extends Product {
    public TV() {
        super(100);
    }

    @Override
    public String toString() {
        return "TV";
    }

}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
class Audio extends Product {
    public Audio() {
        super(50);
    }
    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonuspoint = 0;
    Vector<Product> item = new Vector<Product>();
    
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
        return;
        }
        money -= p.price;
        bonuspoint += p.bonusPoint;
        item.add(p);
        System.out.println(p +" 를 구입하셨습니다");
    }
    void refund(Product p) {
        if (item.remove(p)) {
            this.money += p.price;
            this.bonuspoint -= p.bonusPoint;
            System.out.println(p + "를 반품하셨습니다");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다");
        }
    }
    void summary() {
        int sum = 0;
        String itemList = "";
        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 0개입니다");
            return;
        }
        
        
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i) == null) break;
            sum += item.get(i).price;
           itemList += (i==0)? item.get(i) : "," + item.get(i);
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다");
        System.out.println("구입하신 제품은 " + itemList + " 입니다");
        
    }
}
