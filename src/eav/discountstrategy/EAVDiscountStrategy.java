/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eav.discountstrategy;

/**
 *
 * @author Emilio
 */
public class EAVDiscountStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //KLUDGE: do configuration here 
       
        DatabaseStrategy db = new FakeDatabase();
        
        //Start talking to objects
        OutputStrategy[] outputs = {
            new ConsoleOutput(),
            new GuiOutput()
        };       
        
        Register register = new Register("Kohls Department Store");
      
        register.startNewSale("100", db);
        
        Customer customer = register.getReceipt().getCustomer();
        System.out.println("Customer " + customer.getCustName() + " found and added receipt");
        
        register.addItemToSale("11", 2);
        
        LineItem[] items = register.getReceipt().getLineItems();
        for(LineItem item: items) {
            System.out.println(item.getLineItemData());
        }
        
        
       
      
        
    }
    
}
