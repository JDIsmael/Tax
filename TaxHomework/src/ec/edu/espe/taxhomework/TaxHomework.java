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
        System.out.println(tax.convertToCents(45.23f));
        ArrayList<Integer> prueba = new ArrayList<>();
        int num=16732;
        int num2 = tax.calculateTax(tax.convertToCents(num));
        System.out.println("el impesto a pagar de " + num + " es: "+ num2 );
        
    }
    
}
