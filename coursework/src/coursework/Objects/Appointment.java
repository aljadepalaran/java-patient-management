package coursework.Objects;

import java.io.Serializable;

public class Appointment implements Serializable{
    
    private String appointmentID;
    private String patientID;
    private String doctorID;
    private String date;
    private String notes;
    
    public Appointment(String _appointmentID, String _patientID, String _doctorID, String _date, String _notes){
        this.appointmentID = _appointmentID;
        this.patientID = _patientID;
        this.doctorID = _doctorID;
        this.date = _date;
        this.notes = _notes;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
}
