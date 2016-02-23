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
public class FlatAmtDiscount implements DiscountStrategy{
    private double discountRate = 5.00;

    public FlatAmtDiscount(double discountRate) {
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
        return discountRate;
    }
    
}
