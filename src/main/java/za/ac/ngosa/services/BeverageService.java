package za.ac.ngosa.services;

import za.ac.ngosa.domain.Beverage;

import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
public interface BeverageService {

    List<Beverage> getBeverages();

    Beverage getBeverageByID(long id);
    Beverage addBeverage(Beverage beverage);
    void removeBeverage(Beverage beverage);
    Beverage updateBeverage(Beverage beverage);

}
