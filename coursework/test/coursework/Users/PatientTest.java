/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Users;

import coursework.Models.Users.Patient;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class PatientTest {
    
    public PatientTest() {
    }

    /**
     * Test of getAddress method, of class Patient.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Patient instance = new Patient("testid", "testpassword", "testfirstname", "testlastname", "testaddress", 'T', "testdate");
        String result = instance.getAddress();
        assertEquals("testaddress", result);
    }

    /**
     * Test of getSex method, of class Patient.
     */
    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Patient instance = new Patient("testid", "testpassword", "testfirstname", "testlastname", "testaddress", 'T', "testdate");
        char result = instance.getSex();
        assertEquals('T', result);
    }

    /**
     * Test of getDOB method, of class Patient.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Patient instance = new Patient("testid", "testpassword", "testfirstname", "testlastname", "testaddress", 'T', "testdate");
        String result = instance.getDOB();
        assertEquals("testdate", result);
    }

    /**
     * Test of setAddress method, of class Patient.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Patient instance = new Patient("testid", "testpassword", "testfirstname", "testlastname", "testaddress", 'T', "testdate");
        instance.setAddress("test2");
        assertEquals("test2", instance.getAddress());
    }

    /**
     * Test of setSex method, of class Patient.
     */
    @Test
    public void testSetSex() {
        System.out.println("setSex");
        Patient instance = new Patient("testid", "testpassword", "testfirstname", "testlastname", "testaddress", 'T', "testdate");
        instance.setSex('O');
        assertEquals('O',instance.getSex());
    }

    /**
     * Test of setDOB method, of class Patient.
     */
    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        Patient instance = new Patient("testid", "testpassword", "testfirstname", "testlastname", "testaddress", 'T', "testdate");
        instance.setDOB("newdate");
        assertEquals("newdate",instance.getDOB());
    }
    
}
