package za.ac.ngosa.factory;

import za.ac.ngosa.domain.Schedule;

import java.util.Map;

/**
 * Created by User on 2015/08/10.
 */
public class ScheduleFactory {

    public static Schedule createSchedule(
            Map<String,String> values, int duration, long
            id, int startTime)
    {
        Schedule schedule= new Schedule
                .Builder(id)
                .title(values.get("title"))
                .duration(duration)
                .startTime(startTime)
                .endTime()
                .build();

        return schedule;
    }
}
