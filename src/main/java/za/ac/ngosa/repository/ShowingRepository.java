package za.ac.ngosa.repository;

import za.ac.ngosa.domain.Showing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface ShowingRepository extends CrudRepository<Showing,Long> {

    public Showing findOne(Long code);

}

