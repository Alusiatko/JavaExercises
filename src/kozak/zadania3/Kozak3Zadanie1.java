package kozak.zadania3;

import java.util.Arrays;
import java.util.Random;

public class Kozak3Zadanie1 {

    void fillTable(int[] table) {
        Random r = new Random();            // tworze nowy obiekt Random, który bedzie losowal liczby

        for (int i = 0; i < table.length; i++) {
            table[i] = r.nextInt(21) - 10;
        }
        System.out.println(Arrays.toString(table));


/*        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }*/

        for (int i : table) {   // bardziej zwiezle; foreach zawsze uzywac jezeli po prostu chce sie przejsc przez wszystkie elementy tablicy/kolekcji
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void findMax(int[] table) {
        int maxNumber = Integer.MIN_VALUE;

        for (int i : table) {
            maxNumber = Math.max(maxNumber, i);
        }

        System.out.println(maxNumber);
    }

    void findMin(int[] table) {
        int mixNumber = 0;
        for (int i = 0; i < (table.length - 1); i++) {
            mixNumber = Math.max(table[i], table[i + 1]);
        }
        System.out.println(mixNumber);
    }

    double countAverage(int[] table) {
        int sum = 0;

        for (int aTable : table) {
            sum += aTable;
        }
        double average = sum / table.length;
        System.out.println(average);
        return average;
    }


    void showSmallerAndGreater(int[] table, double average) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] < average) {
                a++;
            }
            if (table[i] > average) {
                b++;
            }
        }
        System.out.println("Smaller than the average is " + a);
        System.out.println("Greater than the average is " + b);
    }

    void showTableInReverse(int[] table) {
        for (int i = table.length - 1; i > 0; i--) {
            System.out.print(table[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] table = new int[10];        // wielkosc tablicy juz sie nie zmieni!

        Kozak3Zadanie1 kozak3Zadanie1 = new Kozak3Zadanie1();
        kozak3Zadanie1.fillTable(table);
        kozak3Zadanie1.findMax(table);
        kozak3Zadanie1.findMin(table);
        double average = kozak3Zadanie1.countAverage(table);
        kozak3Zadanie1.showSmallerAndGreater(table, average);
        kozak3Zadanie1.showTableInReverse(table);
    }
}
