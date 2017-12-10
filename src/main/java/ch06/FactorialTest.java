package ch06;

public class FactorialTest {
    public static void main(String[] args) {
        /*
         * int result = 1; int n = 5; 
         * while (n != 0) { result *= n--; }
         * System.out.println(result);
         */
        int result = factorial(13);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (0 >= n || n >= 10) 
            return -1;
        else if (n == 1)
            return 1;
        else return n * factorial(n-1);
    }

}
