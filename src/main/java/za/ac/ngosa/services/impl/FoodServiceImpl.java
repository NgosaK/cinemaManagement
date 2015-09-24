package za.ac.ngosa.services.impl;

import za.ac.ngosa.domain.Food;
import za.ac.ngosa.repository.FoodRepository;
import za.ac.ngosa.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodRepository repository;


    @Override
    public List<Food> getFood() {
        List<Food> allFood = new ArrayList<>();
        Iterable<Food> foods = repository.findAll();
        for (Food food : foods) {
            allFood.add(food);
        }
        return allFood;
    }

    @Override
    public Food getFoodByID(long id) {
        return repository.findOne(id);    }

    @Override
    public Food addFood(Food food) {
        return repository.save(food);
    }

    @Override
    public void removeFood(Food food) {
        repository.delete(food);

    }

    @Override
    public Food updateFood(Food food) {
        return repository.save(food);    }
}
