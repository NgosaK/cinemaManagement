package za.ac.ngosa.services.impl;

import za.ac.ngosa.domain.Beverage;
import za.ac.ngosa.domain.Consumables;
import za.ac.ngosa.repository.BeverageRepository;
import za.ac.ngosa.services.ConsumablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
@Service
public class ConsumableServiceImpl implements ConsumablesService {

    @Autowired
    BeverageRepository repository;

    public List<Beverage> getConsumables()
    {
        List<Beverage> allConsumables= new ArrayList<>();

        Iterable<Beverage> consumableses= repository.findAll();
        for(Beverage consumables: consumableses)
        {
            allConsumables.add(consumables);
        }
        return allConsumables;
    }

    @Override
    public Consumables getConsumables(long id) {
        return repository.findOne(id);
    }

    @Override
    public Consumables addConsumables(Beverage consumables) {

        return repository.save(consumables);
    }

    @Override
    public void removeConsumables(Beverage consumables) {
        repository.delete(consumables);

    }

    @Override
    public Consumables updateConsumables(Beverage consumables) {

        return repository.save(consumables);
    }

}
