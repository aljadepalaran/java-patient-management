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
import coursework.Users.Patient;
import coursework.Users.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class ResizeTest {
    
    public ResizeTest() {
    }

    /**
     * Test of userArray method, of class Resize.
     */
    @Test
    public void testUserArray() {
        System.out.println("userArray");
        User[] _array = new User[5];
        _array = Resize.userArray(_array, 6);
        assertEquals(_array.length, 6);
    }

    /**
     * Test of ratingArray method, of class Resize.
     */
    @Test
    public void testRatingArray() {
        System.out.println("ratingArray");
        Rating[] _array = new Rating[5];
        _array = Resize.ratingArray(_array, 6);
        assertEquals(_array.length, 6);
    }

    /**
     * Test of feedbackArray method, of class Resize.
     */
    @Test
    public void testFeedbackArray() {
        System.out.println("feedbackArray");
        Feedback[] _array = new Feedback[5];
        _array = Resize.feedbackArray(_array, 6);
        assertEquals(_array.length, 6);
    }

    /**
     * Test of appointmentArray method, of class Resize.
     */
    @Test
    public void testAppointmentArray() {
        System.out.println("appointmentArray");
        Appointment[] _array = new Appointment[5];
        _array = Resize.appointmentArray(_array, 6);
        assertEquals(_array.length, 6);
    }

    /**
     * Test of prescriptionArray method, of class Resize.
     */
    @Test
    public void testPrescriptionArray() {
        System.out.println("prescriptionArray");
        Prescription[] _array = new Prescription[5];
        _array = Resize.prescriptionArray(_array, 6);
        assertEquals(_array.length, 6);
    }

    /**
     * Test of stringArray method, of class Resize.
     */
    @Test
    public void testStringArray() {
        System.out.println("stringArray");
        String[] _array = new String[5];
        _array = Resize.stringArray(_array, 6);
        assertEquals(_array.length, 6);

    }

    /**
     * Test of medicineArray method, of class Resize.
     */
    @Test
    public void testMedicineArray() {
        System.out.println("medicineArray");
        Medicine[] _array = new Medicine[5];
        _array = Resize.medicineArray(_array, 6);
        assertEquals(_array.length, 6);

    }

    /**
     * Test of patientArray method, of class Resize.
     */
    @Test
    public void testPatientArray() {
        System.out.println("patientArray");
        Patient[] _array = new Patient[5];
        _array = Resize.patientArray(_array, 6);
        assertEquals(_array.length, 6);

    }

    /**
     * Test of shortenUsers method, of class Resize.
     */
    @Test
    public void testShortenUsers() {
        System.out.println("shortenUsers");
        User[] _array = new User[5];
        _array = Resize.shortenUsers(_array);
        assertEquals(_array.length, 4);


    }

    /**
     * Test of shortenRatings method, of class Resize.
     */
    @Test
    public void testShortenRatings() {
        System.out.println("shortenRatings");
        Rating[] _array = new Rating[5];
        _array = Resize.shortenRatings(_array);
        assertEquals(_array.length, 4);

    }

    /**
     * Test of shortenFeedback method, of class Resize.
     */
    @Test
    public void testShortenFeedback() {
        System.out.println("shortenFeedback");
        Feedback[] _array = new Feedback[5];
        _array = Resize.shortenFeedback(_array);
        assertEquals(_array.length, 4);

    }

    /**
     * Test of shortenAppointment method, of class Resize.
     */
    @Test
    public void testShortenAppointment() {
        System.out.println("shortenAppointment");
        Appointment[] _array = new Appointment[5];
        _array = Resize.shortenAppointment(_array);
        assertEquals(_array.length, 4);

    }

    /**
     * Test of shortenPrescription method, of class Resize.
     */
    @Test
    public void testShortenPrescription() {
        System.out.println("shortenPrescription");
        Prescription[] _array = new Prescription[5];
        _array = Resize.shortenPrescription(_array);
        assertEquals(_array.length, 4);
   

    }

    /**
     * Test of shortenMedicines method, of class Resize.
     */
    @Test
    public void testShortenMedicines() {
        System.out.println("shortenMedicines");
        Medicine[] _array = new Medicine[5];
        _array = Resize.shortenMedicines(_array);
        assertEquals(_array.length, 4);

    }
    
}
