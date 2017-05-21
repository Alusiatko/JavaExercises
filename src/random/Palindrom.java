package random;

public class Palindrom {
    boolean isPalindrom(char[] palindrom, int beginning, int end) {
        if (beginning >= end) {   // tu wcześniej był BŁĄD, bo było palindrom[beginning] <= palindrom[end] !
            return true;
        } else if (palindrom[beginning] != palindrom[end]) {
            return false;
        } else {
            return isPalindrom(palindrom, beginning + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        Palindrom pal = new Palindrom();
        char[] palindrom = {'k', 'a', 'j', 'a', 'k'};

        if (pal.isPalindrom(palindrom, 0, 4)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
