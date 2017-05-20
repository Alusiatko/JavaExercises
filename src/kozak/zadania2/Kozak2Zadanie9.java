package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie9 {

    Scanner myScanner = new Scanner(System.in);

    int integerNumber;

    int sumEvenNumber = 0;              // suma liczb parzystych
    int sumOddNumber = 0;               // suma liczb nieparzystych

    int a = 0;                  // iteracje parzyste
    int b = 0;                  // iteracje nieparzyste


    int takeIntegerNumber() {
        System.out.println("Please provide integer number");
        return integerNumber = myScanner.nextInt();
    }

    void countSum(int integerNumber) {
        int number = integerNumber;
        System.out.println("You enter number " + number);
        int result = 0; // tworze sobie zmienna wynik, w ktorej beda dodawane poszczegolne cyfry podanej liczby
        while (number != 0) {
            int theRest = number % 10;       // wprowadzam zmienna pomocnicza, zeby jej potem uzyc w if-ach
            result = result + theRest;
            number = number / 10;
            System.out.println(theRest);     // drukuje testowo dla siebie
            System.out.println("Current result is " + result + " and current number is " + number); // to dla mnie do sprawdzenia czy dobrze liczy w tej petli
            /*number = number / 10;
            System.out.println("Current result is " + result + " and current number is " + number);*/
            if (theRest % 2 == 0) {
                sumEvenNumber += theRest;
                a++;
            }
            if (theRest % 2 == 1) {
                sumOddNumber += theRest;
                b++;
            }
        }
        System.out.println("The sum of numbers in your integer number is " + result);
        System.out.println("The sum of even numbers in your integer number is " + sumEvenNumber);
        System.out.println("The sum of odd numbers in your integer number is " + sumOddNumber);

    }

    void countAverge() {
        double averageEven = sumEvenNumber / a;
        System.out.println("Your even average is " + averageEven);
        double averageOdd = sumOddNumber / b;
        System.out.println("Your odd average is " + averageOdd);
        double factor = averageEven / averageOdd;
        System.out.println("The factor is " + factor);
    }

    public static void main(String[] args) {
        Kozak2Zadanie9 kozak2Zadanie9 = new Kozak2Zadanie9();
        kozak2Zadanie9.takeIntegerNumber();

        kozak2Zadanie9.countSum(kozak2Zadanie9.integerNumber);
        kozak2Zadanie9.countAverge();

        System.out.println(kozak2Zadanie9.integerNumber);   // druk testowy czy sie nic nie zmienilo w integerNumber
    }
}