package coursework.Models.Objects;

import coursework.*;
import coursework.Controllers.GenerateID;
import java.util.HashSet;
import java.util.Set;

/**
 * Prescription creator class for the FACADE pattern.
 * @author palar
 */
public class PrescriptionCreator {
    
    private String patientID;
    private String doctorID;
    private String notes;
    private Medicine medicineType;
    private int quantity;
    private String dosage;
    
    /**
     * Input the values you want for the prescription into the PrescriptionCreator.
     * Run the createPrescription from the object made from PrescriptionCreator.
     * Output is a prescription with the given details.
     * @param _patientID
     * @param _doctorID
     * @param _notes
     * @param _medicineID
     * @param _quantity
     * @param _dosage 
     */
    public PrescriptionCreator(String _patientID, String _doctorID, String _notes, 
            Medicine _medicineID, int _quantity, String _dosage){
        
        this.patientID = _patientID;
        this.doctorID = _doctorID;
        this.notes = _notes;
        this.medicineType = _medicineID;
        this.quantity = _quantity;
        this.dosage = _dosage;
        
    }
    
    //FACADE PATTERN
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
