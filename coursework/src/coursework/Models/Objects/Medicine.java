package coursework.Models.Objects;

import java.io.Serializable;

/**
 * Medicine class to hold information about medicine in the system.
 * @author palar
 */
public class Medicine implements Serializable{
    
    private String medicineName;
    private String details;
    private int stock;
    
    public Medicine(String _medicineName, String _details, int _stock){
        this.medicineName = _medicineName;
        this.details = _details;
        this.stock = _stock;
    }

    public String getMedicineName() {
        return medicineName;
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
