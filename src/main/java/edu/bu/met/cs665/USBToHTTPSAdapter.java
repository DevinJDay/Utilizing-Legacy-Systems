/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/29/2023
 * File Name: CustomerData_HTTPS.java
 * Description: This is the 'Adapter' Class
 */

package edu.bu.met.cs665;

public class USBToHTTPSAdapter implements CustomerData_HTTPS{

    private CustomerData_USB oldSystem;

    public USBToHTTPSAdapter(CustomerData_USB oldSystem){
        this.oldSystem = oldSystem;
    }


    @Override
    public void getCustomer_HTTPS(int customerID) {

        System.out.println("Adapting to the Legacy System: ");
        oldSystem.getCustomer_USB(customerID);

    }
}
