package ch06;

public class CallsTackTest2 {

    public static void main(String[] args) {
        System.out.println("main(String[] args) 실행되었음!");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음!");
    }
    static void firstMethod() {
        System.out.println("firstMethod() 시작되었음!");
        secondMethod();
        System.out.println("firstMethod() 끝났음!");
    }
    static void secondMethod() {
        System.out.println("secondMethod 시작되었음!");
        System.out.println("secondMethod 끝났음!");
    }
 }
