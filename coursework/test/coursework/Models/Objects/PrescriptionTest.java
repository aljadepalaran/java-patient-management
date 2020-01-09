/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Models.Objects;

import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Prescription;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class PrescriptionTest {
    
    public PrescriptionTest() {
    }

    /**
     * Test of getPrescriptionID method, of class Prescription.
     */
    @Test
    public void testGetPrescriptionID() {
        System.out.println("getPrescriptionID");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        assertEquals("testid", instance.getPrescriptionID());
    }

    /**
     * Test of setPrescriptionID method, of class Prescription.
     */
    @Test
    public void testSetPrescriptionID() {
        System.out.println("setPrescriptionID");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        instance.setPrescriptionID("test2");
        assertEquals("test2", instance.getPrescriptionID());
    }

    /**
     * Test of getPatientID method, of class Prescription.
     */
    @Test
    public void testGetPatientID() {
        System.out.println("getPatientID");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        assertEquals("testpatient", instance.getPatientID());
    }

    /**
     * Test of setPatientID method, of class Prescription.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        instance.setPatientID("test2");
        assertEquals("test2", instance.getPatientID());
    }

    /**
     * Test of getDoctorID method, of class Prescription.
     */
    @Test
    public void testGetDoctorID() {
        System.out.println("getDoctorID");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        assertEquals("testdoctor", instance.getDoctorID());
    }

    /**
     * Test of setDoctorID method, of class Prescription.
     */
    @Test
    public void testSetDoctorID() {
        System.out.println("setDoctorID");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        instance.setDoctorID("test2");
        assertEquals("test2", instance.getDoctorID());
    }

    /**
     * Test of getNotes method, of class Prescription.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        assertEquals("testnote", instance.getNotes());
    }

    /**
     * Test of setNotes method, of class Prescription.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        instance.setNotes("test2");
        assertEquals("test2", instance.getNotes());
    }

    /**
     * Test of getMedicineType method, of class Prescription.
     */
    @Test
    public void testGetMedicineType() {
        System.out.println("getMedicineType");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        assertEquals("medid", instance.getMedicineType().getMedicineName());
    }

    /**
     * Test of setMedicineType method, of class Prescription.
     */
    @Test
    public void testSetMedicineType() {
        System.out.println("setMedicineType");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        Medicine test2 = new Medicine("test2", "test2details", 0);
        instance.setMedicineType(test2);
        assertEquals(test2, instance.getMedicineType());
    }

    /**
     * Test of getQuantity method, of class Prescription.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        assertEquals(5, instance.getQuantity());
    }

    /**
     * Test of setQuantity method, of class Prescription.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        instance.setQuantity(2);
        assertEquals(2, instance.getQuantity());
    }

    /**
     * Test of getDosage method, of class Prescription.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        assertEquals("testdosage", instance.getDosage());
    }

    /**
     * Test of setDosage method, of class Prescription.
     */
    @Test
    public void testSetDosage() {
        System.out.println("setDosage");
        Medicine newMed = new Medicine("medid", "meddetail", 0);
        Prescription instance = new Prescription("testid", "testpatient", "testdoctor", "testnote", newMed, 5, "testdosage");
        instance.setDosage("test2");
        assertEquals("test2", instance.getDosage());
    }
    
}
