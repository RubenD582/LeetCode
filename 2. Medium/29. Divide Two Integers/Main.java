public class Main {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Math.pow(-2, 31) && divisor == -1) {
            return (int) Math.pow(2, 31);
        }

        return (int) dividend / divisor;
    }
}
