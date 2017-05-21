package random;

import java.util.Stack;

// zadanie działa, ale jeszcze nie do końca poprawnie
public class CheckingParenthesis {
    boolean isValid(String expression) {

        //char[] myChar = expression.toCharArray();
        Stack<Character> myStack = new Stack<>(); // nie musi być "new Stack<Character>()" bo ten sam typ generyczny
        System.out.println(myStack + "początek stacku");

        for (int i = 0; i < expression.length(); i++) {
            System.out.println(expression.charAt(i)); // spr czy poprawnie czyta
            //System.out.print(myChar[i]); spr czy poprawnie czyta
            if ((expression.charAt(i) == '(') || (expression.charAt(i) == '{') || (expression.charAt(i) == '[')) {
                myStack.push(expression.charAt(i));
                System.out.println("obecny stack " + myStack);
            } else if ((expression.charAt(i) == ')') || (expression.charAt(i) == '}') || (expression.charAt(i) == ']')) {
                /* bo MUSZE! jeszcze sprawdzić czy element na gorze stosu to jest ten sam nawias zamykający,
                bez poniższego źle liczyło przy np. "([]{(}))"
                 */
                if (expression.charAt(i) == myStack.peek()) {
                    myStack.pop();
                    System.out.print("obecny stack " + myStack);
                }
            }
        }

        if (myStack.isEmpty()) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        CheckingParenthesis cp = new CheckingParenthesis();
        boolean valid = cp.isValid("([]{}())");
        System.out.println("Is expression valid? " + valid);
    }
}
