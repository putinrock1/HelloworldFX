package model;

import java.io.Serializable;

/**
 * Created by surya on 7/5/16.
 */
public abstract class Person implements Serializable {
    private String FirstName;
    private String LastName;
    private String DOB;
    private String Gender;
    private String SSN;
    public Person()
    {}


    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Person(String FirstName, String LastName, String DOB, String Gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DOB = DOB;
        this.Gender = Gender;
    }

    public abstract int compareTO(User user);
}