import collections.LetterRepeatCounterTask;
import collections.WordRepeatCounterTask;
import string.StringTask;

public class Main {
    public static void main(String[] args) {
        String str = "Новый год по-немецки\n" +
                "Наступил Новый год.\n" +
                "И как всегда, мы с нетерпением ждем его наступления, загадываем желания и верим, что они обязательно сбудутся.\n" +
                "А вот как встречают Новый год в других странах, например, в Германии или Японии?\n" +
                "В Германии, где Новый год является национальным праздником, этот праздник отмечают не только в кругу семьи, но и в школах, детских садах и детских домах.\n" +
                "Дети готовят для своих родителей поздравления на немецком языке, а также подарки, сделанные своими руками.";
        System.out.println(str);
        System.out.println("=======Строка наоборот===================================================");
        System.out.println(StringTask.getReverseString(str));
        System.out.println("=======Количество повторяющих слов===================================================");
        System.out.println(WordRepeatCounterTask.getWordRepeatCount(str));
        System.out.println("=======Количество повторяющих буквв===================================================");
        System.out.println(LetterRepeatCounterTask.getLetterRepeatCount(str));
    }
}