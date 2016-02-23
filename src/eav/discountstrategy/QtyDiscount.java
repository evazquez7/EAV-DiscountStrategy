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
public class QtyDiscount implements DiscountStrategy{
    private double discountRate;
    private int minQty;

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        //needs validation
        this.minQty = minQty;
    }

    public QtyDiscount(double discountRate, int minQty) {
        setMinQty(minQty);
        setDiscountRate(discountRate);
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }
    
    @Override
    public double getDiscoutAmt(int qty, double unitCost) {
        //needs validation
        if(qty>= minQty){
            return unitCost * qty * discountRate;
        } else {
            return 0;
        }
        
    }
    
}
