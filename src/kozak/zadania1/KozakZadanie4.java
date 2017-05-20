package kozak.zadania1;

import java.util.Scanner;

public class KozakZadanie4 {

    Scanner myScanner = new Scanner(System.in);

    double readIncome() {
        return myScanner.nextDouble();
    }

    double countTax(double income) {

        if (income < 85528) {
           return 0.18*income;
        } else {
           return 14839.02 + 0.32*(income-85528);
        }
    }

    public static void main(String[] args) {

        System.out.println("Please provide your last year income");

        KozakZadanie4 kozakZadanie4 = new KozakZadanie4();
//        kozakZadanie4.readIncome();            TO BYŁO NIEPOTRZEBNE!!!
        double incomeTax = kozakZadanie4.countTax(kozakZadanie4.readIncome());

        System.out.println("Your tax is " + incomeTax);
    }
}
