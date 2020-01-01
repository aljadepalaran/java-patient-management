package coursework.Objects;

import java.io.Serializable;

public class Feedback implements Serializable{
    
    private String feedbackID;
    private String doctorID;
    private String patientID;
    private String adminID;
    private String feedback;
    
    public Feedback(String _feedbackID, String _doctorID, String _patientID, String _adminID, String _feedback){
        this.feedbackID = _feedbackID;
        this.doctorID = _doctorID;
        this.patientID = _patientID;
        this.adminID = _adminID;
        this.feedback = _feedback;
    }

    public String getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    

    
}
