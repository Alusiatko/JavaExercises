package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie4 {
    Scanner myScanner = new Scanner(System.in);

    double number;

    void takeNumber() {
        System.out.println("Please enter any number");
        double sum = 0;
        while ((number = myScanner.nextDouble()) !=0 ) {
            sum = sum + number;
        }
        System.out.println(sum);
   }

    public static void main(String[] args) {
        Kozak2Zadanie4 kozak2Zadanie4 = new Kozak2Zadanie4();
        kozak2Zadanie4.takeNumber();
    }
}
