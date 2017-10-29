package ch06;

public class MyMathTest {
    static class Math {
        long add(long a, long b) {
            return a + b;
        }
        long subtract(long a, long b) {
            return a - b;
        }
        long multiply(long a, long b) {
            return a * b;
        }
        double divide(long a, long b) {
            return a / b;
        }
    }
    public static void main(String[] args) {
        Math math = new Math();
        long result1 = math.add(3L, 5L);
        long result2 = math.subtract(4l, 5l);
        long result3 = math.multiply(5l, 7l);
        long result4 = (long)math.divide(4l, 4l);
    }

}
