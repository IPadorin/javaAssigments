import collections.LetterRepeatCounterTask;
import collections.MyArrayList;
import common.CommonMethods;
import streamAPI.CreatorDtoList;
import streamAPI.StreamTask;
import streamAPI.dto.GroupDto;
import streamAPI.dto.ThingDto;
import string.StringTask;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println( StreamTask.createThingDtoMap());

        System.out.println(StreamTask.createGroupDtoMap());

        System.out.println(StreamTask.groupDtoListJoinThingDtoList());

        System.out.println(StreamTask.groupDtoListFilteredByDate());

//        System.out.println("=======Своя коллекция ArrayList===================================================");
//        MyArrayList<String> myList = new MyArrayList<>();
//        myList.add("1");
//        myList.add("2");
//        myList.add("3");
//        myList.add("4");
//        myList.add("5");
//        System.out.println(myList);
//        myList.remove(myList.size() - 1);
//        System.out.println(myList);
//        myList.remove(0);
//        System.out.println(myList);
//        for(String str: myList) {
//            System.out.println(str);
//        }
//        System.out.println("===================================================================================");
//
//        String str = "Новый год по-немецки\n" +
//                "Наступил Новый год.\n" +
//                "И как всегда, мы с нетерпением ждем его наступления, загадываем желания и верим, что они обязательно сбудутся.\n" +
//                "А вот как встречают Новый год в других странах, например, в Германии или Японии?\n" +
//                "В Германии, где Новый год является национальным праздником, этот праздник отмечают не только в кругу семьи, но и в школах, детских садах и детских домах.\n" +
//                "Дети готовят для своих родителей поздравления на немецком языке, а также подарки, сделанные своими руками.";
//        System.out.println(str);
//        System.out.println("=======Строка наоборот===================================================");
//        System.out.println(StringTask.getReverseString(str));
//        System.out.println("=======Количество повторяющих слов===================================================");
////        System.out.println(WordRepeatCounterTask.getWordRepeatCount(str));
//        System.out.println("=======Количество повторяющих буквв===================================================");
//        System.out.println(LetterRepeatCounterTask.getLetterRepeatCount(str));
    }
}