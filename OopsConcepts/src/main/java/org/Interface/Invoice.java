package org.Interface;

import java.util.UUID;

public class Invoice implements Payable{
    private String invoiceId;
    private String cosultantName;
    private double ratePerDay;
    private int noOfDays;
    public Invoice(String invoiceId, String cosultantName, double ratePerDay, int noOfDays) {
        this.invoiceId = UUID.randomUUID().toString();
        this.cosultantName = cosultantName;
        this.ratePerDay = ratePerDay;
        this.noOfDays = noOfDays;
    }
    @Override
    public double getPay() {
        return ratePerDay*noOfDays*0.8;
    }
}
