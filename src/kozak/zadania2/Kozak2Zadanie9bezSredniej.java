package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie9bezSredniej {

    Scanner myScanner = new Scanner(System.in);

    int integerNumber;

    int takeIntegerNumber() {
        System.out.println("Please provide integer number");
        return integerNumber = myScanner.nextInt();
    }

    void countSum(int integerNumber) {
        int number = integerNumber;
        System.out.println("You enter number " + number);
        int result = 0; // tworze sobie zmienna wynik, w ktorej beda dodawane poszczegolne cysfy podanej liczby
        while (number != 0) {
            result = result + (number % 10);
            System.out.println("Current result is " + result + " and current integerNumber is " + number); // to dla mnie do sprawdzenia czy dobrze liczy w tej petli
            number = number / 10;
            System.out.println("Current result is " + result + " and current integerNumber is " + number);
        }
        System.out.println("The sum of numbers in your integer number is " + result);
    }

    public static void main(String[] args) {
        Kozak2Zadanie9bezSredniej kozak2Zadanie9BezSredniej = new Kozak2Zadanie9bezSredniej();
        kozak2Zadanie9BezSredniej.takeIntegerNumber();
        kozak2Zadanie9BezSredniej.countSum(kozak2Zadanie9BezSredniej.integerNumber);
        System.out.println(kozak2Zadanie9BezSredniej.integerNumber);
    }
}
