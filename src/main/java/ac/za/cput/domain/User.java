package ac.za.cput.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class User implements Serializable {

    @Id
    private String userEmail;
    private String userScreenName;
    private String userPassword;
    private Date userSignUpDate;
    private Long contributionCounter;
    private String contributionStatus;

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserScreenName() {
        return userScreenName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public Date getUserSignUpDate() {
        return userSignUpDate;
    }

    public Long getContributionCounter() {
        return contributionCounter;
    }

    public String getContributionStatus() {
        return contributionStatus;
    }


    public User(){

    }

    public User(Builder builder) {
        this.userEmail = builder.userEmail;
        this.userScreenName = builder.userScreenName;
        this.userPassword = builder.userPassword;
        this.userSignUpDate = builder.userSignUpDate;
        this.contributionCounter = builder.contributionCounter;
        this.contributionStatus = builder.contributionStatus;
    }

    public static class Builder{
        private String userEmail;
        private String userScreenName;
        private String userPassword;
        private Date userSignUpDate;
        private Long contributionCounter;
        private String contributionStatus;


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

        public Builder userSignUpDate(Date value){
            this.userSignUpDate = value;
            return this;
        }

        public Builder contributionCounter(Long value){
            this.contributionCounter = value;
            return this;
        }

        public Builder contributionStatus(String value){
            this.contributionStatus = value;
            return this;
        }


        public User build(){
            return new User(this);
        }
    }
}
