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
public class PercentOffDiscount implements DiscountStrategy{
    private double discountRate;

    public PercentOffDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) throws IllegalArgumentException{
        if (discountRate < 0){
            throw new IllegalArgumentException(
                    "Sorry name is mandatory and cannot be less than 30 and greater than 5");
        } 
        //needs validation
        this.discountRate = discountRate;
    }
    
    @Override
    public double getDiscoutAmt(int qty, double unitCost) throws IllegalArgumentException{
        if (qty <0 || unitCost <0){
            throw new IllegalArgumentException(
                    "Sorry  qty and unitCost are mandatory and cannot be less than 0");
        }
        //needs validation
        return unitCost * qty * discountRate;
    }
    
}
