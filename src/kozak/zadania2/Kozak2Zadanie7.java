package kozak.zadania2;

import java.util.Scanner;

public class Kozak2Zadanie7 {
    Scanner myScaner = new Scanner(System.in);

    String marker;
    int x;
    int y;
    int a;
    int b;

    String takeMarker() {
        System.out.println("Please enter marker");
        return marker = myScaner.next();
    }
    int giveX() {
        System.out.println("Please enter the X position of the upper left corner of the rectangle");
        return x = myScaner.nextInt();
    }
    int giveY() {
        System.out.println("Please enter the Y position of the upper left corner of the rectangle");
        return y = myScaner.nextInt();
    }
    int giveVertical() {
        System.out.println("Please enter the height of the rectangle");
        return a = myScaner.nextInt();
    }
    int giveHorizontal() {
        System.out.println("Please enter the width of the rectangle");
        return b = myScaner.nextInt();
    }

    void count() {
        giveX();
        giveY();
        giveVertical();
        giveHorizontal();

        for (int i = 1; i < y; i++) {
            System.out.print(">");  // ten znak ">" pokazuje mi ENTERY
            System.out.println();
        }

        for (int k = 0; k < a; k++) {

            for (int i = 1; i < x; i++) {
                System.out.print("-");  // ten znak "-" pokazuje spacje ;)
            }
            for (int j = 0; j < b; j++) {
                System.out.print(marker);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Kozak2Zadanie7 kozak2Zadanie7 = new Kozak2Zadanie7();
        kozak2Zadanie7.takeMarker();
        kozak2Zadanie7.count();

       /* kozak2Zadanie7.giveX();          PIERWOTNY POMYSŁ
        kozak2Zadanie7.giveY();
        kozak2Zadanie7.giveVertical();
        kozak2Zadanie7.giveHorizontal();*/
    }
}
