package kozak.zadania1;


import java.util.Scanner;

public class KozakZadanie1 {
    Scanner myTemperature = new Scanner(System.in);

    double readTemperature() {
        return myTemperature.nextDouble();
    }

    double countTemperature(double temperature) {
        return 1.8*temperature+32;
    }

    public static void main(String[] args) {
        KozakZadanie1 kozakZadanie1 = new KozakZadanie1();

        System.out.println("Please provide today's temperature in your city ");

        double celcjuszTemperature = kozakZadanie1.readTemperature();

        double farentheitTemperature = kozakZadanie1.countTemperature(celcjuszTemperature);

        System.out.println("Your temperature in Farenheit is " + farentheitTemperature);
    }
}
