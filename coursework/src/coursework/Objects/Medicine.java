package coursework.Objects;

import java.io.Serializable;

public class Medicine implements Serializable{
    
    private String medicineID;
    private String details;
    private int stock;
    
    public Medicine(String _medicineID, String _details, int _stock){
        this.medicineID = _medicineID;
        this.details = _details;
        this.stock = _stock;
    }

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
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
