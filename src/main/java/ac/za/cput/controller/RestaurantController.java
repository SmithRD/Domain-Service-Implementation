package ac.za.cput.controller;


import ac.za.cput.domain.Restaurant;
import ac.za.cput.factories.RestaurantFactory;
import ac.za.cput.repositories.RestaurantRepository;
import ac.za.cput.services.Impl.RestaurantServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path="/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantServiceImpl restaurantService;

    @GetMapping(path="/all")
    public @ResponseBody List<Restaurant> getAllRestaurants(){
        return  restaurantService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.create(restaurant);
    }

    @RequestMapping(value="/find{restaurantID}")
    public @ResponseBody Restaurant findRestaurant(@PathVariable String restaurantID){
        return restaurantService.read(restaurantID);
    }

    @RequestMapping(value="/update/{restaurantID}", method = RequestMethod.PUT)
    public void updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable String restaurantID){
        restaurantService.update(restaurantID, restaurant);
    }

    @RequestMapping(value="/delete/{restaurantID}", method = RequestMethod.DELETE)
    public void deleteRestaurant(@PathVariable String restaurantID){

        restaurantService.delete(restaurantID);
    }
}

