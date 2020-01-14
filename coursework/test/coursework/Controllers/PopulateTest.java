package coursework.Controllers;

import org.junit.Test;
import coursework.Models.Objects.*;
import coursework.Models.Users.*;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class PopulateTest {
    
    public PopulateTest() {
    }

    /**
     * Test of populateFile method, of class Populate.
     */
    @Test
    public void testPopulateFile() {
        System.out.println("populateFile");
        //This is a compilation of methods.
    }

    /**
     * Test of populateUsers method, of class Populate.
     */
    @Test
    public void testPopulateUsers() {
        System.out.println("populateUsers");
        Populate.populateUsers();
        try{
            User[] allUsers = FileReader.readUsers();
            assertEquals(allUsers[allUsers.length - 1].getUniqueID(), "P0010");
        }catch(Exception e){}
    }

    /**
     * Test of populateAppointments method, of class Populate.
     */
    @Test
    public void testPopulateAppointments() {
        System.out.println("populateAppointments");
        Populate.populateAppointments();
        try{
            Appointment[] allApps = FileReader.readAppointments();
            assertEquals(allApps[allApps.length - 1].getAppointmentID(), "0010");
        }catch(Exception e){}
    }

    /**
     * Test of populateFeedbacks method, of class Populate.
     */
    @Test
    public void testPopulateFeedbacks() {
        System.out.println("populateFeedbacks");
        Populate.populateFeedbacks();
        try{
            Feedback[] allFeedbacks = FileReader.readFeedback();
            assertEquals(allFeedbacks[allFeedbacks.length - 1].getFeedbackID(), "0004");
        }catch(Exception e){}
    }

    /**
     * Test of populateMedicines method, of class Populate.
     */
    @Test
    public void testPopulateMedicines() {
        System.out.println("populateMedicines");
        Populate.populateMedicines();
        try{
            Medicine[] allMeds = FileReader.readMedicines();
            assertEquals(allMeds[allMeds.length - 1].getMedicineName(), "Valium");
        }catch(Exception e){}
    }

    /**
     * Test of populatePrescriptions method, of class Populate.
     */
    @Test
    public void testPopulatePrescriptions() {
        System.out.println("populatePrescriptions");
        Populate.populatePrescriptions();
        try{
            Prescription[] allPrescriptions = FileReader.readPrescriptions();
            assertEquals(allPrescriptions[allPrescriptions.length - 1].getPrescriptionID(), "0004");
        }catch(Exception e){}
    }

    /**
     * Test of populateRatings method, of class Populate.
     */
    @Test
    public void testPopulateRatings() {
        System.out.println("populateRatings");
        Populate.populateRatings();
        try{
            Rating[] allRatings = FileReader.readRatings();
            assertEquals(allRatings[allRatings.length - 1].getDoctorID(), "D0003");
        }catch(Exception e){}
    }

    /**
     * Test of populateTerminationRequests method, of class Populate.
     */
    @Test
    public void testPopulateTerminationRequests() {
        System.out.println("populateTerminationRequests");
        Populate.populateTerminationRequests();
        try{
            User[] allTerms = FileReader.readAccountTerminationRequests();
            assertEquals(allTerms[allTerms.length - 1].getUniqueID(), "P0010");
        }catch(Exception e){}
    }

    /**
     * Test of populateProposedAppointments method, of class Populate.
     */
    @Test
    public void testPopulateProposedAppointments() {
        System.out.println("populateProposedAppointments");
        Populate.populateProposedAppointments();
        try{
            Appointment[] allAppProposed = FileReader.readProposedAppointments();
            assertEquals(allAppProposed[allAppProposed.length - 1].getAppointmentID(), "0015");
        }catch(Exception e){}
    }

    /**
     * Test of populateAppointmentRequests method, of class Populate.
     */
    @Test
    public void testPopulateAppointmentRequests() {
        System.out.println("populateAppointmentRequests");
        Populate.populateAppointmentRequests();
        try{
            Appointment[] allAppRequests = FileReader.readAppointmentRequests();
            assertEquals(allAppRequests[allAppRequests.length - 1].getAppointmentID(), "0020");
        }catch(Exception e){}
    }

    /**
     * Test of populateOrders method, of class Populate.
     */
    @Test
    public void testPopulateOrders() {
        System.out.println("populateOrders");
        Populate.populateOrders();
        try{
            Medicine[] allOrders = FileReader.readOrderRequests();
            assertEquals(allOrders[allOrders.length - 1].getMedicineName(), "Benadryl");
        }catch(Exception e){}
    }

    /**
     * Test of populatePrescriptionRequests method, of class Populate.
     */
    @Test
    public void testPopulatePrescriptionRequests() {
        System.out.println("populatePrescriptionRequests");
        Populate.populatePrescriptionRequests();
        try{
            Prescription[] allRequests = FileReader.readRequestedPrescriptions();
            assertEquals(allRequests[allRequests.length - 1].getPrescriptionID(), "0009");
        }catch(Exception e){}
    }

    /**
     * Test of populateAccountRequests method, of class Populate.
     */
    @Test
    public void testPopulateAccountRequests() {
        System.out.println("populateAccountRequests");
        Populate.populateAccountRequests();
        try{
            User[] allRequests = FileReader.readRequests();
            assertEquals(allRequests[allRequests.length - 1].getUniqueID(), "P0015");
        }catch(Exception e){}
    }
    
}
