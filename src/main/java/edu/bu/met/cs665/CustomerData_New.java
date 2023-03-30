/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/29/2023
 * File Name: CustomerData_New.java
 * Description: This is an implementation of the Target <<interface>>
 */

package edu.bu.met.cs665;

/**
 * This is the CustomerData_New class.
 * It contains a customer dataset from the new system.
 * The getCustomer_HTTPS(int customerID) method can retrieve customer's name based on provided customer ID
 * from the New System
 */

public class CustomerData_New implements CustomerData_HTTPS{
    private CustomerDataSample[] dataSet_HTTPS;


    public CustomerData_New(CustomerDataSample[] dataSet_HTTPS){
        this.dataSet_HTTPS = dataSet_HTTPS;
    }


    @Override
    public String getCustomer_HTTPS(int customerID) {

        System.out.println("Retrieving data through a HTTPS connection: ");
        for (CustomerDataSample data : dataSet_HTTPS){
            if (customerID == data.getCustomerID()){
                System.out.println("This customer is " + data.getName() + " (ID: " + customerID + ")");
                System.out.println(" ");
                return data.getName();
            }
        }
        System.out.println("This customer (ID: " + customerID + ") is not found in the New System");
        System.out.println(" ");
        return null;

    }
}
