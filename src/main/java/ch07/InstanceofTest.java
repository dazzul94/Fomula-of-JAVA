package ch07;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        if (fe instanceof FireEngine)
            System.out.println("This is a FireEngine instance");
        if (fe instanceof Car)
            System.out.println("This is a Car instance");
        if (fe instanceof Object)
            System.out.println("This is a Object instance");
        System.out.println(fe.getClass().getName()); //참조변수가 가리키고 있는 인스턴스 클래스의 이름을 문자열로 반환
    }
    //instanceof의 리턴값이 true라는 것은 형변환이 가능하다는 뜻이다

}
