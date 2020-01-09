package coursework.Models.Objects;

import java.io.Serializable;

public class Rating implements Serializable{
    
    private String doctorID;
    private String patientID;
    private int ratingValue;//max value = 5
    private String message;
    
    public Rating(String _doctorID, String _patientID, int _ratingValue, String _message){
        this.doctorID = _doctorID;
        this.patientID = _patientID;
        this.ratingValue = _ratingValue;
        this.message = _message;
    }
    
    //GET Methods.
    public String getDoctorID(){
        return this.doctorID;
    }
    public String getPatientID(){
        return this.patientID;
    }
    public int getRatingValue(){
        return this.ratingValue;
    }
    public String getMessage(){
        return this.message;
    }
    
    //SET Methods.
    public void setDoctorID(String _doctorID){
        this.doctorID = _doctorID;
    }
    public void setPatientID(String _patientID){
        this.patientID = _patientID;
    }
    public void setRatingValue(int _value){
        this.ratingValue = _value;
    }
    public void setMessage(String _message){
        this.message = _message;
    }
    
}
