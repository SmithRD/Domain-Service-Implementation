package ac.za.cput.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Restaurant implements Serializable {

    @Id
    private String restaurantID;
    private String restaurantName;
    private Boolean restaurantVerifide;
    private Boolean restaurantActive;
    private String businessNumber1;
    private String businessNumber2;
    private String websiteURL;
    private String locationArea;
    private String resAddress1;
    private String resAddress2;
    private Integer resPostalCode;

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantID() { return restaurantID; }

    public Boolean getRestaurantVerifide() {
        return restaurantVerifide;
    }

    public Boolean getRestaurantActive() {
        return restaurantActive;
    }


    public String getBusinessNumber1() {
        return businessNumber1;
    }

    public String getBusinessNumber2() {
        return businessNumber2;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public String getResAddress1() {
        return resAddress1;
    }

    public String getResAddress2() {
        return resAddress2;
    }

    public Integer getResPostalCode() {
        return resPostalCode;
    }

    public Restaurant() {
    }

    public Restaurant(Builder builder) {
        this.restaurantName = builder.restaurantName;
        this.restaurantID = builder.restaurantID;
        this.restaurantVerifide = builder.restaurantVerifide;
        this.restaurantActive = builder.restaurantActive;
        this. businessNumber1 = builder. businessNumber1;
        this.businessNumber2 = builder.businessNumber2;
        this.websiteURL = builder.websiteURL;
        this.locationArea = builder.locationArea;
        this.resAddress1 = builder.resAddress1;
        this.resAddress2 = builder.resAddress2;
        this.resPostalCode = builder.resPostalCode;

    }

    public static class Builder {
        private String restaurantName;
        private String restaurantID;
        private Boolean restaurantVerifide;
        private Boolean restaurantActive;
        private String businessNumber1;
        private String businessNumber2;
        private String websiteURL;
        private String locationArea;
        private String resAddress1;
        private String resAddress2;
        private Integer resPostalCode;


        public Builder restaurantName(String value) {
            this.restaurantName = value;
            return this;
        }

        public Builder restaurantID(String value) {
            this.restaurantID = value;
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

        public Builder businessNumber1(String value){
            this.businessNumber1 = value;
            return this;
        }

        public Builder businessNumber2(String value){
            this.businessNumber2 = value;
            return this;
        }

        public Builder websiteURL(String value){
            this.websiteURL = value;
            return this;
        }

        public Builder locationArea(String value){
            this.locationArea = value;
            return this;
        }

        public Builder resAddress1(String value){
            this.resAddress1 = value;
            return this;
        }

        public Builder resAddress2(String value){
            this.resAddress2 = value;
            return this;
        }

        public Builder resPostalCode(Integer value){
            this.resPostalCode = value;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }

    }
}