package ac.za.cput.domain;

import java.io.Serializable;
import java.util.Date;

public class Restaurant implements Serializable {
    private String restaurantName;
    private Boolean restaurantVerifide;
    private Boolean restaurantActive;
    private Date restaurantVerificationDate;
    private RestaurantAddress restaurantAddress;
    private Location location;

    public String getRestaurantName() {
        return restaurantName;
    }

    public Boolean getRestaurantVerifide() {
        return restaurantVerifide;
    }

    public Boolean getRestaurantActive() {
        return restaurantActive;
    }

    public Date getRestaurantVerificationDate() {
        return restaurantVerificationDate;
    }

    public RestaurantAddress getRestaurantAddress() {
        return restaurantAddress;
    }

    public Location getLocation() {
        return location;
    }

    public Restaurant() {
        ResOperatingHours resOperatingHours = new ResOperatingHours();
        ResDelivery resDelivery = new ResDelivery();
        ResPaymentMethod resPaymentMethod = new ResPaymentMethod();
        RestaurantContact restaurantContact = new RestaurantContact();
    }

    public Restaurant(Builder builder) {
        this.restaurantName = builder.restaurantName;
        this.restaurantVerifide = builder.restaurantVerifide;
        this.restaurantActive = builder.restaurantActive;
        this.restaurantVerificationDate = builder.restaurantVerificationDate;
        this.restaurantAddress = builder.restaurantAddress;
        this.location = builder.location;
    }

    public static class Builder {
        private String restaurantName;
        private Boolean restaurantVerifide;
        private Boolean restaurantActive;
        private Date restaurantVerificationDate;
        private RestaurantAddress restaurantAddress;
        private Location location;

        public Builder restaurantName(String value) {
            this.restaurantName = value;
            return this;
        }

        public Builder restaurantVerifide(Boolean value) {
            this.restaurantVerifide = value;
            return this;
        }

        public Builder restaurantActive(Boolean value) {
            this.restaurantActive = value;
            return this;
        }

        public Builder restaurantVerificationDate(Date value) {
            this.restaurantVerificationDate = value;
            return this;
        }

        public Builder restaurantAddress(RestaurantAddress value) {
            this.restaurantAddress = value;
            return this;
        }

        public Builder location(Location value) {
            this.location = value;
            return this;
        }


        public Restaurant build() {
            return new Restaurant(this);
        }

    }
}