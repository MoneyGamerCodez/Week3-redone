package com.company;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Thomas on 2017-01-25.
 */
public abstract class Employee {//the instance variables
    private String firstName, lastName;
    private int socialInsuranceNum;
    private LocalDate dateOfBirth;

    public Employee(String first, String last, int sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialInsuranceNum = sin;
        setBirthday(dob);
    }
    public String toString()
    {
        return firstName + " " + lastName;
    }

    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();

        int age = Period.between(dob, today).getYears();

        if (age >=15 && age<=90)//valid
            this.dateOfBirth = dob;
        else
            throw new IllegalArgumentException("the employee must be between 15-90 yrs of age");

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialInsuranceNum() {
        return socialInsuranceNum;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public abstract PayCheque getPayCheque();



}//end of class
