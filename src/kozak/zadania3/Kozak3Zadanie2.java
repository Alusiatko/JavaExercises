package kozak.zadania3;

import java.util.Arrays;
import java.util.Random;

public class Kozak3Zadanie2 {

    void fillTable(int[] table) {
        Random r = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = r.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(table));         // wydruk testowy calej tablicy

        System.out.print("Wylosowane liczby: ");
/*        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }*/

        System.out.println(Arrays.toString(table).replaceAll("[,\\[\\]]", ""));
    }

    void countOccurence(int[] table) {
        int[] helperTable = new int[11];
        for (int i = 0; i < helperTable.length; i++) {
            helperTable[i] = 0;
        }
        System.out.println(Arrays.toString(helperTable));

        for (int i = 0; i < table.length; i++) {
            helperTable[table[i]]++;
        }
        System.out.println(Arrays.toString(helperTable));
        for(int i =1; i<helperTable.length; i++) {
            System.out.println(i +" - " + helperTable[i]);
        }

    }

    public static void main(String[] args) {

        int[] table = new int[20];

        Kozak3Zadanie2 kozak3Zadanie2 = new Kozak3Zadanie2();
        kozak3Zadanie2.fillTable(table);
        System.out.println();
        kozak3Zadanie2.countOccurence(table);
    }
}
