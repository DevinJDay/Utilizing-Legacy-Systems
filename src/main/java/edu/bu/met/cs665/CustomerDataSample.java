/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/29/2023
 * File Name: CustomerDataSample.java
 * Description: This is the CustomerDataSample Class
 */

package edu.bu.met.cs665;

/**
 * This is the CustomerDataSample class.
 * It contains customerID and name,
 * and their get methods
 */

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
