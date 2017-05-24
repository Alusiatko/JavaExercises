package kozak.zadania1;


import java.util.Scanner;

public class KozakZadanie1 {
    Scanner myTemperature = new Scanner(System.in);

    double readTemperature() {
        return myTemperature.nextDouble();
    }

    double countTemperature(double temperature) {
        //Magiczne numerki. Lepiej użyć w tym przypadku stałych. 32 to jest bodajże punkt zamarzania wody w stopniach Farenheita.
        //final int waterFreezeTemperature = 32;
        //final double scaleRiseRation = 1.8;
        //return scaleRiseRation * temperature + waterFreezeTemperature;
        return 1.8*temperature+32;
    }

    public static void main(String[] args) {
        KozakZadanie1 kozakZadanie1 = new KozakZadanie1();

        System.out.println("Please provide today's temperature in your city ");
        
        //trzymaj się jednego języka podczas nazywania nazw zmiennych
        //double celsiusTemperature = kozakZadanie1.readTemperature();
        double celcjuszTemperature = kozakZadanie1.readTemperature();

        double farentheitTemperature = kozakZadanie1.countTemperature(celcjuszTemperature);

        System.out.println("Your temperature in Farenheit is " + farentheitTemperature);
    }
}
