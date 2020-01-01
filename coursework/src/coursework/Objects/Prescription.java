package coursework.Objects;

import java.io.Serializable;

public class Prescription implements Serializable{
    
    private String patientID;
    private String doctorID;
    private String notes;
    private String medicineID;
    private int quantity;
    private String dosage;
    
    public Prescription(String _patientID, String _doctorID, String _notes, 
            String _medicineID, int _quantity, String _dosage){
        
        this.patientID = _patientID;
        this.doctorID = _doctorID;
        this.notes = _notes;
        this.medicineID = _medicineID;
        this.quantity = _quantity;
        this.dosage = _dosage;
        
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
}
