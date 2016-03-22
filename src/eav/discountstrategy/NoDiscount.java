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
public class NoDiscount implements DiscountStrategy{
    private double discountRate;
    private final int NO_DISCOUNT = 0;

    public NoDiscount() {
      
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) throws IllegalArgumentException{
        if (discountRate < 0 || discountRate > 0){
            throw new IllegalArgumentException(
                    "Sorry discount rate is has to equal 0 ");
        }
        //needs validation
        this.discountRate = discountRate;
    }
    
    @Override
    public final  double getDiscoutAmt(int qty, double unitCost) {
        //needs validation
        return NO_DISCOUNT;
        
        
    }
    
}
