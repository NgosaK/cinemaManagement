package za.ac.ngosa.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by OWNER on 2015/04/24.
 */

@RestController
@RequestMapping("/api/**")
public class HomePage {

    //@Autowired
   // private ScreeningRoomService service;

    @RequestMapping(value="home",method= RequestMethod.GET)
    public String Index() {
        return "<h1>Welcome to the CINEMA MANAGEMENT APPLICATION</h1>" +
                "<p>This application corresponds to the Technical Programming 2 course</p>" +
                "<p>Silver or lead</p>";
    }
    /*@RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/screeningRoom", method = RequestMethod.GET)
    public ScreeningRoom getScreeningRooms(){
        ScreeningRoom screeningRoom = new ScreeningRoom.Builder(453).size(50).type("IMAX").build();

        return screeningRoom;
    }

    @RequestMapping(value = "/cinemas", method = RequestMethod.GET)
    public List<ScreeningRoom> getScreeningRoom(){
        return service.getScreeningRooms();
    }*/




}
