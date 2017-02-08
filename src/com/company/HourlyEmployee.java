package com.company;

import java.time.LocalDate;

/**
 * Created by Thomas on 2017-01-25.
 */
public class HourlyEmployee extends Employee {
    private double minimumWage = 11.40;
    private double hourlyRate, hoursWorked;

    public HourlyEmployee(String first, String last, int sin, LocalDate dob, int hourlyRate) {
        super(first, last, sin, dob);

        hoursWorked=0;
        setPayRate(hourlyRate);
    }


    //this method will validate that the pay rate is above minimum wage and set the instance variable

    public void setPayRate(double payRate)
    {
        if (payRate >= minimumWage)
            this.hourlyRate = payRate;
        else
            throw new IllegalArgumentException("hey cheapo - minimum wage is " + minimumWage);
    }

    //this method will add hours worked to the employees history
    public void addHoursWorked(double hoursWorked)
    {
        if (hoursWorked > 0)
            this.hoursWorked += hoursWorked;
        else
            throw new IllegalArgumentException("new hours worked must be greater than 0");
    }
    @Override
    public PayCheque getPayCheque() {
        double payAmount = hoursWorked * hourlyRate;
        PayCheque newPayCheque = new PayCheque(super.toString(), payAmount, "Your pay cheque");

        hoursWorked =0;
        return newPayCheque;
    }
}
