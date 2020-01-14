package coursework.Models.Objects;

/**
 * Observable interface for the Observer pattern.
 * @author palar
 */
public interface Observable {
    
    public void registerObserver(String _input);
    
    public void removeObserver(String _input);
    
    public void notifyObserver();
    
}
