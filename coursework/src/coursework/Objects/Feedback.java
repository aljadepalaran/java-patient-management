package coursework.Objects;

import java.io.Serializable;

public class Feedback implements Serializable{
    
    private String doctorID;
    private String patientID;
    private String adminID;
    private String feedback;
    
    public Feedback(String _doctorID, String _patientID, String _adminID, String _feedback){
        this.doctorID = _doctorID;
        this.patientID = _patientID;
        this.adminID = _adminID;
        this.feedback = _feedback;
    }
    
    //GET Methods.
    public String getDoctorID(){
        return this.doctorID;
    }
    public String getPatientID(){
        return this.patientID;
    }
    public String getAdminID(){
        return this.adminID;
    }
    public String getFeedback(){
        return this.feedback;
    }
    
    //SET Methods.
    public void setDoctorID(String _doctorID){
        this.doctorID = _doctorID;
    }
    public void setPatientID(String _patientID){
        this.patientID = _patientID;
    }
    public void setAdminID(String _adminID){
        this.adminID = _adminID;
    }
    public void setFeedback(String _feedback){
        this.feedback = _feedback;
    }
    
}
