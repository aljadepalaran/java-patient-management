package coursework.Models.Objects;

public interface Observable {
    
    public void registerObserver(String _input);
    
    public void removeObserver(String _input);
    
    public void notifyObserver();
    
}
