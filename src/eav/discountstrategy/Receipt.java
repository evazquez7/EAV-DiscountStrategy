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
public class Receipt {
    private DatabaseStrategy db;
    private Customer customer;
    double totalBeforeDiscount = 0;
        double totalAfterDiscount = 0;
        double totalDiscount = 0;
    
    private Product product;
    private LineItem[] lineItems;
    private LineItem li;
    
    public Receipt(String custId, DatabaseStrategy db) {
        setDb(db);
        setCustomer(db.findCustomerById(custId));
        lineItems = new LineItem[0];
    }

    public final  void addItemToReceipt(String prodId, int qty){
        LineItem item = new LineItem(prodId,qty, db);
        addItemToArray(lineItems, item);
       
    }
    private void addItemToArray(LineItem[] origArray, LineItem item){
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length - 1] = item;
        origArray = tempArray;
        lineItems = origArray;
        
        
//        for (int i = 0;  i < lineItems.length; i++){
//            tempArray[i] = lineItems[i];
//        }
//        tempArray[tempArray.length - 1] = item;
//        lineItems = tempArray;
    }
    public String getFinalReceipt(String custId){
        
        setCustomer(db.findCustomerById(custId));
        String data = li.getLineItemData() + "\n" +"Thank you for shopping " + this.customer.getCustName();
                LineItem[] items = li.LineItem();
        for (LineItem item : items) {
            totalBeforeDiscount += item.getSubTotal();
            totalAfterDiscount += (item.getSubTotal() - item.getDiscount());
            totalDiscount += item.getDiscount();

            sb.append(String.format("\n%-8s",item.getProduct().getProdId()));
            sb.append(String.format("%-25s",item.getProduct().getProdName()));
            sb.append(String.format("%8.2f",item.getProduct().getUnitCost()));
            sb.append(String.format("%10d",item.getQty()));
            sb.append(String.format("%15.2f",item.getExtPrice()));
        }
        return data;
                
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        //need validation
        this.product = product;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
   
    

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        //needs validation
        this.customer = customer;
    }


    public final DatabaseStrategy getDb() {
        return db;
    }

    public final void setDb(DatabaseStrategy db) {
        //needs validation
        this.db = db;
    }
}
