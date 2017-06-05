package random;

public class NumberLength {
    long count(long number) {
        int result = 0;
        while (number > 0) {
            number /= 10;
            result++;
            // System.out.println(result); just checking
        }
        return result;
    }

    public static void main(String[] args) {
        NumberLength nl = new NumberLength();
        long i = nl.count(123456123456789L);
        System.out.println(i);
    }
}
