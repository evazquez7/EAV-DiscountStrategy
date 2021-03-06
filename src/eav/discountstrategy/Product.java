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
public class Product {
    private String prodId;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount; 

    public Product(String prodId, String prodName, double unitCost, DiscountStrategy discount) {
        setProdId(prodId);
        setProdName(prodName);
        setUnitCost(unitCost);
        setDiscount(discount);
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) throws IllegalArgumentException{
        if (prodId == null || prodId.isEmpty() || prodId.length() < 5 || prodId.length() > 10){
            throw new IllegalArgumentException(
                    "Sorry productId is mandatory and cannot be less than 5 and greater than 10");
        }
        //needs validation
        this.prodId = prodId;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        //needs validation
        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        //needs validation
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        //needs validation
        this.discount = discount;
    }
    
}
