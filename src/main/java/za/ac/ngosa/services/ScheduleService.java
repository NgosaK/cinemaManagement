package za.ac.ngosa.services;

import za.ac.ngosa.domain.Schedule;

import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
public interface ScheduleService {
    List<Schedule> getSchedules();

    Schedule getSchedule(long id);
    Schedule addSchedule(Schedule schedule);
    void removeSchedule(Schedule schedule);
    Schedule updateSchedule(Schedule schedule);

}
