package kozak.zadania4;

import java.util.Scanner;

public class Kozak4Zadanie2 {
    Scanner myScanner = new Scanner(System.in);

    String takeUserInput() {
        System.out.println("Please enter any string of characters");
        return myScanner.nextLine().trim();
    }

    String reverseString(String word) {
        char[] stringToChar = word.toCharArray();
        String reversedWord = "";                           // pusty String to "", a null to jest brak wartosci
        for (int i = stringToChar.length - 1; i >= 0; i--) {
            reversedWord = reversedWord + stringToChar[i];
        }
        return reversedWord;

        /*
        inny SPOSOB:
        String reserved = "";
        for (int i = stringToChar.length - 1; i >= 0; i--) {
            reserved += stringToChar[i];
        }
        return reserved;*/
    }

    public static void main(String[] args) {
        Kozak4Zadanie2 kozak4Zadanie2 = new Kozak4Zadanie2();
        String word = kozak4Zadanie2.takeUserInput();
        String newWord = kozak4Zadanie2.reverseString(word);
        System.out.println(newWord);
    }
}
