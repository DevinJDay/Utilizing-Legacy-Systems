package edu.bu.met.cs665;

public class CustomerData_New implements CustomerData_HTTPS{
    private CustomerDataSample[] dataSet_HTTPS;


    public CustomerData_New(CustomerDataSample[] dataSet_HTTPS){
        this.dataSet_HTTPS = dataSet_HTTPS;
    }


    @Override
    public void getCustomer_HTTPS(int customerID) {

        System.out.println("Retrieving data through a HTTPS connection: ");
        for (CustomerDataSample data : dataSet_HTTPS){
            if (customerID == data.getCustomerID()){
                System.out.println("This customer is " + data.getName() + " (ID: " + customerID + ")");
                System.out.println(" ");
                return;
            }
        }
        System.out.println("This customer (ID: " + customerID + ") is not found in the New System");
        System.out.println(" ");

    }
}
