package random;

import java.util.Stack;

// działa poprawnie
public class CheckingParenthesis {
    boolean isValid(String expression) {

        Stack<Character> myStack = new Stack<>(); // nie musi być "new Stack<Character>()" bo ten sam typ generyczny

        for (int i = 0; i < expression.length(); i++) {
            if ((expression.charAt(i) == '(') || (expression.charAt(i) == '{') || (expression.charAt(i) == '[')) {
                myStack.push(expression.charAt(i));
            } else if ((expression.charAt(i) == ')') || (expression.charAt(i) == '}') || (expression.charAt(i) == ']')) {
                /* MUSZE jeszcze sprawdzić czy element na gorze stosu to jest ten sam nawias zamykający,
                bez poniższego źle liczyło przy np. "([]{(}))"
                 */
                if (leftParenthesis(expression.charAt(i)) == myStack.peek()) {
                    myStack.pop();
                }
            }
        }
        return myStack.isEmpty();
    }

    private char leftParenthesis(char rightParenthesis) {
        if (rightParenthesis == ')') {
            return '(';
        } else if (rightParenthesis == ']') {
            return '[';
        } else if (rightParenthesis == '}') {
            return '{';
        } else {
            throw new IllegalArgumentException("Argument is not left parenthese");
        }
    }

    public static void main(String[] args) {
        CheckingParenthesis cp = new CheckingParenthesis();
        boolean valid = cp.isValid("([]{}(())");
        System.out.println("Is expression valid? " + valid);
    }
}
