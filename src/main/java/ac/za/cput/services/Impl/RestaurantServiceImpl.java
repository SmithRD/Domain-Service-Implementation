package ac.za.cput.services.Impl;

import ac.za.cput.domain.Restaurant;
import ac.za.cput.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class RestaurantServiceImpl {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAll(){
        List<Restaurant> restaurants = new ArrayList<>();
        restaurantRepository.findAll()
                .forEach(restaurants::add);
        return restaurants;
    }

    public Restaurant create(Restaurant entity){
        return restaurantRepository.save(entity);
    }

    public Restaurant read(String restaurantID){
        return restaurantRepository.findOne(restaurantID);
    }

    public Restaurant update(String restaurantID, Restaurant restaurants){
        return restaurantRepository.save(restaurants);
    }

    public void delete(String restaurantID){
        restaurantRepository.delete(restaurantID);
    }



}
