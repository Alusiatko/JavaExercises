package kozak.zadania1;

import java.util.Scanner;

public class KozakZadanie5 {

    Scanner myScanner = new Scanner(System.in);

    double itemPrice;

    int numberOfInstallment;

/*                                                  SPOSÓB znaleziony
    void askForPrice() {
        System.out.println("Please provide the price for item");

        while(!isGoodPrice(itemPrice = myScanner.nextDouble())) {       WYKRZYKNIK - bo jesli tamto NIE jest rowne
        }
    }
*/

    void askForPrice() {                // SPOSÓB MÓJ
        do {
            System.out.println("Please provide price in range 100 - 1 000 000 PLN"); // celowo zwiekszony zakres
            itemPrice = myScanner.nextDouble();
            } while (!isGoodPrice(itemPrice)); // musi byc przeczenie, bo musi sprawdzic dopoki cena nie jest w zakresie
    }

    public boolean isGoodPrice(double itemPrice) { // tu póbuje ustawic liczbe z zakresu 100 do 1_000_000)
/*        if (itemPrice >= 100 && itemPrice <= 1_000_000) {
            return true;
        } else {
            return false; // musi cos zwracac
        }*/

        return (itemPrice >= 100 && itemPrice <= 1_000_000); // 1_000_000 od Javy 7 lub 8 zeby lepiej bylo widac

    }

    void askForInstallment() {
        do {
            System.out.println("Please provide number of installments in between 6 and 96"); // celowo zwiekszone
            numberOfInstallment = myScanner.nextInt();
        } while (!isGoodInstallment(numberOfInstallment));
    }

    public boolean isGoodInstallment(double numberOfInstallment) {
        return (numberOfInstallment >= 6 && numberOfInstallment <= 96);
    }

    double countInstallment() {
        double rate; // WPROWADZAM zmienna lokalną, żeby nie przepisywać tego samego kodu kilka razy

        if (numberOfInstallment >= 6 && numberOfInstallment <= 12) {
            rate = 0.025;
        } else if (numberOfInstallment >= 13 && numberOfInstallment <= 24) {
            rate = 0.05;
        } else if (numberOfInstallment >= 25 && numberOfInstallment <= 96) {
            rate = 0.1;
        } else { // MUSZĘ JESZCZE NAPISAĆ, co gdy nie jest z przedziału 6-96
            throw new IllegalArgumentException("Provide 6-96 as argument");
        }

        double installment = (itemPrice * (1 + rate)) / numberOfInstallment;

        return installment;
    }

    public static void main(String[] args) {
        KozakZadanie5 kozakZadanie5 = new KozakZadanie5();

        kozakZadanie5.askForPrice();

        kozakZadanie5.askForInstallment();

        double installment = kozakZadanie5.countInstallment();

        System.out.println("When you have " + kozakZadanie5.numberOfInstallment + " rates, your installment will be " + installment);

/*      kozakZadanie5.isGoodPrice(kozakZadanie5.itemPrice);

        System.out.println("Please provide the number of installments");
        boolean goodInstallment = kozakZadanie5.isGoodInstallment(kozakZadanie5.numberOfInstallment);

        System.out.println("When you have " + kozakZadanie5.numberOfInstallment + " rates, your installment will be " + goodInstallment);*/
    }
}
