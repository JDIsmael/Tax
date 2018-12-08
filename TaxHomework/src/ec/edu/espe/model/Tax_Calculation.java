/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.edu.espe.util.Operation;
import static ec.edu.espe.util.Operation.multi;
import static ec.edu.espe.util.Operation.sub;
import ec.edu.espe.util.Validation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JDIsmael
 */
public class Tax_Calculation {
    
    Person person = new Person();
    Validation validation = new Validation();
    int sri=convertToCents(9.45f);
    String id;
    float livingplace,education,clothing,health,salary;
    Scanner in= new Scanner (System.in);
    
    public void indatas(){
        String identifyCard;
        boolean aux;
        do{
            System.out.println("Ingrese cedula ");
            identifyCard=in.nextLine();
            aux = validation.validationOfIdentifyCard(identifyCard);
        }while(!aux);
        System.out.println("Ingrese Sueldo");
        person.setSalary(in.nextFloat());        
        System.out.println("              Ingrese Gatos");
        System.out.println("Vivienda:");
        person.setLivingplace(in.nextFloat());
        System.out.println("Educacion:");
        person.setEducation(in.nextFloat());
        System.out.println("Vestimenta:");
        person.setClothing(in.nextFloat());
        System.out.println("Salud:");
        person.setHealth(in.nextFloat());
   
        
    }
    public int inmonthneto(){
        int salaryint=convertToCents(person.getSalary());
        int srit;
        srit = ((sri*salaryint)/10000);
        int monthneto;
        monthneto=sub(salaryint,srit);
        return monthneto;
    }
    public int incomeage(){
        int valoranual=multi(inmonthneto(),12);
    return valoranual;
    }
    public int deductiblExpenses(){
        int deductible;
        deductible=convertToCents(person.getHealth()+person.getLivingplace()+person.getEducation()+person.getClothing());
        if(deductible>incomeage()) {
            System.out.println("no puede gastas mas de lo que gana");
            System.out.println("su sueldo es solo de"+inmonthneto());
            return -1;
        }
       
        return deductible;
    }
    public float taxBase (){
        float result;
        result = incomeage()-deductiblExpenses();
        
        return result;
    }
    
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
    
    /* Este metodo recibe como parametro la base imponible 
     * y desde hay se hace el calculo del impuesto
     * si la base imponible se encuentra entre los rango de la tabla 
     * devuelve el impuesto a pagar, caso contrario 
     * devolvera 0 si no debe de pagar impuesto
     */
    
    public int calculateTax(){
        int taxBase=(int) taxBase();
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
    
    public void paymentDate (){
        
        String cedula = person.getId();
        int ninthDigi= Integer.parseInt(cedula.substring(8,9));
        if (ninthDigi==1){
            System.out.println("Su fecha limíte de pago es el 10 de MARZO");
        }else if (ninthDigi==2){
            System.out.println("Su fecha limíte de pago es el 12 de MARZO");
        }else if (ninthDigi==3){
            System.out.println("Su fecha limíte de pago es el 14 de MARZO");
        }else if (ninthDigi==4){
            System.out.println("Su fecha limíte de pago es el 16 de MARZO");
        }else if (ninthDigi==5){
            System.out.println("Su fecha limíte de pago es el 18 de MARZO");
        }else if (ninthDigi==6){
            System.out.println("Su fecha limíte de pago es el 20 de MARZO");
        }else if (ninthDigi==7){
            System.out.println("Su fecha limíte de pago es el 22 de MARZO");
        }else if (ninthDigi==8){
            System.out.println("Su fecha limíte de pago es el 24 de MARZO");
        }else if (ninthDigi==9){
            System.out.println("Su fecha limíte de pago es el 26 de MARZO");
        }else if (ninthDigi==0){
            System.out.println("Su fecha limíte de pago es el 28 de MARZO");
        }
        
        
        //
    
    
             }
}
