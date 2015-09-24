package za.ac.ngosa.repository;

import za.ac.ngosa.domain.ScreeningRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface ScreeningRoomRepository extends CrudRepository<ScreeningRoom,Long> {
    @Override
    ScreeningRoom findOne(Long code);
}
