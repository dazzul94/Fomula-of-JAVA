package ch04;

public class C_lang02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 0, j = 1;
        while (i < 2) {
            System.out.println("큰 조건");
            while (j < 4) {
                System.out.println("작은 조건");
                j++;
            }
            i++;
            j = 1;
        }
    }
}
