package za.ac.ngosa.repository;

import za.ac.ngosa.domain.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface FoodRepository extends CrudRepository<Food,Long> {

    public Food findOne(Long code);
}
