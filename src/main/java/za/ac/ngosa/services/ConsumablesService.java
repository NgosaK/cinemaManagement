package za.ac.ngosa.services;

import za.ac.ngosa.domain.Beverage;
import za.ac.ngosa.domain.Consumables;

import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
public interface ConsumablesService {

    List<Beverage> getConsumables();
    Consumables getConsumables(long id);
    Consumables addConsumables(Beverage consumables);
    void removeConsumables(Beverage consumables);
    Consumables updateConsumables(Beverage consumables);
}
