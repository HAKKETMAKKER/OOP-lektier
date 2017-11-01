/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package løsningLektier4;

import java.util.Arrays;
import java.util.UUID;

/**
 *
 * @author ancla
 */
public class CustomerDatabase {

    private Customer[] customers;

    //Since we are using an array, we need to know how many customers we actually have
    //We will use a counter variable, to keep count of the number of customers;
    private int customerCount;

    public CustomerDatabase() {
        customers = new Customer[100];

        //When we create a new customer database, we start out with 0 customers
        customerCount = 0;
    }

    public void addCustomer(Customer c) {
        //We can only hold 100 customers, so we need to check that we have fewer than 100 customers.
        if (customerCount < 100) {
            //Place a customer at index customerCount (Since index starts at 0, we put customer 1 at position 0 etc.)
            customers[customerCount] = c;
            //Since we added a customer, we will increase the customer count.
            customerCount++;
        } else {
            System.out.println("Cannot add anymore customers. Database full!");
        }
    }

    public void removeCustomer(UUID id) {
        //Loop through the part of the array which contains customers (until index customerCount-1;
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getId() == id) {
                //Now we have to remove the customer. This is tricky.

                if (i < customerCount - 1) {
                    //If there are more customers in the array, shift everyone from the position after the customer being deleted one place backward.
                    for (int j = i; j < customerCount - 1; j++) {
                        //Replace current position in array with customer in next position.
                        customers[j] = customers[j + 1];
                    }
                } else {
                    //If this is the last customer in the array (at index customerCount-1) induce null reference
                    customers[i] = null;
                }
                
                //We have removed a customer. Update count accordingly;
                customerCount--;
            }
        }
    }
    
    public Customer[] getCustomers()
    {
        //Copy original array, so it cant be manupulated outside of the database
        Customer[] res = Arrays.copyOf(customers, customers.length);
        //Return copied array
        return res;
    }
    
    public void printCustomers()
    {
        for(int i = 0; i < customerCount; i++)
        {
            System.out.println(customers[i].getInfo());
        }
    }

}
