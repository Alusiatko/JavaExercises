package kozak.zadania1;

import java.util.Scanner;

public class KozakZadanie3 {
    Scanner myScanner = new Scanner(System.in);

    double takeWeight() {
        return myScanner.nextDouble();
    }

    double takeHeight() {
        return myScanner.nextDouble();
    }

    double countBMI(double weight, double height){
        return weight/(height*height);
    }

    void giveInstruction(double weight, double height) {
        double BMI = countBMI(weight, height);

        System.out.println("Twoje BMI to: " + BMI);

        if (BMI < 18.5) {
            System.out.println("Niedowaga");
        } else if (BMI >= 18.5 & BMI <= 24.9) {
            System.out.println("Waga prawidlowa");
        } else {
            System.out.println("Nadwaga");
        }
    }

    public static void main(String[] args) {
        KozakZadanie3 kozakZadanie3 = new KozakZadanie3();

        System.out.println("Podaj wage w kg");

        double weight = kozakZadanie3.takeWeight();

        System.out.println("Podaj wzrost w metrach");

        double height = kozakZadanie3.takeHeight();

        kozakZadanie3.giveInstruction(weight, height);
    }
}
