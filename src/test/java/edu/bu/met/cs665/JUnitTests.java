package edu.bu.met.cs665;

import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTests {

    public JUnitTests() {
    }

    @Test
    public void testCustomerName() {
        CustomerDataSample Devin = new CustomerDataSample(6666, "Devin");
        assertEquals("Devin", Devin.getName());

    }
    @Test
    public void testCustomerID() {
        CustomerDataSample Devin = new CustomerDataSample(3333, "Kate");
        assertEquals(3333, Devin.getCustomerID());

    }
    @Test
    public void testCustomerData_USB() {
        CustomerDataSample Alan = new CustomerDataSample(1111, "Alan");
        CustomerDataSample Bob = new CustomerDataSample(2222, "Bob");
        CustomerDataSample[] dataSet_USB = {Alan, Bob};

        CustomerData_USB oldSystem = new CustomerData_Legacy(dataSet_USB);
        assertEquals("Alan", oldSystem.getCustomer_USB(1111));

    }

    @Test
    public void testCustomerData_HTTPS() {
        CustomerDataSample Alan = new CustomerDataSample(1111, "Alan");
        CustomerDataSample Bob = new CustomerDataSample(2222, "Bob");
        CustomerDataSample[] dataSet_HTTPS = {Alan, Bob};

        CustomerData_HTTPS newSystem = new CustomerData_New(dataSet_HTTPS);
        assertEquals(null, newSystem.getCustomer_HTTPS(3333));

    }
    @Test
    public void testAdapter() {
        CustomerDataSample Alan = new CustomerDataSample(1111, "Alan");
        CustomerDataSample Bob = new CustomerDataSample(2222, "Bob");
        CustomerDataSample Cindy = new CustomerDataSample(3333, "Cindy");
        CustomerDataSample Devin = new CustomerDataSample(6666, "Devin");

        CustomerDataSample[] dataSet_USB = {Alan, Bob};
        CustomerDataSample[] dataSet_HTTPS = {Cindy, Devin};

        CustomerData_USB oldSystem = new CustomerData_Legacy(dataSet_USB);
        CustomerData_HTTPS newSystem = new CustomerData_New(dataSet_HTTPS);
        CustomerData_HTTPS adapter = new USBToHTTPSAdapter(oldSystem);

        assertEquals("Alan", adapter.getCustomer_HTTPS(1111));
        assertNotSame(newSystem.getCustomer_HTTPS(3333), adapter.getCustomer_HTTPS(3333));

    }







}
