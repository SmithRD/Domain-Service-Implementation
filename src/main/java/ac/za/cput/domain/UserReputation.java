package ac.za.cput.domain;

import java.io.Serializable;
import java.util.Date;

public class UserReputation implements Serializable {
    private Date signUpDate;
    private Long contributionCounter;
    private String contributionStatus;

    public Date getSignUpDate() {
        return signUpDate;
    }

    public Long getContributionCounter() {
        return contributionCounter;
    }

    public String getContributionStatus() {
        return contributionStatus;
    }

    public UserReputation(){

    }

    public UserReputation(Builder builder) {
        this.signUpDate = builder.signUpDate;
        this.contributionCounter = builder.contributionCounter;
        this.contributionStatus = builder.contributionStatus;
    }

    public static class Builder{
        private Date signUpDate;
        private Long contributionCounter;
        private String contributionStatus;

        public Builder signUpDate(Date value){
            this.signUpDate = value;
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

        public  UserReputation build(){
            return new  UserReputation(this);
        }
    }
}
