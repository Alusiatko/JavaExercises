package kozak.zadania4;

import java.util.Scanner;

public class Kozak4Zadanie1 {
    Scanner myScanner = new Scanner(System.in);

    String takeUserInput() {
        System.out.println("Please enter any string of characters");
        return myScanner.nextLine().trim();
    }

    int countOccurencesOfLastChar(String word) {
        char[] charTable = word.toCharArray();
        int occurence = 0;
        char lastCharacter = charTable[charTable.length - 1];   // ma zwracac ostatnia litere a nie pozycje ostatniej litery
        for (int i = 0; i < charTable.length; i++) {
            if (charTable[i] == lastCharacter) {
                occurence++;
            }
        }
        return occurence;
    }

    public static void main(String[] args) {
        Kozak4Zadanie1 kozak4Zadanie1 = new Kozak4Zadanie1();

        String word = kozak4Zadanie1.takeUserInput();

        int occurences = kozak4Zadanie1.countOccurencesOfLastChar(word);
        System.out.println(occurences);
    }
}
