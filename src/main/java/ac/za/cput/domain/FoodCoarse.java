package ac.za.cput.domain;

import java.io.Serializable;

public class FoodCoarse implements Serializable {
    private String coarseName;

    public String getCoarseName() {
        return coarseName;
    }

    public FoodCoarse() {

    }

    public FoodCoarse(Builder builder) {
        this.coarseName = builder.coarseName;
    }

    public static class Builder {
        private String coarseName;

        public Builder coarseName(String value) {
            this.coarseName = value;
            return this;
        }

        public FoodCoarse build() {
            return new FoodCoarse(this);
        }
    }
}
