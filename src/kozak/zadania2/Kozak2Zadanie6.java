package kozak.zadania2;

import java.util.Random;
import java.util.Scanner;

public class Kozak2Zadanie6 {
    Random number = new Random();
    int computerNumber;

    int takeComputerNumber() {
        computerNumber = number.nextInt(100) + 1;
        return computerNumber;
    }
    Scanner myScanner = new Scanner(System.in);

    int playerNumber;

    public boolean isPlayerNumberGood(int playerNumber) {
        return (playerNumber >= 1 && playerNumber <= 100);
    }

    void takePlayerNumber() {
        do {
            System.out.println("Please enter number between 1 and 100");
            playerNumber = myScanner.nextInt();
            if (playerNumber > computerNumber) {
                System.out.println("Podałeś za dużą wartość");
            } else if (playerNumber < computerNumber) {
                System.out.println("Podałeś za małą wartość");
            } else if (playerNumber == computerNumber) {
                System.out.println("Gratulacje");
                System.out.println("Koniec gry");
                break;
            }
        } while (!isPlayerNumberGood(playerNumber));
}

    public static void main(String[] args) {
        Kozak2Zadanie6 kozak2Zadanie6 = new Kozak2Zadanie6();

        kozak2Zadanie6.takeComputerNumber();
        kozak2Zadanie6.takePlayerNumber();
    }

}
