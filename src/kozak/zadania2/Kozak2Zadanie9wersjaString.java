package kozak.zadania2;

import java.util.Arrays;
import java.util.Scanner;

public class Kozak2Zadanie9wersjaString {
    Scanner myScanner = new Scanner(System.in);

    String number;  // zalożenie: liczbe ktora wpisze uzytkownik celowo traktuję jako łańcuch znaków

    String takeUserInput() {
        System.out.println("Please enter any integer number");
        number = myScanner.nextLine().trim();
        return number;
    }

    void splitUserInput(String number) {
        String[] splitedNumber;
        splitedNumber = number.split("");

        System.out.println(Arrays.toString(splitedNumber) + "  <== to jest tablica Stringow");

        int[] parsedNumber = new int[splitedNumber.length];

        for (int i = 0; i < splitedNumber.length; i++) {
            System.out.print(splitedNumber[i] + " ");               // drukuje testowy
            parsedNumber[i] = Integer.parseInt(splitedNumber[i]);       // parsować pojedynczo !!! bo inaczej sie krzaczy
        }
        System.out.println();
        System.out.print(Arrays.toString(parsedNumber) + "  <== to jest tablica typu int");

        int sum = 0;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < parsedNumber.length; i++) {
            sum += parsedNumber[i];
            if (parsedNumber[i] % 2 == 0)  {
                sumEvenNumber += parsedNumber[i];
                a++;
            }
            if (parsedNumber[i] % 2 == 1) {
                sumOddNumber += parsedNumber[i];
                b++;
            }
        }
        System.out.println();
        System.out.println("The sum of numbers in your integer number is " + sum);

        double averageEven = sumEvenNumber / a;
        System.out.println("Your even average is " + averageEven);
        double averageOdd = sumOddNumber / b;
        System.out.println("Your odd average is " + averageOdd);
        double factor = averageEven / averageOdd;
        System.out.println("The factor is " + factor);

    }

    public static void main(String[] args) {
        Kozak2Zadanie9wersjaString kozak2Zadanie9wersjaString = new Kozak2Zadanie9wersjaString();
        kozak2Zadanie9wersjaString.takeUserInput();
        kozak2Zadanie9wersjaString.splitUserInput(kozak2Zadanie9wersjaString.number);
    }
}
