/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package løsningLektier4;

/**
 *
 * @author ancla
 */
public class Main {

    public static void main(String[] args) 
    {
        //First create empty database
        CustomerDatabase cdb = new CustomerDatabase();
        
        //Now lets fill it with 10 customers
        for(int i = 0; i < 10; i++)
        {
            Customer customer = new Customer("Customer " + i);
            cdb.addCustomer(customer);
        }
        
        //Lets do a printout for control
        System.out.println("First Printout (customers added)");
        cdb.printCustomers();
        
        //Lets fetch the customer array
        Customer[] customers = cdb.getCustomers();
        
        //Now lets add random balances to the 10 customers
        for(int i = 0; i < 10; i++)
        {
            Customer currentCustomer = customers[i];
            currentCustomer.addBalance(Math.random() * 100);
        }
        
        //Lets do a new printout
        System.out.println("Second Printout (balance added)");
        cdb.printCustomers();
        
        //Lets remove the first customer
        Customer firstCustomer = customers[0];
        cdb.removeCustomer(firstCustomer.getId());
        
        //And a final printout
                System.out.println("Final Printout (first customer removed)");
        cdb.printCustomers();
    }
}
