package edu.bu.met.cs665;

public class CustomerDataSample {
    private int customerID;

    private String name;

    public CustomerDataSample(int customerID, String name){
        this.customerID = customerID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCustomerID(){
        return customerID;
    }
}
