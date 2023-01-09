package collections;

import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;

public class LetterRepeatCounterTask {
    public static String getLetterRepeatCount(String str) {
        Map<Character, Integer> alphabetMap = new TreeMap<>();
        for(char ch: str.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toCharArray()) {
            if(alphabetMap.containsKey(ch)) {
                alphabetMap.put(ch, alphabetMap.get(ch) + 1);
            } else {
                alphabetMap.put(ch, 1);
            }
        }
        return alphabetMap.toString();
    }
}
