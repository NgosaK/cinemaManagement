package za.ac.ngosa.repository;

import za.ac.ngosa.domain.Beverage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface BeverageRepository extends CrudRepository<Beverage,Long>
{
    public Beverage findOne(Long code);


}
