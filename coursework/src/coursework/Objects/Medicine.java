package coursework.Objects;

import java.io.Serializable;

public class Medicine implements Serializable{
    
    private String medicineName;
    private String details;
    private int stock;
    
    public Medicine(String _medicineID, String _details, int _stock){
        this.medicineName = _medicineID;
        this.details = _details;
        this.stock = _stock;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineID(String medicineID) {
        this.medicineName = medicineID;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
