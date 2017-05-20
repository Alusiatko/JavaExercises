package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie10innaWersja {

    Scanner myScanner = new Scanner(System.in);

    int takeN() {
        return myScanner.nextInt();
    }

    void count(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Kozak2Zadanie10innaWersja kozak2Zadanie10InnaWersja = new Kozak2Zadanie10innaWersja();
        int n = kozak2Zadanie10InnaWersja.takeN();
        kozak2Zadanie10InnaWersja.count(n);
    }
}
