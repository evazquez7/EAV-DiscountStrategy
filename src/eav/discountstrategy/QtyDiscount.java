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
    private final int NO_DISCOUNT = 0;

    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(int minQty) throws IllegalArgumentException{
        if (minQty > 0){
            throw new IllegalArgumentException(
                    "Sorry minimum qty is necessary");
        }
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

    public final void setDiscountRate(double discountRate)throws IllegalArgumentException{
        if (discountRate >0){
            throw new IllegalArgumentException(
                    "Sorry discount is mandatory");
        } 
        //needs validation
        this.discountRate = discountRate;
    }
    
    @Override
    public final  double getDiscoutAmt(int qty, double unitCost) {
        //needs validation
        if(qty>= minQty){
            return unitCost * qty * discountRate;
        } else {
            return NO_DISCOUNT;
        }
        
    }
    
}
