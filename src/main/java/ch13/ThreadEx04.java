package ch13;

public class ThreadEx04 {
    public static void main(String[] args) {
        long startTime  = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
            if (i == 100) 
                System.out.println();
            if (i == 200)
                System.out.println();
            if (i == 300)
                System.out.println();
        }
        System.out.println("소요시간1: " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++) {
            System.out.printf( "%s", new String("|"));
            if (i == 100) 
                System.out.println();
            if (i == 200)
                System.out.println();
            if (i == 300)
                System.out.println();
        }
        System.out.println("소요시간2: " + (System.currentTimeMillis()- startTime));

    }
}
