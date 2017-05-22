package random;

import java.util.HashMap;
import java.util.Map;

// jeszcze nie działa poprawnie, krzaczy się w jednym miejscu
public class CountingWords {
    Map<String, Integer> countWord(String text) {
        Map<String, Integer> counter = new HashMap<>();
        String[] words = text.split(" "); // ma zamienić podany tekst na tablice Stringow
        for (String word : words) {
            if (counter.containsKey(word)) {
                // TU SIĘ krzaczy
                counter[word] += 1; // jak już jest to zwieksz "wartość"
            } else {
                counter.put(word, 1); // a jak nie ma to dodaj do mapy, "wartość" ustaw na jeden
            }
        }

        // żeby pobrać klucze i wartości musi być konstrukcja Map.Entry<K, V> nazwaZmiennej = nazwaMapy.entrySet()
        for (HashMap.Entry<String, Integer> pair : counter.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
        return counter;
    }

    public static void main(String[] args) {
        CountingWords cw = new CountingWords();
        cw.countWord("Alicja has a cat and a cat has Alicja");
    }
}
