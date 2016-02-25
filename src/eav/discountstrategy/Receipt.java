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
    private LineItem li;
    private Product product;

    public Receipt(String custId, DatabaseStrategy db) {
        setDb(db);
        setCustomer(db.findCustomerById(custId));  
    }

    public Receipt(String prodId, int qty, DatabaseStrategy db) {
        setDb(db);
        setProduct(db.findProductById(prodId));
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        //need validation
        this.product = product;
    }
   
    public LineItem getLi() {
        return li;
    }

    public final void setLi(LineItem li) {
        //needs validation
        this.li = li;
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
