package random;

public class FactorialMethod1 {
    private int countF(int z) {
        int factoriaal = 1; // bo 0! = 1, więc 1 będzie zawsze
        for (int i = 1; i <= z; i++) {
            factoriaal *= i;
        }
        return factoriaal;
    }

    public static void main(String[] args) {
        FactorialMethod1 fm1 = new FactorialMethod1();
        int i = fm1.countF(5);
        System.out.println(i);
    }
}
