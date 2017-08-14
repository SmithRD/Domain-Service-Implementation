package ac.za.cput.domain;

import java.io.Serializable;

public class DietaryLaw implements Serializable {
    private Boolean kosher;
    private Boolean halaal;

    public Boolean getKosher() {
        return kosher;
    }

    public Boolean getHalaal() {
        return halaal;
    }

    public DietaryLaw() {

    }

    public DietaryLaw(Builder builder) {
        this.kosher = builder.kosher;
        this.halaal = builder.halaal;
    }

    public static class Builder {
        private Boolean kosher;
        private Boolean halaal;

        public Builder kosher(Boolean value) {
            this.kosher = value;
            return this;
        }

        public Builder halaal(Boolean value) {
            this.halaal = value;
            return this;
        }

        public DietaryLaw build() {
            return new DietaryLaw(this);
        }
    }
}
