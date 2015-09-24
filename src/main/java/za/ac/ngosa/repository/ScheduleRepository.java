package za.ac.ngosa.repository;

import za.ac.ngosa.domain.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Long> {
    @Override
    public Schedule findOne(Long code);
}
