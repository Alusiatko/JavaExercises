package random;

/* zadanie ma pobierać element dowolnej tablicy, który ma najmniejszą wartość względną i bezwzględną w tej tablicy,
np. z tablicy {2, -2, 5, -6, 8} ma zwrócić "-2"*/
public class TheLowestAbstractValue {
    int count(int[] myArray) {
        // szukam najmiejszej wartości, więc na początku ustawiam zmienną lokalną na największą wartość dla inta
        int theLowestValue = Integer.MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            /* porównuje wartość bezwzględną obecnego elementu tablicy z obecną wartością theLowestValue
            i przypisuję do theLowestValue mniejszą liczbę */
            if ((Math.abs(myArray[i])) < theLowestValue) { // brakowało nawiasów, przez co całe wyrazenie źle sie liczylo
                theLowestValue = myArray[i];
            } else if ((Math.abs(myArray[i])) == theLowestValue) { // brakowało nawiasów, przez co całe wyrazenie źle sie liczylo
                theLowestValue = Math.min(theLowestValue, myArray[i]);
            }
        }
        return theLowestValue;
    }

    public static void main(String[] args) {
        TheLowestAbstractValue tlav = new TheLowestAbstractValue();
        int result = tlav.count(new int[]{2, -2, 5, -6, 8});
        System.out.println(result);
        int res2 = tlav.count(new int[]{7, 13, 6, -6, 15});
        System.out.println(res2);
    }
}