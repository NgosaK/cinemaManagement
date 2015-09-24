package za.ac.ngosa.services;

import za.ac.ngosa.domain.Food;

import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
public interface FoodService {

    List<Food> getFood();

    Food getFoodByID(long id);
    Food addFood(Food food);
    void removeFood(Food food);
    Food updateFood(Food food);

}
