package za.ac.ngosa.factory;

import za.ac.ngosa.domain.Movie;
import za.ac.ngosa.domain.TVShow;

import java.util.Map;

/**
 * Created by User on 2015/08/10.
 */
public class ShowingFactory {

    public static Movie createMovie(
            Map<String,String> values, double price, long
            id) {
        Movie movie = new Movie
                .Builder(id)
                .price(price)
                .type(values.get("type"))
                .genre(values.get("genre"))
                .duration(values.get("duration"))
                .title(values.get("title"))
                .build();

        return movie;
    }

    public static TVShow createTVShow(
            Map<String,String> values, long id,double price)
    {
        TVShow tvShow= new TVShow
                .Builder(id)
                .title(values.get("title"))
                .season(values.get("season"))
                .price(price)
                .genre(values.get("genre"))
                .duration(values.get("duration"))
                .build();

        return tvShow;
    }
}
