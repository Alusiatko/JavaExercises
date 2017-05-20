package kozak.zadania2;

import java.util.Arrays;
import java.util.Scanner;

public class Kozak2Zadanie5 {

    Scanner myScanner = new Scanner(System.in);

    String seriesOfInteger;  // to co wpisuje uzytkownik

    String takeUserInput() {  // pobieram dane
        System.out.println("Please enter series of integer, separate them with coma and end it with 0");
        seriesOfInteger = myScanner.nextLine().trim();
        return seriesOfInteger;
    }

    void splitUserInput(String seriesOfInteger) {
        String[] splitedTable;
        splitedTable = seriesOfInteger.split(", "); // usuwam przecinki, rozdzielam na osobne Stringi

        System.out.println(Arrays.toString(splitedTable) + "    -   to jest tablica Stringów");   // drukuję kontolnie, zeby zobaczyc czy powstala tablica

        int[] parsedTable = new int[splitedTable.length];

        for (int i = 0; i < splitedTable.length; i++) {
            if (splitedTable[i].equals("0")) {              // wszystkie liczby podane po zerze nie sa juz parsowane
                break;
            }
            System.out.print(splitedTable[i] + " ");
            parsedTable[i] = Integer.parseInt(splitedTable[i]);  // parsuje pojedynczo
        }

        System.out.println();
        System.out.print(Arrays.toString(parsedTable) + "   -   to jest tabliica typu int");

        int maxNumber = Math.max(parsedTable[0], parsedTable[1]);
        int z = 0;
        while ((!(parsedTable[z] == 0)) && (z < ((parsedTable.length)))) {
            if (parsedTable[z] == 0) {      // to ma wyrzucać wartości, które podane zostaną po zerze
                break;
            }
            maxNumber = Math.max(maxNumber, Math.max((parsedTable[z]), parsedTable[z + 1])); // TU był wczesniej blad
            z++;
        }
        System.out.println();
        System.out.println(maxNumber);

        int minNumber = Math.min(parsedTable[0], parsedTable[1]);
        int w = 0;
        while ((!(parsedTable[w] == 0)) && (w < ((parsedTable.length)))) {
            if (parsedTable[w] == 0) {      // to ma wyrzucać wartości, które podane zostaną po zerze
                break;
            }
            minNumber = Math.min(minNumber, Math.min((parsedTable[w]), parsedTable[w + 1])); // TU był wczesniej blad
            w++;
        }
        System.out.println(minNumber);

        int sum = maxNumber + minNumber;
        System.out.println(sum);

        double average = (double) sum / 2; // musi być rzutowanie, zeby nie ucinalo cyfr po przecinku
        System.out.println(average);
    }

    public static void main(String[] args) {
        Kozak2Zadanie5 kozak2Zadanie5 = new Kozak2Zadanie5();
        kozak2Zadanie5.takeUserInput();
        kozak2Zadanie5.splitUserInput(kozak2Zadanie5.seriesOfInteger);
    }
}