package streamAPI;

import common.CommonMethods;
import streamAPI.dto.GroupDto;
import streamAPI.dto.ThingDto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.Random;

public class CreatorDtoList {
    public static List<ThingDto> createThhingList(List<ThingDto> thingList) {
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Шапка", CommonMethods.generateDate(), 1));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Куртка", CommonMethods.generateDate(), 1));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Стул", CommonMethods.generateDate(), 2));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Телевизор", CommonMethods.generateDate(), 3));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Шкаф", CommonMethods.generateDate(), 2));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Тарелка", CommonMethods.generateDate(), 4));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Ботинки", CommonMethods.generateDate(), 1));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Чайник", CommonMethods.generateDate(), 3));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Утюг", CommonMethods.generateDate(), 3));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Чашка", CommonMethods.generateDate(), 4));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Диван", CommonMethods.generateDate(), 2));
        thingList.add(new ThingDto(UUID.randomUUID().toString(), "Сковорода", CommonMethods.generateDate(), 4));
        return thingList;
    }

    public static List<GroupDto> createGroupList(List<GroupDto> groupList) {
        groupList.add(new GroupDto(1, "Одежда"));
        groupList.add(new GroupDto(2, "Мебель"));
        groupList.add(new GroupDto(3, "Электроника"));
        groupList.add(new GroupDto(4, "Посуда"));
        return groupList;
    }
}
