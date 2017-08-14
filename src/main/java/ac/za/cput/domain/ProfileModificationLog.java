package ac.za.cput.domain;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProfileModificationLog implements Serializable {
    private String profileType;
    private Date dateOfModification;
    private String reasonForModification;
    private Administrator administrator;
    private List<User> userList;
    private List<FoodInfo> foodInfoList;
    private List<Restaurant> restaurantList;

    public String getProfileType() {
        return profileType;
    }

    public Date getDateOfModification() {
        return dateOfModification;
    }

    public String getReasonForModification() {
        return reasonForModification;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<FoodInfo> getFoodInfoList() {
        return foodInfoList;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public ProfileModificationLog(){

    }

    public ProfileModificationLog(Builder builder) {
        this.profileType = builder.profileType;
        this.dateOfModification = builder.dateOfModification;
        this.reasonForModification = builder.reasonForModification;
        this.administrator = builder.administrator;
        this.userList = builder.userList;
        this.foodInfoList = builder.foodInfoList;
        this.restaurantList = builder.restaurantList;
    }

    public static class Builder{
        private String profileType;
        private Date dateOfModification;
        private String reasonForModification;
        private Administrator administrator;
        private List<User> userList;
        private List<FoodInfo> foodInfoList;
        private List<Restaurant> restaurantList;

        public Builder profileType(String value){
            this.profileType = value;
            return this;
        }

        public Builder dateOfModification(Date value){
            this.dateOfModification = value;
            return this;
        }

        public Builder reasonForModification(String value){
            this.reasonForModification = value;
            return this;
        }

        public Builder administrator(Administrator value){
            this.administrator = value;
            return this;
        }

        public Builder userList(List<User> value){
            this.userList = value;
            return this;
        }

        public Builder foodInfoList(List<FoodInfo> value){
            this.foodInfoList = value;
            return this;
        }

        public Builder restaurantList(List<Restaurant> value){
            this.restaurantList = value;
            return this;
        }

        public ProfileModificationLog build(){
            return new ProfileModificationLog(this);
        }
    }
}
