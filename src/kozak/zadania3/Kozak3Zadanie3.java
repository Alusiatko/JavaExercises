package kozak.zadania3;

import java.util.Arrays;
import java.util.Random;

public class Kozak3Zadanie3 {

    void fillMatrix(int[][] matrix) {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(11)-5;         // losuję liczbę i wyświetlam w jednej pętli
                System.out.print(matrix[i][j] + "       ");
            }
            System.out.println();
        }
    }
//    przejscie przez RZĘDY:
    void showMinInRow(int[][] matrix) {
        int[] minimum = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            int minNumber = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                minNumber = Math.min(minNumber, matrix[i][j]);
            }
            minimum[i] = minNumber;
            System.out.print(minNumber + " ");
        }
        System.out.println();
        System.out.println("Wydruk  w postaci tablicy, MINIMUM: " + Arrays.toString(minimum));
    }

    void showMaxInRow(int[][] matrix) {
        int[] maximum = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            int maxNumber = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                maxNumber = Math.max(maxNumber, matrix[i][j]); // dla każdego muszę porównac aktualny maxNumber
            }                                                    // z aktualna wartoscia w pozycji matrix[i][j]
            maximum[i] = maxNumber;
            System.out.print(maxNumber + " ");
        }
        System.out.println();
        System.out.println("Wydruk  w postaci tablicy, MAXIMUM: " + Arrays.toString(maximum));
    }

//    przejscie przez KOLUMNY:
    void showMinInCOLUMN(int[][] matrix) {
        int[] minimumColumn = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            int minNumberColumn = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                minNumberColumn = Math.min(minNumberColumn, matrix[j][i]); // TU JEST ZMIANA na {j][i]
            }
            minimumColumn[i] = minNumberColumn;
            System.out.print(minNumberColumn + " ");
        }
        System.out.println();
        System.out.println("Wydruk w postaci tablicy, MINIMUM w kolumnie: " + Arrays.toString(minimumColumn));
    }

    void showMaxInCOLUMN(int[][] matrix) {
        int[] maximumColumn = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            int maxNumberColumn = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                maxNumberColumn = Math.max(maxNumberColumn, matrix[j][i]); // TU JEST ZMIANA na {j][i]
            }
            maximumColumn[i] = maxNumberColumn;
            System.out.print(maxNumberColumn + " ");
        }
        System.out.println();
        System.out.println("Wydruk w postaci tablicy, MAXIMUM w kolumnie: " + Arrays.toString(maximumColumn));
    }

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        Kozak3Zadanie3 kozak3Zadanie3 = new Kozak3Zadanie3();

        kozak3Zadanie3.fillMatrix(matrix);
        System.out.println();

        kozak3Zadanie3.showMinInRow(matrix);
        System.out.println();

        kozak3Zadanie3.showMaxInRow(matrix);
        System.out.println();

        kozak3Zadanie3.showMinInCOLUMN(matrix);
        System.out.println();

        kozak3Zadanie3.showMaxInCOLUMN(matrix);
    }
}
