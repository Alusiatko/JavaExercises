package random;

public class PalindromWithStringBuffer {
    boolean isPalindrom(String string) {
        StringBuffer palindrom = new StringBuffer(string);
        System.out.println(palindrom);      // sprawdzam co kryje się pod palindrom
        String reversedPalindrom = new String(palindrom.reverse());
        System.out.println(reversedPalindrom);      // sprawdzam co wyswietla się po stworzeniu drugiego obiektu
        if (string.equals(reversedPalindrom)) {
            System.out.println(reversedPalindrom);
            return true;
        }
        System.out.println(string.hashCode());
        System.out.println(palindrom.hashCode());       // dodałam hashCode() i maja rozne
        System.out.println(reversedPalindrom.hashCode());
        return false;
    }
    public static void main(String[] args) {
        PalindromWithStringBuffer playWithStringBuffer = new PalindromWithStringBuffer();
        System.out.println(playWithStringBuffer.isPalindrom("madam"));
    }
}
