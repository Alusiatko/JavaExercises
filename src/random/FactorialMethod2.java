package random;

/**
 * Created by Alicja on 22-05-2017.
 */
public class FactorialMethod2 {
    int countFactorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * countFactorial(x - 1);
        }
    }

    public static void main(String[] args) {
        FactorialMethod2 fm2 = new FactorialMethod2();
        int y = fm2.countFactorial(5);
        System.out.println(y);
    }
}
