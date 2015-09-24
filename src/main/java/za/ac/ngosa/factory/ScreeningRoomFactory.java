package za.ac.ngosa.factory;

import za.ac.ngosa.domain.ScreeningRoom;

import java.util.Map;

/**
 * Created by User on 2015/08/10.
 */
public class ScreeningRoomFactory {

    public static ScreeningRoom createScreeningRoom(
            Map<String,String> values, int size,long id)
    {
        ScreeningRoom screeningRoom=new ScreeningRoom
                .Builder(id)
                .type(values.get("type"))
                .size(size)
                .build();

        return screeningRoom;
    }
}
