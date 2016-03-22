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
    
    public final void endSale(String custId)throws IllegalArgumentException{
        if (custId == null || custId.isEmpty() || custId.length() > 5 || custId.length()< 10){
            throw new IllegalArgumentException(
                    "Sorry customerID is mandatory and cannot be less than 5 and greater than 10");
        }
         String data = receipt.getFinalReceipt(custId);
        for(OutputStrategy out : outputs) {
            out.output(data);
        }
        
    }
    
    public final void addItemToSale(String prodId, int qty)throws IllegalArgumentException{
        if (prodId == null || prodId.isEmpty() || prodId.length() > 5 || prodId.length()< 10 && qty > 0){
            throw new IllegalArgumentException(
                    "Sorry productId is mandatory, cannot be less than 5 and greater than 10 and qty has to be above 0");
        } 
        
        receipt.addItemToReceipt(prodId, qty);
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) throws IllegalArgumentException{
        if (receipt == null){
            throw new IllegalArgumentException(
                    "Sorry receipt is necessary");
        }
        //needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName)throws IllegalArgumentException{
        if (storeName == null || storeName.isEmpty() || storeName.length() > 5 || storeName.length()< 30){
            throw new IllegalArgumentException(
                    "Sorry store name is mandatory and cannot be less than 5 and greater than 30");
        } 
        //need validation
        this.storeName = storeName;
    }
    
}
