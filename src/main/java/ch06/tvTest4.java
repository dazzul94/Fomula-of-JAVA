package ch06;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            System.out.println(tvArr[i] + "의 객체 생성!");
            tvArr[i].channel = i + 10;
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.println("채널이 1증가해서 " + tvArr[i].channel + "입니다");
        }
        
    }
}
class Tv {
    String color;
    boolean power;
    int channel;
    
    void power() {power=!power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
