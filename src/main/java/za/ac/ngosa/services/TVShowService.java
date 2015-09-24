package za.ac.ngosa.services;

import za.ac.ngosa.domain.TVShow;

import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
public interface TVShowService {
    List<TVShow> getTVShow();

    TVShow getTVShowByID(long id);
    TVShow addTVShow(TVShow tvShow);
    void removeTVShow(TVShow tvShow);
    TVShow updateTVShow(TVShow tvShow);
}
