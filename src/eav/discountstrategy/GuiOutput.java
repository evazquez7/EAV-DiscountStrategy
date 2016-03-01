/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eav.discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class GuiOutput implements Output{
   
    @Override
    public void output(Register register) {
       JOptionPane.showMessageDialog(null, register);
	}
}
