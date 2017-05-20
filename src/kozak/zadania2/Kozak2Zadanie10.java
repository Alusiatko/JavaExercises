package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie10 {

    Scanner myScanner = new Scanner(System.in);

    int n;

    int takeN() {
        do {
            System.out.println("Please enter natural number");
            n = myScanner.nextInt();
        } while (!isGoodNumber(n));
        return n;
    }

    public boolean isGoodNumber(int n) {
        return (n > 0);
    }

    void count(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Kozak2Zadanie10 kozak2Zadanie10 = new Kozak2Zadanie10();
        kozak2Zadanie10.takeN();
        kozak2Zadanie10.count(kozak2Zadanie10.n);
    }
}
