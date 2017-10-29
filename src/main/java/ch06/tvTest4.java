package ch06;

public class tvTest4 {
    static class Tv {
        String color;
        boolean power;
        int channel;
        
        void power() {
            this.power = !(this.power);
        }
        void channelup() {
            ++this.channel;
        }
        void channeldown() {
            --this.channel;
        }
    }
    public static void main(String[] args) {
        Tv tv = new Tv();
        Tv[] tvarr = new Tv[3];
        for(int i = 0; i < tvarr.length; i++) {
            tvarr[i] = new Tv();
        }
        tvarr[0].channelup();
    }

}
