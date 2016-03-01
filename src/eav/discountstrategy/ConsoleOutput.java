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
public class ConsoleOutput implements Output{

    @Override
    public void output(Register register) {
        System.out.println(register);
    }
    
}
