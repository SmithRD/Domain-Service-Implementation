package ac.za.cput.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FoodInfo implements Serializable {
    private String foodName;
    private String foodPictureID;
    private Boolean foodStateActive;
    private DietaryLaw dietaryLaw;
    private FoodCoarse foodCoarse;
    private Restaurant restaurant;

    public String getFoodName() {
        return foodName;
    }

    public String getFoodPictureID() {
        return foodPictureID;
    }

    public Boolean getFoodStateActive() {
        return foodStateActive;
    }

    public DietaryLaw getDietaryLaw() {
        return dietaryLaw;
    }

    public FoodCoarse getFoodCoarse() {
        return foodCoarse;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public FoodInfo(){
        List<FoodRating>foodRating  = new ArrayList<FoodRating>();
    }

    public FoodInfo(Builder builder) {
        this.foodName = builder.foodName;
        this.foodPictureID = builder.foodPictureID;
        this.foodStateActive = builder.foodStateActive;
        this.dietaryLaw = builder.dietaryLaw;
        this.foodCoarse = builder.foodCoarse;
        this.restaurant = builder.restaurant;
    }

    public static class Builder{
        private String foodName;
        private String foodPictureID;
        private Boolean foodStateActive;
        private DietaryLaw dietaryLaw;
        private FoodCoarse foodCoarse;
        private Restaurant restaurant;

        public Builder foodName(String value){
            this.foodName = value;
            return this;
        }

        public Builder foodPictureID(String value){
            this.foodPictureID = value;
            return this;
        }

        public Builder foodStateActive(Boolean value){
            this.foodStateActive = value;
            return this;
        }

        public Builder dietaryLaw(DietaryLaw value){
            this.dietaryLaw = value;
            return this;
        }

        public Builder  foodCoarse(FoodCoarse value){
            this. foodCoarse = value;
            return this;
        }

        public Builder  restaurant(Restaurant value){
            this. restaurant = value;
            return this;
        }

        public FoodInfo build(){
            return new FoodInfo(this);
        }
    }

}
