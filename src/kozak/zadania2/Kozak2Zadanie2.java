package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie2 {

    Scanner myScanner = new Scanner(System.in);

    int A;
    int B;

    boolean isAlessThenB(int A, int B) {
        return A < B;
    }

    void takeAandB() {
        do {
            System.out.println("Please enter number A");
            A = myScanner.nextInt();
            System.out.println("Please enter another number B greater than A");
            B = myScanner.nextInt();
        } while (!isAlessThenB(A, B));
    }

    void showNumber() {
        System.out.println("You enter number A as " + A + " and number B as " + B);
    }

    int countSumWhile(int A, int B) {
        int sum = 0;
        while (A<=B) {
            sum = sum + A;
            A++;
        }
        return sum;
    }

    int countSumDoWhile(int A, int B) {
        int sum = 0;
        do {
            sum = sum + A;
            A++;
        } while (A<=B);
        return sum;
    }

    int countSumFor(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum = sum + A; // BO sum na pocz 0, a potem ma wartosc A, a potem A+(A+1) i tak dalej, uffff
            A++;
        }
        return sum;
    }

    // krotsza wersja:

    int count(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Kozak2Zadanie2 kozak2Zadanie2 = new Kozak2Zadanie2();

        kozak2Zadanie2.takeAandB();
        kozak2Zadanie2.showNumber();

        int loopWhile = kozak2Zadanie2.countSumWhile(kozak2Zadanie2.A, kozak2Zadanie2.B);
        System.out.println(loopWhile);

        int loopDoWhile = kozak2Zadanie2.countSumDoWhile(kozak2Zadanie2.A, kozak2Zadanie2.B);
        System.out.println(loopDoWhile);

        int loopFor = kozak2Zadanie2.countSumFor(kozak2Zadanie2.A, kozak2Zadanie2.B);
        System.out.println(loopFor);

        int dziubek = kozak2Zadanie2.count(kozak2Zadanie2.A, kozak2Zadanie2.B);
        System.out.println(dziubek);
    }
}
