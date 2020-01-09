/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Functions;

import coursework.Objects.Appointment;
import coursework.Objects.Feedback;
import coursework.Objects.Medicine;
import coursework.Objects.Prescription;
import coursework.Objects.Rating;
import coursework.Users.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class FileReaderTest {
    
    public FileReaderTest() {
    }

    /**
     * Test of readUsers method, of class FileReader.
     */
    @Test
    public void testReadUsers() throws Exception {
        System.out.println("readUsers");
        User[] expResult = null;
        FileWriter.writeUsers(expResult);
        User[] result = FileReader.readUsers();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readRatings method, of class FileReader.
     */
    @Test
    public void testReadRatings() throws Exception {
        System.out.println("readRatings");
        Rating[] expResult = null;
        FileWriter.writeRatings(expResult);
        Rating[] result = FileReader.readRatings();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readFeedback method, of class FileReader.
     */
    @Test
    public void testReadFeedback() throws Exception {
        System.out.println("readFeedback");
        Feedback[] expResult = null;
        FileWriter.writeFeedbacks(expResult);
        Feedback[] result = FileReader.readFeedback();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readPrescriptions method, of class FileReader.
     */
    @Test
    public void testReadPrescriptions() throws Exception {
        System.out.println("readPrescriptions");
        Prescription[] expResult = null;
        FileWriter.writePrescriptions(expResult);
        Prescription[] result = FileReader.readPrescriptions();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readAppointments method, of class FileReader.
     */
    @Test
    public void testReadAppointments() throws Exception {
        System.out.println("readAppointments");
        Appointment[] expResult = null;
        FileWriter.writeAppointments(expResult);
        Appointment[] result = FileReader.readAppointments();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readRequests method, of class FileReader.
     */
    @Test
    public void testReadRequests() throws Exception {
        System.out.println("readRequests");
        User[] expResult = null;
        FileWriter.writeAccountRequests(expResult);
        User[] result = FileReader.readRequests();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readAppointmentRequests method, of class FileReader.
     */
    @Test
    public void testReadAppointmentRequests() throws Exception {
        System.out.println("readAppointmentRequests");
        Appointment[] expResult = null;
        FileWriter.writeAppointmentRequests(expResult);
        Appointment[] result = FileReader.readAppointmentRequests();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readAccountTerminationRequests method, of class FileReader.
     */
    @Test
    public void testReadAccountTerminationRequests() throws Exception {
        System.out.println("readAccountTerminationRequests");
        User[] expResult = null;
        FileWriter.writeAccountTermRequests(expResult);
        User[] result = FileReader.readAccountTerminationRequests();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readMedicines method, of class FileReader.
     */
    @Test
    public void testReadMedicines() throws Exception {
        System.out.println("readMedicines");
        Medicine[] expResult = null;
        FileWriter.writeMedicines(expResult);
        Medicine[] result = FileReader.readMedicines();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readOrderRequests method, of class FileReader.
     */
    @Test
    public void testReadOrderRequests() throws Exception {
        System.out.println("readOrderRequests");
        Medicine[] expResult = null;
        FileWriter.writeMedicineOrders(expResult);
        Medicine[] result = FileReader.readOrderRequests();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readProposedAppointments method, of class FileReader.
     */
    @Test
    public void testReadProposedAppointments() throws Exception {
        System.out.println("readProposedAppointments");
        Appointment[] expResult = null;
        FileWriter.writeProposedAppointments(expResult);
        Appointment[] result = FileReader.readProposedAppointments();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readRequestedPrescriptions method, of class FileReader.
     */
    @Test
    public void testReadRequestedPrescriptions() throws Exception {
        System.out.println("readRequestedPrescriptions");
        Prescription[] expResult = null;
        FileWriter.writePrescriptionRequests(expResult);
        Prescription[] result = FileReader.readRequestedPrescriptions();
        assertArrayEquals(expResult, result);
    }
    
}
