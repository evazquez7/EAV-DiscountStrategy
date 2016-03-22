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
public class Customer {
   private String custId;
   private String custName;

    public Customer(String custId, String custName) {
        setCustId(custId);
        setCustName(custName);
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId)throws IllegalArgumentException{
        if (custId == null || custId.isEmpty() || custId.length() > 5 || custId.length() < 10){
            throw new IllegalArgumentException(
                    "Sorry custId is mandatory and cannot be less than 5 and greater than 10");
        } 
        //needs validation
        this.custId = custId;
    }

    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName) throws IllegalArgumentException{
        if (custName == null || custName.isEmpty() || custName.length() > 5 || custName.length()< 10){
            throw new IllegalArgumentException(
                    "Sorry name is mandatory and cannot be less than 5 and greater than 10");
        }
        //needs validation
        this.custName = custName;
    }
   
}
