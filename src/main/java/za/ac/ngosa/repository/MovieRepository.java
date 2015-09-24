package za.ac.ngosa.repository;

import za.ac.ngosa.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {
    @Override
    public Movie findOne(Long code);
}
