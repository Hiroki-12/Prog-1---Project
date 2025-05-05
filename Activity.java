import java.time.LocalDate;

/**
 Class Activity:
    Attributes:
        - activities: List of String = [ "walking", "running", "swimming", "biking", "soccer", "football", ... ]

    Methods:
        - getActivities()

 * @author (Anthony)
 */
public class Activity
{
    private LocalDate date;
    private double distance;
    private String modeOfTransportation;
    private Athlete athlete;

    /**
     * Constructor for objects of class Activity
     */
    public Activity()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public LocalDate getDate()
    {
        return date;
    }
    
    public double getDistance()
    {
        return distance;
    }
    
    public String getModeOfTransportation()
    {
        return modeOfTransportation;
    }
    
    public Athlete getAthlete()
    {
        return athlete;
    }
    
    public void printActivityDetails()
    {
        
    }
    
    /*public String toString()
    {
        
    }
    */
}
