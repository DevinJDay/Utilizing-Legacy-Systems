package edu.bu.met.cs665;

public class CustomerData_Legacy implements CustomerData_USB{

    private CustomerDataSample[] dataSet_USB;


    public CustomerData_Legacy(CustomerDataSample[] dataSet_USB){
        this.dataSet_USB = dataSet_USB;
    }


    @Override
    public void getCustomer_USB(int customerID) {

        System.out.println("Retrieving data through a USB connection: ");
        for (CustomerDataSample data : dataSet_USB){
            if (customerID == data.getCustomerID()){
                System.out.println("This customer is " + data.getName() + " (ID: " + customerID + ")");
                System.out.println(" ");
                return;
            }
        }
        System.out.println("This customer (ID: " + customerID + ") is not found in the Legacy System");
        System.out.println(" ");

    }
}
