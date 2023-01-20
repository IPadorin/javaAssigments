package streamAPI.dto;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThingDto {
    private String uuid;
    private String name;
    private Calendar date;
    private int groupId;

    public ThingDto(String uuid, String name, Calendar date, int groupId) {
        this.uuid = uuid;
        this.name = name;
        this.date = date;
        this.groupId = groupId;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Calendar getDate() {
        return date;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return "ThingDto{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", date=" + format.format(date.getTime()) +
                ", groupId=" + groupId +
                '}';
    }
}
