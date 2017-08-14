package ac.za.cput.domain;

import java.io.Serializable;

public class ResOperatingHours implements Serializable {
    private String timeOpen;
    private String timeClose;

    public String getTimeOpen() {
        return timeOpen;
    }

    public String getTimeClose() {
        return timeClose;
    }

    public ResOperatingHours(){

    }

    public ResOperatingHours(Builder builder) {
        this.timeOpen = builder.timeOpen;
        this.timeClose = builder.timeClose;
    }

    public static class Builder{
        private String timeOpen;
        private String timeClose;

        public Builder timeOpen(String value){
            this.timeOpen = value;
            return this;
        }

        public Builder timeClose(String value){
            this.timeClose = value;
            return this;
        }

        public ResOperatingHours build(){
            return new ResOperatingHours(this);
        }
    }

}
