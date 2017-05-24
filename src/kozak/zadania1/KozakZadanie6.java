package kozak.zadania1;

import java.util.Scanner;

public class KozakZadanie6 {
    Scanner myScanner = new Scanner(System.in);

    void giveInformation() {
        System.out.println("Hello! I'm your new calculator. You can use +, -, * or /");
    }

    double takeFirstNumber() {
        System.out.println("Please provide first number");
        return myScanner.nextDouble();
    }

    //takeOperator
    String takeSign() {
        System.out.println("Please provide sign");
        return myScanner.next().trim();             // nextLine() nie działał, trim() ucina puste miejsca
    }
    
    //bardzo podobne do takeFirstNumber. 
    //lepiej nazwać funkcje takeNumber i jako parametr przekazać tekst, który będzie wyświetlany na konsoli.
    //w takim pzypadku łatwiej będzie rozszerzać kod
    double takeSecondNumber() {
        System.out.println("Please provide second number");
        return myScanner.nextDouble();
    }

    //calculate
    //lepiej jak by funkcja zwracała wartość a nie wypisywała na konsole. niech wypisywaniem zajmie się inny fragment kodu.
    //w tym przypadku metoda main
    void count(double a, String sign, double b) {
        System.out.println(a + sign + b + " =");

        switch (sign) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b!=0){
                    System.out.println(a / b);
                } else {
                    System.out.println("You CANNOT divide by 0 !!!");
                }
                break;
            default:
                System.out.println("You enter wrong counting sign. You can use +, -, * or /");
        }
    }

    public static void main(String[] args) {
        KozakZadanie6 kozakZadanie6 = new KozakZadanie6();
        kozakZadanie6.giveInformation();

        double v = kozakZadanie6.takeFirstNumber();
        System.out.println("Your first number is " + v);

        String sign = kozakZadanie6.takeSign();
        System.out.println("Your counting sign is " + sign);

        double t = kozakZadanie6.takeSecondNumber();
        System.out.println("Your second number is " + t);

        System.out.println("The result: ");

        kozakZadanie6.count(v, sign, t);
    }
}
