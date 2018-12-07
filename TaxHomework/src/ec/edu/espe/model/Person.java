/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author JDIsmael
 */
public class Person {
     private String id;
    private float livingplace;
    private float education;
    private float clothing;
    private float health;
    private float salary;
    Scanner in= new Scanner(System.in);
    public Person(){
        
    }
    
    
    
    public void dateperson(){
        System.out.println("Ingrese cedula o ruc");
        id=in.nextLine();
        System.out.println("Ingrese Sueldo");
        salary=in.nextFloat();
        
        System.out.println("              Ingrese Gatos");
        System.out.println("Vivienda:");
        livingplace=in.nextFloat();
        System.out.println("Educacion:");
        education=in.nextFloat();
        System.out.println("Vestimenta:");
        clothing=in.nextFloat();
        System.out.println("Salud:");
        health=in.nextFloat();      
        
                
    }   

    public String getId() {
        return id;
    }

    public float getLivingplace() {
        return livingplace;
    }

    public float getEducation() {
        return education;
    }

    public float getClothing() {
        return clothing;
    }

    public float getHealth() {
        return health;
    }

    public float getSalary() {
        return salary;
    }

    public Scanner getIn() {
        return in;
    }

    public Person(String id, float livingplace, float education, float clothing, float health, float salary) {
        this.id = id;
        this.livingplace = livingplace;
        this.education = education;
        this.clothing = clothing;
        this.health = health;
        this.salary = salary;
    }
    
}
