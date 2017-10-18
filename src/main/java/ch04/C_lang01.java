package ch04;

public class C_lang01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 1;
        int sum = 0;
        while (i <= 10) {
        sum = sum + i;
        i++;
        }
    System.out.println(sum);
    
        i = 1;
        sum = 1;
        while (i <= 10) {
            sum *= i;
            i++;
        }
        System.out.println(sum);
    }
}
