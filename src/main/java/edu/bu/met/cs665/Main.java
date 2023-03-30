/**
 * Name: Jie Dai
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/29/2023
 * File Name: Main.java
 * Description: Main entry point
 */

package edu.bu.met.cs665;



/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    CustomerDataSample Alan = new CustomerDataSample(1111, "Alan");
    CustomerDataSample Bob = new CustomerDataSample(2222, "Bob");
    CustomerDataSample Cindy = new CustomerDataSample(3333, "Cindy");
    CustomerDataSample Devin = new CustomerDataSample(6666, "Devin");

    CustomerDataSample[] dataSet_USB = {Alan, Bob};
    CustomerDataSample[] dataSet_HTTPS = {Cindy, Devin};

    CustomerData_USB oldSystem = new CustomerData_Legacy(dataSet_USB);
    CustomerData_HTTPS newSystem = new CustomerData_New(dataSet_HTTPS);
    CustomerData_HTTPS adapter = new USBToHTTPSAdapter(oldSystem);

    oldSystem.getCustomer_USB(2222);
    oldSystem.getCustomer_USB(6666);

    newSystem.getCustomer_HTTPS(6666);
    newSystem.getCustomer_HTTPS(2222);

    adapter.getCustomer_HTTPS(2222);




  }

  /**
   * This method performs XYZ and returns String.
   *
   * @return String
   */


}
