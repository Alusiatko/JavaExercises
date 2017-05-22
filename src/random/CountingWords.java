package random;

import java.util.HashMap;
import java.util.Map;

// działa
public class CountingWords {
    Map<String, Integer> countWord(String text) {
        Map<String, Integer> counter = new HashMap<>();
        String[] words = text.split(" "); // ma zamienić podany tekst na tablice Stringow
        for (String word : words) {
            if (counter.containsKey(word)) {
                // tu był BŁĄD: to jest MAPA, a nie tablica, wiec zamiast "counter[word] += 1;" MA BYĆ:
                counter.put(word, counter.get(word) + 1); // jak już jest to zwiększ "wartość"
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
