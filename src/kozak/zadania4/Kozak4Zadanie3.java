package kozak.zadania4;

public class Kozak4Zadanie3 {
    void checkEquality(String word, String word2)  {
        if (word.equals(word2)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Nie palindrom");
        }
    }

    public static void main(String[] args) {
        Kozak4Zadanie2 bTkC = new Kozak4Zadanie2();
        String input = bTkC.takeUserInput();
        String reversedString = bTkC.reverseString(input);

        Kozak4Zadanie3 kozak4Zadanie3 = new Kozak4Zadanie3();

        kozak4Zadanie3.checkEquality(input, reversedString);
    }
}
