package ac.za.cput.domain;

import java.io.Serializable;

public class Location implements Serializable {
    private String locationArea;
    private String locationName;


    public String getLocationArea() {
        return locationArea;
    }

    public String getLocationName() {
        return locationName;
    }

    public Location(){

    }

    public Location(Builder builder) {
        this.locationArea = builder.locationArea;
        this.locationName = builder.locationName;
    }

    public static class Builder{
        private String locationArea;
        private String locationName;

        public Builder locationArea(String value){
            this.locationArea = value;
            return this;
        }

        public Builder locationName(String value){
            this.locationName = value;
            return this;
        }

        public Location build(){
            return new Location(this);
        }
    }
}
