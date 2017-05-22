package random;

/* zadanie ma pobierać element dowolnej tablicy, który ma najmniejszą wartość względną i bezwzględną w tej tablicy,
np. z tablicy {2, -2, 5, -6, 8} ma zwrócić "-2"*/
public class TheLowestAbstractValue {
    int count(int[] myArray) {
        // szukam najmiejszej wartości, więc na początku ustawiam zmienną lokalną na największą wartość dla inta
        int theLowestValue = Integer.MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            if (Math.abs(myArray[i] < theLowestValue)) {    // tu sie krzaczy!
                theLowestValue = myArray[i];
            } else if (Math.abs(myArray[i] == theLowestValue)) {   // tu sie krzaczy!
                theLowestValue = Math.min(theLowestValue, myArray[i]);
            }
        }
        return theLowestValue;
    }

    public static void main(String[] args) {
        TheLowestAbstractValue tlav = new TheLowestAbstractValue();
        int result = tlav.count(new int[]{2, -2, 5, -6, 8});
        System.out.println(result);
    }
}
