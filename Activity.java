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
    private ModeOfTransport modeOfTransportation;
    private Athlete athlete;

    /**
     * Constructor for objects of class Activity
     */
    public Activity()
    {
        this.date = date;
        this.distance = distance;
        this.modeOfTransportation = modeOfTransportation;
        this.athlete = athlete;
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
    
    public ModeOfTransport getModeOfTransportation()
    {
        return modeOfTransportation;
    }
    
    public Athlete getAthlete()
    {
        return athlete;
    }
    
    public void printActivityDetails()
    {
        System.out.println(toString());
    }
    
    public String toString()
    {
        return "Activity: " + modeOfTransportation + ", Date: " + date + 
        ", Distance: " + distance + " km" + ", Athlete: " + athlete.getName();
    }
}
