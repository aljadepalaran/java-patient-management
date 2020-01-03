package coursework.Objects;

import coursework.*;
import coursework.Functions.GenerateID;
import java.util.HashSet;
import java.util.Set;

public class PrescriptionCreator {
    
    private String patientID;
    private String doctorID;
    private String notes;
    private Medicine medicineType;
    private int quantity;
    private String dosage;
    
    public PrescriptionCreator(String _patientID, String _doctorID, String _notes, 
            Medicine _medicineID, int _quantity, String _dosage){
        
        this.patientID = _patientID;
        this.doctorID = _doctorID;
        this.notes = _notes;
        this.medicineType = _medicineID;
        this.quantity = _quantity;
        this.dosage = _dosage;
        
    }
    
    public Prescription createPrescription(){
        Medicine med = new Medicine("", "" , 0);
        String prescriptionID = GenerateID.prescriptionID();
        Prescription output = new Prescription(prescriptionID, "", "", "", med, 0, "");
        output.setPatientID(this.patientID);
        output.setDoctorID(this.doctorID);
        output.setNotes(this.notes);
        output.setMedicineType(this.medicineType);
        output.setQuantity(this.quantity);
        output.setDosage(this.dosage);
        return output;
    }
    
}
