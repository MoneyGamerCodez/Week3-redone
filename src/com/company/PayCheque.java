package com.company;

import java.time.LocalDate;

/**
 * Created by Thomas on 2017-01-25.
 */
public class PayCheque {
    private LocalDate dateIssued;
    private String employeeName;
    private double amount;
    private String memo;
    private int chequeNumber;
    private static int nextChequeNumber = 10001;

    public PayCheque( String employeeName, double amount, String memo) {
        this.dateIssued = LocalDate.now();
        this.employeeName = employeeName;
        this.amount = amount;
        this.memo = memo;
        chequeNumber = nextChequeNumber;

        nextChequeNumber++;
    }//code below is a getter

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getAmount() {
        return amount;
    }

    public String getMemo() {
        return memo;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }

    //this will show who the cheque is made out to, the date, the # and amount
    public String toString()
    {
        return String.format("Cheque %d, issued to %s for the amount of %.2f",getChequeNumber(), getEmployeeName(), getAmount());
    }
}
