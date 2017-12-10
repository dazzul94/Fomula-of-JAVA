package ch07;

class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    public Card(String kind, int num) {
        this.KIND = kind;
        this.NUMBER = num;
    }

    Card() {
        this("HEART", 1);
    }

    @Override
    public String toString() {
        return KIND + "" + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
