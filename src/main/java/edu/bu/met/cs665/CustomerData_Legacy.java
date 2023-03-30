/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/29/2023
 * File Name: CustomerData_Legacy.java
 * Description: This is a implementation of the 'Adaptee' class interface
 */

package edu.bu.met.cs665;

/**
 * This is the CustomerData_Legacy class.
 * It contains a customer dataset from the legacy system.
 * The getCustomer_USB(int customerID) method can retrieve customer's name based on provided customer ID
 * from the Legacy System
 */

public class CustomerData_Legacy implements CustomerData_USB{

    private CustomerDataSample[] dataSet_USB;


    public CustomerData_Legacy(CustomerDataSample[] dataSet_USB){
        this.dataSet_USB = dataSet_USB;
    }


    @Override
    public String getCustomer_USB(int customerID) {

        System.out.println("Retrieving data through a USB connection: ");
        for (CustomerDataSample data : dataSet_USB){
            if (customerID == data.getCustomerID()){
                System.out.println("This customer is " + data.getName() + " (ID: " + customerID + ")");
                System.out.println(" ");
                return data.getName();
            }
        }
        System.out.println("This customer (ID: " + customerID + ") is not found in the Legacy System");
        System.out.println(" ");
        return null;

    }
}
