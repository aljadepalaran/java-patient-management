/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Models.Objects;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class MedicineTest {
    
    public MedicineTest() {
    }

    /**
     * Test of getMedicineName method, of class Medicine.
     */
    @Test
    public void testGetMedicineName() {
        System.out.println("getMedicineName");
        Medicine instance = new Medicine("testname", "testdetail", 5);
        assertEquals("testname", instance.getMedicineName());
    }

    /**
     * Test of getDetails method, of class Medicine.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        
        Medicine instance = new Medicine("testname", "testdetail", 5);
        assertEquals("testdetail", instance.getDetails());
    }

    /**
     * Test of setDetails method, of class Medicine.
     */
    @Test
    public void testSetDetails() {
        System.out.println("setDetails");
        Medicine instance = new Medicine("testname", "testdetail", 5);
        instance.setDetails("test2");
        assertEquals("test2", instance.getDetails());
    }

    /**
     * Test of getStock method, of class Medicine.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Medicine instance = new Medicine("testname", "testdetail", 5);
        assertEquals(5, instance.getStock());
    }

    /**
     * Test of setStock method, of class Medicine.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        Medicine instance = new Medicine("testname", "testdetail", 5);
        instance.setStock(3);
        assertEquals(3, instance.getStock());
    }
    
}
