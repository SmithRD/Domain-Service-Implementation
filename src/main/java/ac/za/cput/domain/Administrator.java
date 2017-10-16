package ac.za.cput.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Administrator implements Serializable {

    @Id
    private String adminID;
    private String adminEmail;
    private String adminFirstName;
    private String adminLastName;
    private String adminPassword;
    private String adminAddress1;
    private String adminAddress2;
    private Integer adminPostalCode;
    private String adminContactNumber1;
    private String adminContactNumber2;



    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminID() {
        return adminID;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getAdminAddress1() { return adminAddress1; }

    public String getAdminAddress2() { return adminAddress2; }

    public Integer getAdminPostalCode() { return adminPostalCode; }

    public String getAdminContactNumber1() { return adminContactNumber1; }

    public String getAdminContactNumber2() { return adminContactNumber2; }


    public Administrator(){
    }

    public Administrator(Builder builder) {
        this.adminEmail = builder.adminEmail;
        this.adminID = builder.adminID;
        this.adminFirstName = builder.adminFirstName;
        this.adminLastName = builder.adminLastName;
        this.adminPassword = builder.adminPassword;
        this.adminAddress1 = builder.adminAddress1;
        this.adminAddress2 = builder.adminAddress2;
        this.adminPostalCode = builder.adminPostalCode;
        this.adminContactNumber1 = builder.adminContactNumber1;
        this.adminContactNumber2 = builder.adminContactNumber2;


    }

    public static class Builder {
        private String adminEmail;
        private String adminID;
        private String adminFirstName;
        private String adminLastName;
        private String adminPassword;
        private String adminAddress1;
        private String adminAddress2;
        private Integer adminPostalCode;
        private String adminContactNumber1;
        private String adminContactNumber2;



        public Builder adminEmail(String value) {
            this.adminEmail = value;
            return this;
        }

        public Builder adminID(String value) {
            this.adminID = value;
            return this;
        }

        public Builder adminFirstName(String value) {
            this.adminFirstName = value;
            return this;
        }

        public Builder adminLastName(String value) {
            this.adminLastName = value;
            return this;
        }

        public Builder adminPassword(String value) {
            this.adminPassword = value;
            return this;
        }


        public Builder adminAddress1(String value) {
            this.adminAddress1 = value;
            return this;
        }

        public Builder adminAddress2(String value) {
            this.adminAddress2 = value;
            return this;
        }

        public Builder adminPostalCode(Integer value) {
            this.adminPostalCode = value;
            return this;
        }

        public Builder adminContactNumber1(String value) {
            this.adminContactNumber1 = value;
            return this;
        }

        public Builder adminContactNumber2(String value) {
            this.adminContactNumber2 = value;
            return this;
        }




        public Administrator build() {
            return new Administrator(this);
        }
    }
}
