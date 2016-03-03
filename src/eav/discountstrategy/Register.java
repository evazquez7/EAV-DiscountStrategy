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
public class Register {
   private Receipt receipt;
   private String storeName;
   private OutputStrategy[] outputs;

    Register(String kohls_Department_Store) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
    
    public final void startNewSale(String custId, DatabaseStrategy db){
        receipt = new Receipt(custId, db);
    }
    
    public final void endSale(String custId){
         String data = receipt.getFinalReceipt(custId);
        for(OutputStrategy out : outputs) {
            out.output(data);
        }
        
    }
    
    public final void addItemToSale(String prodId, int qty){
        receipt.addItemToReceipt(prodId, qty);
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        //need validation
        this.storeName = storeName;
    }
    
}
