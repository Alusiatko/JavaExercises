package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie1 {
    Scanner myScanner = new Scanner(System.in);

    int positiveNumber;

    void takePositiveNumber() {
        do {
            System.out.println("Please enter any positive number");
            positiveNumber = myScanner.nextInt();
        } while (!isPositiveNumber(positiveNumber));
    }

    public boolean isPositiveNumber(int positiveNumber) {
        return positiveNumber > 0;
    }

    void countSingleNumber(int positiveNumber) {
        int x = 1;                                  // BO 1 BEDZIE ZAWSZE
        while (x <= positiveNumber) {
            System.out.print(x + " ");
            x += 2;
        }
    }

    void loopForCountSingleNumber(int positiveNumber) {
        for (int i = 1; i <= positiveNumber; i += 2) {
            System.out.print(i + " ");
        }
    }

    void loopDoWhileCountSingleNumber(int positiveNumber) {
        int x = 1;                      // wprowadzam zmienna lokalna bo 1 bedzie ZAWSZE!
        do {
            System.out.print(x + " ");
            x += 2;
        } while (x <= positiveNumber);
    }

    public static void main(String[] args) {
        Kozak2Zadanie1 kozak2Zadanie1 = new Kozak2Zadanie1();
        kozak2Zadanie1.takePositiveNumber();

        kozak2Zadanie1.countSingleNumber(kozak2Zadanie1.positiveNumber);
        System.out.println();                               // ZEBY BYLA PRZERWA
        kozak2Zadanie1.loopForCountSingleNumber(kozak2Zadanie1.positiveNumber);
        System.out.println();
        kozak2Zadanie1.loopDoWhileCountSingleNumber(kozak2Zadanie1.positiveNumber);
    }
}
