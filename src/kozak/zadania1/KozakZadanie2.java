package kozak.zadania1;

import java.util.Scanner;

public class KozakZadanie2 {
    Scanner intNumber = new Scanner(System.in);

    int giveIntNumber() {
        return intNumber.nextInt();
    }

    //nie wiem jak dokladnie wyglada treść zadania, ale bardziejelastycznym rozwiązaniem byłoby użycie listy jako argumentu.
    //korzystając z Collections.reverse można by wyciągnąć pierwszy element będący największą wartością
    //przy większej ilości elementów ta komenda to byłby tasiemiec, przy którym łatwo o pomyłkę.
    int provideMaxNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    //nie wiem jak dokladnie wyglada treść zadania, ale bardziejelastycznym rozwiązaniem byłoby użycie listy jako argumentu.
    //korzystając z Collections.sort można by wyciągnąć pierwszy element będący najmniejszą wartością
    int provideMinNumber(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        KozakZadanie2 kozakZadanie2 = new KozakZadanie2();

        System.out.println("Podaj trzykrotnie dowolna liczbe cakowita i nacisninj Enter za kazdym razem");

        //Sugeruje używania naz zmiennych, które mają jakieś znaczenie.
        //firstNumber, secondNumber, thirdNumber dużo więcej czasu nie zajmują aby to napisać a czytelność kodu jest o wiele większa
        //kod się pisze dla ludzi, którzy w przyszłości będą go musieli utrzymywać
        int g = kozakZadanie2.giveIntNumber();
        int w = kozakZadanie2.giveIntNumber();
        int z = kozakZadanie2.giveIntNumber();

        //zamiast używać konkatenacji łańcuchów lepiej byłoby po prostu użyć String.format lub tez po prostu System.out.printf
        //System.out.printf("Podane przez Ciebie liczby to %g oraz %w a takze %z", g,w,z);
        //w przypadku użycia kolekcji, byłyby to po prostu kolejne elementy.
        System.out.println("Podane przez Ciebie liczby to " + g + " oraz " + w + " a takze " + z);

        System.out.println("Najwieksza z podanych przez Ciebie liczb to " + kozakZadanie2.provideMaxNumber(g, w, z));

        System.out.println("Najmniejsza z podanych przez Ciebie liczb to " + kozakZadanie2.provideMinNumber(g, w, z));
    }
}
