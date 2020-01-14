package coursework.Controllers;

import org.junit.Test;
import coursework.Models.Users.*;
import coursework.Models.Objects.*;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class GenerateIDTest {
    
    public GenerateIDTest() {
    }

    /**
     * Test of userID method, of class GenerateID.
     */
    @Test
    public void testUserID() {
        System.out.println("userID");
        char _class = 'A';
        String result = GenerateID.userID(_class);
        try{
            User[] allUsers = FileReader.readUsers();
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().compareTo(result) == 0){
                    fail("Generate unique ID doesn't generate an ID that is UNIQUE.");
                }
            }
        }catch(Exception e){}
    }

    /**
     * Test of feedbackID method, of class GenerateID.
     */
    @Test
    public void testFeedbackID() {
        System.out.println("feedbackID");
        String result = GenerateID.feedbackID();
        try{
            Feedback[] allFeedback = FileReader.readFeedback();
            for(int i = 0; i < allFeedback.length; i++){
                if(allFeedback[i].getFeedbackID().compareTo(result) == 0){
                    fail("Generate unique ID doesn't generate an ID that is UNIQUE.");
                }
            }
        }catch(Exception e){}
    }

    /**
     * Test of appointmentID method, of class GenerateID.
     */
    @Test
    public void testAppointmentID() {
        System.out.println("appointmentID");
        String result = GenerateID.appointmentID();
        try{
            Appointment[] allApps = FileReader.readAppointments();
            for(int i = 0; i < allApps.length; i++){
                if(allApps[i].getAppointmentID().compareTo(result) == 0){
                    fail("Generate unique ID doesn't generate an ID that is UNIQUE.");
                }
            }
        }catch(Exception e){}
    }

    /**
     * Test of prescriptionID method, of class GenerateID.
     */
    @Test
    public void testPrescriptionID() {
        System.out.println("prescriptionID");
        String result = GenerateID.prescriptionID();
        try{
            Prescription[] allPrescriptions = FileReader.readPrescriptions();
            for(int i = 0; i < allPrescriptions.length; i++){
                if(allPrescriptions[i].getPrescriptionID().compareTo(result) == 0){
                    fail("Generate unique ID doesn't generate an ID that is UNIQUE.");
                }
            }
        }catch(Exception e){}
    }
    
}
