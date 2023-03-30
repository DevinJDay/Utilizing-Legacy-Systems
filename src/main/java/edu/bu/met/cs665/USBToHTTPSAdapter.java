/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/29/2023
 * File Name: USBToHTTPSAdapter.java
 * Description: This is the 'Adapter' Class
 */

package edu.bu.met.cs665;

/**
 * This is the USBToHTTPSAdapter class.
 * It contains an object of the 'Adaptee' class, aka the old system.
 * The getCustomer_HTTPS(int customerID) method can retrieve customer name based on provided customer ID
 * NOT from the New System, BUT from the Legacy System.
 * To realize the conversion between the two interfaces.
 */

public class USBToHTTPSAdapter implements CustomerData_HTTPS{

    private CustomerData_USB oldSystem;

    public USBToHTTPSAdapter(CustomerData_USB oldSystem){
        this.oldSystem = oldSystem;
    }


    @Override
    public String getCustomer_HTTPS(int customerID) {

        System.out.println("Adapting to the Legacy System: ");
        return oldSystem.getCustomer_USB(customerID);

    }
}
