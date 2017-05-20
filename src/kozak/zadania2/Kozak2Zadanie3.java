package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie3 {
    Scanner myScanner = new Scanner(System.in);

    int n;
    public static final int BASIC_OF_POWER = 2;

    void takeN() {
        do {
            System.out.println("Please enter positive integer number");
            n = myScanner.nextInt();
        } while (!isNpositive(n));
    }

    boolean isNpositive(int n) {
        return n > 0;
    }

//  MÓJ SPOSÓB:
/*    int count(int n) {
        int power = 0;
        int currentNumber = 0;

        while (currentNumber < n) {
            currentNumber = (int) Math.pow(BASIC_OF_POWER, power); // musi by castowanie=szutowanie, bo Math.pow(double a, double b)
            if (currentNumber > n) {
                break;
            }
            System.out.println(currentNumber);
            power++;
        }
        return currentNumber;
    }*/

//    inny SPOSÓB:
    int count(int n) {
        int power = 0;
        int currentNumber = 0;

        while ((currentNumber = (int) Math.pow(BASIC_OF_POWER, power)) < n) {
            System.out.println(currentNumber);
            power++;
        }
        return currentNumber;
    }

    public static void main(String[] args) {

        Kozak2Zadanie3 kozak2Zadanie3 = new Kozak2Zadanie3();

        kozak2Zadanie3.takeN();

        kozak2Zadanie3.count(kozak2Zadanie3.n);
    }
}
