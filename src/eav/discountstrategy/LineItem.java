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
public class LineItem {
    private Product product;
    private int qty;
    
    public LineItem(String prodId, int qty, DatabaseStrategy db) {
        this.qty = qty;
        setProduct(db.findProductById(prodId));
       
    }

    
    public String getLineItemData(){
        String data = "Product Name       Original cost      Quantity     Cost     Discount \n"
                + "----------------   ------------       -----------  -------  ----------\n"
                + this.getProduct().getProdName()+"       "+ this.product.getUnitCost() +"              " +  getQty() +"            " 
                +  getSubTotal()+"     " + getDiscount() 
                +"\n\n"+   
                "          Subtotal: " ;
        return data;
       }
    public final double getSubTotal(){ 
        return this.product.getUnitCost() * qty;
        
    }
    public final double getGrandTotal() {
        return getSubTotal()- getDiscount();
    }
    public final double getDiscount(){
        return this.getProduct().getDiscount().getDiscoutAmt(qty, product.getUnitCost());
    }
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        //needs validation
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //needs validation
        this.qty = qty;
    }
    
    
   
    
    
    
    
    
    
}
