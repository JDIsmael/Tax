/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.edu.espe.util.Operation;
import java.text.DecimalFormat;

/**
 *
 * @author JDIsmael
 */
public class Tax_Calculation {
    
    
    
    
    
    public int convertToCents(float dolars){
        String dolarString = ""+dolars;
        String[] separator = dolarString.split("\\.");
        int partInt= Integer.parseInt(separator[0]);
        int partDecimal = Integer.parseInt(separator[1]);
        
        return Operation.add(Operation.multi(partInt, 100),partDecimal);
    } 
    
    
}
