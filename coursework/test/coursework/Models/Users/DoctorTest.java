/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Models.Users;

import coursework.Models.Users.Doctor;
import coursework.Controllers.Populate;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class DoctorTest {
    
    public DoctorTest() {
    }

    /**
     * Test of getAddress method, of class Doctor.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Doctor instance = new Doctor("testid", "testpassword", "testfirstname", "testlastname", "testaddress");
        String result = instance.getAddress();
        assertEquals("testaddress", result);
    }

    /**
     * Test of setAddress method, of class Doctor.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Doctor instance = new Doctor("testid", "testpassword", "testfirstname", "testlastname", "testaddress");
        instance.setAddress("test2");
        assertEquals("test2",instance.getAddress());
    }
    
    @After
    public void restore(){
        Populate.populateFile();
    }
}
