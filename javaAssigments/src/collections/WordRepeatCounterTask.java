package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordRepeatCounterTask {
    public static String getWordRepeatCount(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "").split("\\s+")));
        Collections.sort(list);

        int count = -1;
        String prevWord = (list.size() == 0) ? null : list.get(0);
        StringBuilder result = new StringBuilder();
        for(String word: list) {
            if(word.equals(prevWord)) {
                count++;
            } else {
                result.append(prevWord + "(" + ++count + ")\n");
                prevWord = word;
                count =0;
            }
        }
        result.append(prevWord + "(" + ++count + ")\n");
        return result.toString();
    }
}
