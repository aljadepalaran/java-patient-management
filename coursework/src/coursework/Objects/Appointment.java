package coursework.Objects;

import coursework.Functions.FileReader;
import coursework.Functions.FileWriter;
import coursework.Users.User;
import java.io.Serializable;

public class Appointment implements Serializable, Observable{
    
    private String appointmentID;
    private String patientID;
    private String doctorID;
    private String date;
    private String notes;
    private String[] observerList;
    
    public Appointment(String _appointmentID, String _patientID, String _doctorID, String _date, String _notes){
        this.appointmentID = _appointmentID;
        this.patientID = _patientID;
        this.doctorID = _doctorID;
        this.date = _date;
        this.notes = _notes;
        this.observerList = new String[2];
        this.observerList[0] = null;
        this.observerList[1] = null;
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

    public String getObserverOne(){
        return this.observerList[0];
    }
    
    public String getObserverTwo(){
        return this.observerList[1];
    }
    
    @Override
    public void registerObserver(String _input) {
       try{
           User[] all = FileReader.readUsers();
           for(int i = 0; i<all.length; i++){
               if(_input.compareTo(all[i].getUniqueID()) == 0){
                   if(this.observerList[0] == null){
                       this.observerList[0] = all[i].getUniqueID();
                       break;
                   }else if(observerList[1] == null){
                       this.observerList[1] = all[i].getUniqueID();
                       break;
                   }else{}
                
               }
           }
       }catch(Exception e){}
    }

    @Override
    public void removeObserver(String _input) {
        if(this.observerList[0].compareTo(_input) == 0){
            this.observerList[0] = null;
        }else if(this.observerList[1].compareTo(_input) == 0){
            this.observerList[1] = null;
        }else{}
    }

    @Override
    public void notifyObserver() {
        try{
            User[] all = FileReader.readUsers();
            if(observerList[0] != null){
                for(int i = 0; i < all.length; i++){
                    if(observerList[0].compareTo(all[i].getUniqueID()) == 0){
                        all[i].update(true);
                    }
                }
            }
            if(observerList[1] != null){
                for(int i = 0; i < all.length; i++){
                    if(observerList[1].compareTo(all[i].getUniqueID()) == 0){
                        all[i].update(true);
                    }
                }
            }
            FileWriter.writeUsers(all);
        }catch(Exception e){}
       

    }
    
    
    
}
