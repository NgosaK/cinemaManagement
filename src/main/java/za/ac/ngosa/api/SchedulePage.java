package za.ac.ngosa.api;

import za.ac.ngosa.domain.Schedule;
import za.ac.ngosa.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
@RestController
@RequestMapping(value="/schedule/**")
public class SchedulePage {
    @Autowired
    private ScheduleService service;


    //-------------------Retrieve All Subjects--------------------------------------------------------

    @RequestMapping(value = "/schedules/", method = RequestMethod.GET)
    public ResponseEntity<List<Schedule>> listAllSubjects() {
        List<Schedule> Subjects = service.getSchedules();
        if(Subjects.isEmpty()){
            return new ResponseEntity<List<Schedule>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Schedule>>(Subjects, HttpStatus.OK);
    }


    //-------------------Retrieve Single Subject--------------------------------------------------------

    @RequestMapping(value = "/schedule/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Schedule> getSubject(@PathVariable("id") long id) {
        System.out.println("Fetching Subject with id " + id);
        Schedule schedule = service.getSchedule(id);
        if (schedule == null) {
            System.out.println("Subject with id " + id + " not found");
            return new ResponseEntity<Schedule>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Schedule>(schedule, HttpStatus.OK);
    }



    //-------------------Create a Subject--------------------------------------------------------

    @RequestMapping(value = "/schedule/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createSchedule(@RequestBody Schedule schedule,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating Schedule " + schedule.getTitle());

//     USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
//      if (SubjectService.isSubjectExist(Subject)) {
//            System.out.println("A Subject with name " + Subject.getName() + " already exist");
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }

        service.addSchedule(schedule);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/subject/{id}").buildAndExpand(schedule.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //------------------- Update a Subject --------------------------------------------------------

    @RequestMapping(value = "/schedule/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Schedule> updateSchedule(@PathVariable("id") long id, @RequestBody Schedule schedule) {
        System.out.println("Updating Schedule " + id);

        Schedule currentSchedule = service.getSchedule(id);

        if (currentSchedule==null) {
            System.out.println("Schedule with id " + id + " not found");
            return new ResponseEntity<Schedule>(HttpStatus.NOT_FOUND);
        }

        Schedule updatedSchedule = new Schedule
                .Builder(currentSchedule.getId())
                .copy(currentSchedule)
                .build();
        service.updateSchedule(updatedSchedule);
        return new ResponseEntity<Schedule>(updatedSchedule, HttpStatus.OK);
    }

    //------------------- Delete a Subject --------------------------------------------------------

    @RequestMapping(value = "/schedule/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Schedule> deleteSubject(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Schedule with id " + id);

        Schedule schedule = service.getSchedule(id);
        if (schedule == null) {
            System.out.println("Unable to delete. schedule with id " + id + " not found");
            return new ResponseEntity<Schedule>(HttpStatus.NOT_FOUND);
        }

        service.removeSchedule(schedule);
        return new ResponseEntity<Schedule>(HttpStatus.NO_CONTENT);
    }


}