/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JDIsmael
 */
public class Tax_CalculationTest {
    
    public Tax_CalculationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of indatas method, of class Tax_Calculation.
     */
    @Test
    public void testIndatas() {
        System.out.println("indatas");
        Tax_Calculation instance = new Tax_Calculation();
        instance.indatas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inmonthneto method, of class Tax_Calculation.
     */
    @Test
    public void testInmonthneto() {
        System.out.println("inmonthneto");
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.inmonthneto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incomeage method, of class Tax_Calculation.
     */
    @Test
    public void testIncomeage() {
        System.out.println("incomeage");
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.incomeage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deductiblExpenses method, of class Tax_Calculation.
     */
    @Test
    public void testDeductiblExpenses() {
        System.out.println("deductiblExpenses");
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.deductiblExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taxBase method, of class Tax_Calculation.
     */
    @Test
    public void testTaxBase() {
        System.out.println("taxBase");
        Tax_Calculation instance = new Tax_Calculation();
        float expResult = 0.0F;
        float result = instance.taxBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToCents method, of class Tax_Calculation.
     */
    @Test
    public void testConvertToCents() {
        System.out.println("convertToCents");
        float dolars = 0.0F;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.convertToCents(dolars);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * 
     */
    
    
    
    @Test
    public void testCalculateTaxc() {
        System.out.println("calculateTax");
        int taxBase = -54;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = -1;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTab1() {
        System.out.println("calculateTax");
        int taxBase = 1000;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTaxa() {
        System.out.println("calculateTax");
        int taxBase = 0;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = -1;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTaxd() {
        System.out.println("calculateTax");
        int taxBase = 950;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    /**
     * Test of calculateTax method, of class Tax_Calculation.
     */
    @Test
    public void testCalculateTax() {
        System.out.println("calculateTax");
        int taxBase = -2000;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = -1;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTax1() {
        System.out.println("calculateTax");
        int taxBase = 800;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTax2() {
        System.out.println("calculateTax");
        int taxBase = 950;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTax3() {
        System.out.println("calculateTax");
        int taxBase = 1000;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 0;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateTax4() {
        System.out.println("calculateTax");
        int taxBase = -1000;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = -1;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTax5() {
        System.out.println("calculateTax");
        int taxBase = 1200;
        Tax_Calculation instance = new Tax_Calculation();
        int expResult = 8846;
        int result = instance.calculateTax(taxBase);
        assertEquals(expResult, result);
    }
    
    
    /**
     * 
     */
    

    
    @Test
    public void testDefineInTable() {
        System.out.println("defineInTable");
        int taxBase = 0;
        Tax_Calculation instance = new Tax_Calculation();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.defineInTable(taxBase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paymentDate method, of class Tax_Calculation.
     */
    @Test
    public void testPaymentDate() {
        System.out.println("paymentDate");
        Tax_Calculation instance = new Tax_Calculation();
        instance.paymentDate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
