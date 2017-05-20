package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie11 {
    Scanner myScsnner = new Scanner(System.in);

    private int n;
    boolean trueFalseParameter = true;

    int giveN() {
        do {
            System.out.println("Please provide an integer number greater than 1");
            n = myScsnner.nextInt();
        } while (!isGoodNumber(n));
        return n;
    }

    public boolean isGoodNumber(int n) {
        return n > 1;
    }

    void countPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                trueFalseParameter = false;
            }
        }

        if (trueFalseParameter) {
            System.out.println("Your number is PRIME number");
        } else {
            System.out.println("Your number is COMPOSITE number");
        }
    }

    public static void main(String[] args) {
        Kozak2Zadanie11 kozak2Zadanie11 = new Kozak2Zadanie11();
        kozak2Zadanie11.giveN();
        kozak2Zadanie11.countPrimeNumber(kozak2Zadanie11.n);
    }
}
