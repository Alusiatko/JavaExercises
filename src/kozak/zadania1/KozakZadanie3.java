package kozak.zadania1;

import java.util.Scanner;

public class KozakZadanie3 {
    Scanner myScanner = new Scanner(System.in);

    //takeWeight oraz takeHeight to jest duplikacja kodu. Może lepiej byłoby po prostu stworzyć funkcję readInput.
    double takeWeight() {
        return myScanner.nextDouble();
    }

    double takeHeight() {
        return myScanner.nextDouble();
    }

    //funkcja powinna nazywac się calculateBmi.
    //count sugeruje, że liczona jest ilość a nie wartość
    double countBMI(double weight, double height){
        return weight/(height*height);
    }

    void giveInstruction(double weight, double height) {
        double BMI = countBMI(weight, height);

        System.out.println("Twoje BMI to: " + BMI);

        //magiczne cyferki. lepiej zastąpić je zmiennymi/stałymi, których nazwa wskazywałaby znaczenie tych liczb.
        //Tekst wypisywany na konsole można by zapisać do zmiennej i mieć tylko jeden raz System.out.println.
        //To na wypadek gdyby zaszłapotrzeba zwrócenia tego tekstu w innej postaci. Wtedy zmiana byłaby tylko w jednym miejscu a nie trzech.
        //Warte rozważenia byłoby stworzenie klasy BmiCalculator, która w konstruktorze dostałaby wzrost i wagę a metoda Calculate zwracałaby test.
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
