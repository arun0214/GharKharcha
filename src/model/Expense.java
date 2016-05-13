package model;

/**
 * Created by Arun Tamang on 5/12/2016.
 */
public class Expense {

    private String getdate ;
    private String food ;
    private String shopping;
    private String rent;
    private String education ;
    private String transportation ;
    private String travel;
    private String extra;

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getRent() {
        return rent;
    }

    public void setGetdate(String getdate) {
        this.getdate = getdate;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getGetdate() {
        return getdate;
    }

    public String getFood() {
        return food;
    }

    public String getShopping() {
        return shopping;
    }

    public String getEducation() {
        return education;
    }

    public String getTransportation() {
        return transportation;
    }

    public String getTravel() {
        return travel;
    }

    public String getExtra() {
        return extra;
    }
}
