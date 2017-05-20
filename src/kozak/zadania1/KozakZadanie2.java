package kozak.zadania1;

import java.util.Scanner;

public class KozakZadanie2 {
    Scanner intNumber = new Scanner(System.in);

    int giveIntNumber() {
        return intNumber.nextInt();
    }

    int provideMaxNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    int provideMinNumber(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        KozakZadanie2 kozakZadanie2 = new KozakZadanie2();

        System.out.println("Podaj trzykrotnie dowolna liczbe cakowita i nacisninj Enter za kazdym razem");

        int g = kozakZadanie2.giveIntNumber();
        int w = kozakZadanie2.giveIntNumber();
        int z = kozakZadanie2.giveIntNumber();

        System.out.println("Podane przez Ciebie liczby to " + g + " oraz " + w + " a takze " + z);

        System.out.println("Najwieksza z podanych przez Ciebie liczb to " + kozakZadanie2.provideMaxNumber(g, w, z));

        System.out.println("Najmniejsza z podanych przez Ciebie liczb to " + kozakZadanie2.provideMinNumber(g, w, z));
    }
}
