package streamAPI.dto;

import java.util.List;

public class GroupDto {
    private int id;
    private String name;

    private List<ThingDto> thingDtoList;

    public GroupDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ThingDto> getThingDtoList() {
        return thingDtoList;
    }

    public void setThingDtoList(List<ThingDto> thingDtoList) {
        this.thingDtoList = thingDtoList;
    }

    @Override
    public String toString() {
        return "GroupDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", thingDtoList=" + thingDtoList +
                '}';
    }
}
