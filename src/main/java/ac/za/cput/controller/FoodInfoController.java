package ac.za.cput.controller;

import ac.za.cput.domain.FoodInfo;
import ac.za.cput.factories.FoodInfoFactory;
import ac.za.cput.repositories.FoodInfoRepository;
import ac.za.cput.services.Impl.FoodInfoServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/foodinfo")
public class FoodInfoController {


    @Autowired
    private FoodInfoServiceImpl foodInfoService;

    @GetMapping(path="/all")
    public @ResponseBody List<FoodInfo> getAllFoodInfo(){
        return  foodInfoService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addFoodInfo(@RequestBody FoodInfo foodInfo){
        foodInfoService.create(foodInfo);
    }

    @RequestMapping(value="/find{foodPictureID}")
    public @ResponseBody FoodInfo findFoodInfo(@PathVariable String foodPictureID){
        return foodInfoService.read(foodPictureID);
    }

    @RequestMapping(value="/update/{foodPictureID}",method = RequestMethod.PUT)
    public void updateFoodInfo(@RequestBody FoodInfo foodInfo, @PathVariable String foodPictureID){
        foodInfoService.update(foodPictureID, foodInfo);
    }

    @RequestMapping(value="/delete/{foodPictureID}",method = RequestMethod.DELETE)
    public void deleteFoodInfo(@PathVariable String foodPictureID){
        foodInfoService.delete(foodPictureID);
    }
}