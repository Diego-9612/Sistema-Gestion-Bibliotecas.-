package models;

/**
 *
 * @author Diego Guerrero
 */
public class Users {

    private int userID;
    private String names;
    private String surname;
    private String secondSurname;
    private String college;
    private String numberCarnet;
    private String address;
    private String phone;
    private String email;
    private Boolean sanctions;
    private Double sanctionsMoney;

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getNames() {
        return this.names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return this.secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getNumberCarnet() {
        return this.numberCarnet;
    }

    public void setNumberCarnet(String numberCarnet) {
        this.numberCarnet = numberCarnet;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSanctions() {
        return this.sanctions;
    }

    public void setSanctions(Boolean sanctions) {
        this.sanctions = sanctions;
    }

    public Double getSanctionsMoney() {
        return this.sanctionsMoney;
    }

    public void setSanctionsMoney(Double sanctionsMoney) {
        this.sanctionsMoney = sanctionsMoney;
    }

}
