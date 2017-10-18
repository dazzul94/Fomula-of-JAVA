package ch04;

public class C_lang03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       int i = 2, j = 1, k = 1;
       while (i <= 9) {
           while (j <= 9) {
               while (k <= 9) {
                   System.out.printf("%d * %d * %d = %d\n", i, j, k, i * j * k);
                   k++;
               }
           j++;
           k = 1;
           }
           i++;
           j = 1;
       }
    }
}
