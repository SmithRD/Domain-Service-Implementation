package ac.za.cput.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String userEmail;
    private String userScreenName;
    private String userPassword;

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserScreenName() {
        return userScreenName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public User(){
        UserReputation userReputation = new UserReputation();
    }

    public User(Builder builder) {
        this.userEmail = builder.userEmail;
        this.userScreenName = builder.userScreenName;
        this.userPassword = builder.userPassword;
    }

    public static class Builder{
        private String userEmail;
        private String userScreenName;
        private String userPassword;

        public Builder userEmail(String value){
            this.userEmail = value;
            return this;
        }

        public Builder userScreenName(String value){
            this.userScreenName = value;
            return this;
        }

        public Builder userPassword(String value){
            this.userPassword = value;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
