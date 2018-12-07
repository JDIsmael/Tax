/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.edu.espe.util.Operation;
import java.util.ArrayList;

/**
 *
 * @author JDIsmael
 */
public class Tax_Calculation {
    
    private ArrayList<Integer> limitFractionTax;
    private ArrayList<Integer> basicFractionTax;

    public Tax_Calculation() {
        this.limitFractionTax = new ArrayList<>();
        this.basicFractionTax = new ArrayList<>();
        this.basicFractionTax.clear();
        this.limitFractionTax.clear();
        constantTax();
    }
    
    
    public int convertToCents(float dolars){
        return (int) (dolars*100);
    } 
    
    public int calculateTax(int taxBase){
        ArrayList<Integer> dataTax = new ArrayList<>();
        dataTax = defineInTable(taxBase);
        int calcule, percentage, tax;
        if(dataTax.get(0) != 0 || dataTax.get(1) != 0){
            
            calcule = Operation.sub(taxBase, dataTax.get(2));
            percentage = Operation.div(Operation.multi(calcule, dataTax.get(1)), 100);
            
            return Operation.add(percentage, dataTax.get(0));
        }else
            return 0;
        
    }
    
    
    public ArrayList<Integer> defineInTable(int taxBase){
        int cont = 0;
        int cont2 = 0;
        ArrayList<Integer> establishedBase = new ArrayList<>();
        
        if(taxBase>=limitFractionTax.get(7)){
            establishedBase.add(basicFractionTax.get(14));
            establishedBase.add(basicFractionTax.get(15));
            establishedBase.add(limitFractionTax.get(7));
            return establishedBase;
        }
        
        if(taxBase<limitFractionTax.get(0)){
            establishedBase.add(0);
            establishedBase.add(0);
            return establishedBase;
        }
            
        do{
            if(taxBase>=limitFractionTax.get(cont) 
                    && taxBase < limitFractionTax.get((Operation.add(cont, 1)))){
                establishedBase.add(basicFractionTax.get(cont2));
                establishedBase.add(basicFractionTax.get(cont2 +1));
                establishedBase.add(limitFractionTax.get(cont));
                cont = 6;
            }
            cont++;
            cont2+=2;
            
        }while(cont != 7);
        return establishedBase;
    }
    
    
    private void constantTax(){
        //set constant limit tax
        limitFractionTax.add(convertToCents(11270f));
        limitFractionTax.add(convertToCents(14360f));
        limitFractionTax.add(convertToCents(17950f));
        limitFractionTax.add(convertToCents(21550f));
        limitFractionTax.add(convertToCents(43100f));
        limitFractionTax.add(convertToCents(64630f));
        limitFractionTax.add(convertToCents(86180f));
        limitFractionTax.add(convertToCents(114890f));
        
        //set values to pay
        
        basicFractionTax.add(0);
        basicFractionTax.add(5);
        basicFractionTax.add(convertToCents(155f));
        basicFractionTax.add(10);
        basicFractionTax.add(convertToCents(514f));
        basicFractionTax.add(12);
        basicFractionTax.add(convertToCents(946f));
        basicFractionTax.add(15);
        basicFractionTax.add(convertToCents(4178));
        basicFractionTax.add(20);
        basicFractionTax.add(convertToCents(8484));
        basicFractionTax.add(25);
        basicFractionTax.add(convertToCents(13872));
        basicFractionTax.add(30);
        basicFractionTax.add(convertToCents(22485));
        basicFractionTax.add(35);
        
        
    }
    
    
}
