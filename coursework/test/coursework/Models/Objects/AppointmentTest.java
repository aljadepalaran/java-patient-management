/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Models.Objects;

import coursework.Models.Objects.Appointment;
import coursework.Controllers.FileReader;
import coursework.Models.Users.User;
import coursework.Controllers.Populate;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class AppointmentTest {
    
    public AppointmentTest() {
    }

    /**
     * Test of getAppointmentID method, of class Appointment.
     */
    @Test
    public void testGetAppointmentID() {
        System.out.println("getAppointmentID");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        String result = instance.getAppointmentID();
        assertEquals("testid", result);
    }

    /**
     * Test of setAppointmentID method, of class Appointment.
     */
    @Test
    public void testSetAppointmentID() {
        System.out.println("setAppointmentID");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        instance.setAppointmentID("test2");
        assertEquals(instance.getAppointmentID(),"test2");
    }

    /**
     * Test of getPatientID method, of class Appointment.
     */
    @Test
    public void testGetPatientID() {
        System.out.println("getPatientID");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        String result = instance.getPatientID();
        assertEquals("testpatient", result);
    }

    /**
     * Test of setPatientID method, of class Appointment.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        instance.setPatientID("test2");
        assertEquals(instance.getPatientID(),"test2");
    }

    /**
     * Test of getDoctorID method, of class Appointment.
     */
    @Test
    public void testGetDoctorID() {
        System.out.println("getDoctorID");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        String result = instance.getDoctorID();
        assertEquals("testdoctor", result);
    }

    /**
     * Test of setDoctorID method, of class Appointment.
     */
    @Test
    public void testSetDoctorID() {
        System.out.println("setDoctorID");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        instance.setDoctorID("test2");
        assertEquals(instance.getDoctorID(),"test2");
    }

    /**
     * Test of getDate method, of class Appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        String result = instance.getDate();
        assertEquals("testdate", result);
    }

    /**
     * Test of setDate method, of class Appointment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        instance.setDate("test2");
        assertEquals(instance.getDate(),"test2");
    }

    /**
     * Test of getNotes method, of class Appointment.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        String result = instance.getNotes();
        assertEquals("testnotes", result);
    }

    /**
     * Test of setNotes method, of class Appointment.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        Appointment instance = new Appointment("testid","testpatient","testdoctor","testdate","testnotes");
        instance.setNotes("test2");
        assertEquals(instance.getNotes(),"test2");
    }

    /**
     * Test of getObserverOne method, of class Appointment.
     */
    @Test
    public void testGetObserverOne() {
        System.out.println("getObserverOne");
        Appointment instance = new Appointment("0001", "P0000", "D0000", "01012010", "");
        instance.registerObserver("P0000");
        instance.registerObserver("D0000");
        String result = instance.getObserverOne();
        assertEquals("P0000", result);
    }

    /**
     * Test of getObserverTwo method, of class Appointment.
     */
    @Test
    public void testGetObserverTwo() {
        System.out.println("getObserverTwo");
        Appointment instance = new Appointment("0001", "P0000", "D0000", "01012010", "");
        instance.registerObserver("P0000");
        instance.registerObserver("D0000");
        String result = instance.getObserverTwo();
        assertEquals("D0000", result);
    }

    /**
     * Test of registerObserver method, of class Appointment.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        String _input = "";
        Appointment instance = new Appointment("0001", "P0000", "D0000", "01012010", "");
        instance.registerObserver(_input);
    }

    /**
     * Test of removeObserver method, of class Appointment.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        Appointment instance = new Appointment("0001", "P0000", "D0000", "01012010", "");
        instance.registerObserver("P0000");
        instance.registerObserver("D0000");
        instance.removeObserver("P0000");
        assertEquals(instance.getObserverOne() , null);
    }

    /**
     * Test of notifyObserver method, of class Appointment.
     */
    @Test
    public void testNotifyObserver() {
        System.out.println("notifyObserver");
        Appointment instance = new Appointment("0001", "P0000", "D0000", "01012010", "");
        instance.registerObserver("P0000");
        instance.registerObserver("D0000");
        instance.notifyObserver();
        try{
            User[] all = FileReader.readUsers();
            for(int i = 0; i < all.length; i++){
                if(all[i].getUniqueID().compareTo("P0000") == 0){
                    assertEquals(all[i].getHasObservable(), true);
                }
                if(all[i].getUniqueID().compareTo("D0000") == 0){
                    assertEquals(all[i].getHasObservable(), true);
                }
            }
            boolean result;
        }catch(Exception e){}
    }
    @After
    public void restore(){
        Populate.populateFile();
    }
    
}
