package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie8 {
    Scanner myScanner = new Scanner(System.in);

    int n;

    int takeN() {
        System.out.println("Please provide number of rows");
        return n = myScanner.nextInt();
    }

    void drawTree(int n) {
        int z = n;
        int row = 1;
        while (row <= n) {
            for (int i = 1; i < z; i++) {
                System.out.print(" ");
            }

            int j = 1;
            while(j <= ((2*row)-1)) {
                System.out.print("*");
                j = j + 1;
            }

            for (int k = 1; k < z; k++) {
                System.out.print(" ");
            }
            System.out.println();
            z--;
            row++;
        }
    }

    public static void main(String[] args) {
        Kozak2Zadanie8 kozak2Zadanie8 = new Kozak2Zadanie8();
        kozak2Zadanie8.takeN();
        kozak2Zadanie8.drawTree(kozak2Zadanie8.n);
    }
}
