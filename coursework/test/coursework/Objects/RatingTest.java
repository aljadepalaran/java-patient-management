/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Objects;

import coursework.Models.Objects.Rating;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class RatingTest {
    
    public RatingTest() {
    }

    /**
     * Test of getDoctorID method, of class Rating.
     */
    @Test
    public void testGetDoctorID() {
        System.out.println("getDoctorID");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        assertEquals("testdoctor", instance.getDoctorID());
    }

    /**
     * Test of getPatientID method, of class Rating.
     */
    @Test
    public void testGetPatientID() {
        System.out.println("getPatientID");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        assertEquals("testpatient", instance.getPatientID());
    }

    /**
     * Test of getRatingValue method, of class Rating.
     */
    @Test
    public void testGetRatingValue() {
        System.out.println("getRatingValue");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        assertEquals(0, instance.getRatingValue());
    }

    /**
     * Test of getMessage method, of class Rating.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        assertEquals("testmessage", instance.getMessage());
    }

    /**
     * Test of setDoctorID method, of class Rating.
     */
    @Test
    public void testSetDoctorID() {
        System.out.println("setDoctorID");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        instance.setDoctorID("test2");
        assertEquals("test2", instance.getDoctorID());
    }

    /**
     * Test of setPatientID method, of class Rating.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        instance.setPatientID("test2");
        assertEquals("test2", instance.getPatientID());
    }

    /**
     * Test of setRatingValue method, of class Rating.
     */
    @Test
    public void testSetRatingValue() {
        System.out.println("setRatingValue");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        instance.setRatingValue(5);
        assertEquals(5, instance.getRatingValue());
    }

    /**
     * Test of setMessage method, of class Rating.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        Rating instance = new Rating("testdoctor", "testpatient", 0, "testmessage");
        instance.setMessage("test2");
        assertEquals("test2", instance.getMessage());
    }
    
}
