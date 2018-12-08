/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxhomework;

import ec.edu.espe.model.Tax_Calculation;
import java.util.ArrayList;

/**
 *
 * @author Carlos Villarreal
 */
public class TaxHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tax_Calculation tax = new Tax_Calculation();
        tax.indatas();
        int valor_a_pagar = tax.calculateTax()/100;
        System.out.println("el impesto a pagar de es:"+valor_a_pagar);
        tax.paymentDate();
        
        
    }
    
}
