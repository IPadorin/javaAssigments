package streamAPI;

import common.CommonMethods;
import streamAPI.dto.GroupDto;
import streamAPI.dto.ThingDto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTask {
    private static List<ThingDto> thingDtoList = CreatorDtoList.createThhingList(new ArrayList<>());
    private static List<GroupDto> groupDtoList = CreatorDtoList.createGroupList(new ArrayList<>());

    static public String createThingDtoMap() {
        Map<String, ThingDto> thingDtoMap = thingDtoList.stream()
                .collect(Collectors.toMap(ThingDto::getUuid, Function.identity()));
        StringBuilder result = new StringBuilder();
        thingDtoMap.forEach((uuid, thingDto) -> {
            result.append("uuid = " + uuid + " " + thingDto + "\n");
        });
        return result.toString();
    }

    static public String createGroupDtoMap() {
        Map<Integer, GroupDto> groupDtoMap = groupDtoList.stream()
                .collect(Collectors.toMap(GroupDto::getId, Function.identity()));
        StringBuilder result = new StringBuilder();
        groupDtoMap.forEach((id, groupDto) -> {
            result.append("id = " + id + " " + groupDto + "\n");
        });
        return result.toString();
    }

    static public String groupDtoListJoinThingDtoList() {
        groupDtoList.stream().map(groupDto -> {
            groupDto.setThingDtoList(thingDtoList.stream().filter(thingDto -> thingDto.getGroupId() == groupDto.getId()).collect(Collectors.toList()));
            return groupDto;
        }).collect(Collectors.toList());

        StringBuilder result = new StringBuilder();
        groupDtoList.forEach(groupDto -> result.append(groupDto + "\n"));
        return result.toString();
    }

    static public String groupDtoListFilteredByDate() {
        Calendar filterDate = CommonMethods.generateDate();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Дата фильтрации "+format.format(filterDate.getTime()));
        groupDtoList = groupDtoList.stream()
                .map(groupDto -> {
                    groupDto.setThingDtoList(groupDto.getThingDtoList().stream().filter(thingDto -> thingDto.getDate().get(Calendar.DAY_OF_YEAR) > filterDate.get(Calendar.DAY_OF_YEAR)).collect(Collectors.toList()));
                    return groupDto;
                })
                .filter(groupDto -> groupDto.getThingDtoList().size() > 0)  // создает новый объект, поэтому надо выполнять через присвоение
                .collect(Collectors.toList());

        StringBuilder result = new StringBuilder();
        groupDtoList.forEach(groupDto -> result.append(groupDto + "\n"));
        return result.toString();
    }
}
