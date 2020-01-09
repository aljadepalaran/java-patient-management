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
public class FileWriterTest {
    
    public FileWriterTest() {
    }

    /**
     * Test of writeUsers method, of class FileWriter.
     */
    @Test
    public void testWriteUsers() throws Exception {
        System.out.println("writeUsers");
        User[] _array = null;
        FileWriter.writeUsers(_array);
        User[] testArray = FileReader.readUsers();
        assertEquals(testArray == null, true);

    }

    /**
     * Test of writeRatings method, of class FileWriter.
     */
    @Test
    public void testWriteRatings() throws Exception {
        System.out.println("writeRatings");
        Rating[] _array = null;
        FileWriter.writeRatings(_array);
        Rating[] testArray = FileReader.readRatings();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeFeedbacks method, of class FileWriter.
     */
    @Test
    public void testWriteFeedbacks() throws Exception {
        System.out.println("writeFeedbacks");
        Feedback[] _array = null;
        FileWriter.writeFeedbacks(_array);
        Feedback[] testArray = FileReader.readFeedback();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writePrescriptions method, of class FileWriter.
     */
    @Test
    public void testWritePrescriptions() throws Exception {
        System.out.println("writePrescriptions");
        Prescription[] _array = null;
        FileWriter.writePrescriptions(_array);
        Prescription[] testArray = FileReader.readPrescriptions();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeAppointments method, of class FileWriter.
     */
    @Test
    public void testWriteAppointments() throws Exception {
        System.out.println("writeAppointments");
        Appointment[] _array = null;
        FileWriter.writeAppointments(_array);
        Appointment[] testArray = FileReader.readAppointments();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeAccountRequests method, of class FileWriter.
     */
    @Test
    public void testWriteAccountRequests() throws Exception {
        System.out.println("writeAccountRequests");
        User[] _array = null;
        FileWriter.writeAccountRequests(_array);
        User[] testArray = FileReader.readRequests();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeAppointmentRequests method, of class FileWriter.
     */
    @Test
    public void testWriteAppointmentRequests() throws Exception {
        System.out.println("writeAppointmentRequests");
        Appointment[] _array = null;
        FileWriter.writeAppointmentRequests(_array);
        Appointment[] testArray = FileReader.readAppointments();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeAccountTermRequests method, of class FileWriter.
     */
    @Test
    public void testWriteAccountTermRequests() throws Exception {
        System.out.println("writeAccountTermRequests");
        User[] _array = null;
        FileWriter.writeAccountTermRequests(_array);
        User[] testArray = FileReader.readUsers();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeMedicines method, of class FileWriter.
     */
    @Test
    public void testWriteMedicines() throws Exception {
        System.out.println("writeMedicines");
        Medicine[] _array = null;
        FileWriter.writeMedicines(_array);
        Medicine[] testArray = FileReader.readMedicines();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeMedicineOrders method, of class FileWriter.
     */
    @Test
    public void testWriteMedicineOrders() throws Exception {
        System.out.println("writeMedicineOrders");
        Medicine[] _array = null;
        FileWriter.writeMedicineOrders(_array);
        User[] testArray = FileReader.readUsers();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writeProposedAppointments method, of class FileWriter.
     */
    @Test
    public void testWriteProposedAppointments() throws Exception {
        System.out.println("writeProposedAppointments");
        Appointment[] _array = null;
        FileWriter.writeProposedAppointments(_array);
        User[] testArray = FileReader.readUsers();
        assertEquals(testArray == null, true);
    }

    /**
     * Test of writePrescriptionRequests method, of class FileWriter.
     */
    @Test
    public void testWritePrescriptionRequests() throws Exception {
        System.out.println("writePrescriptionRequests");
        Prescription[] _array = null;
        FileWriter.writePrescriptionRequests(_array);
        User[] testArray = FileReader.readUsers();
        assertEquals(testArray == null, true);
    }
    
}
