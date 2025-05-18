import java.time.LocalDate;

/**
 * Represents a general physical activity performed by an athlete.
 * Examples include walking, running, or swimming.
 * This class holds basic attributes such as date, distance, and mode.
 * 
 * @author 
 */
public class Activity {
    protected LocalDate date;
    protected double distance; // in kilometers
    protected int duration; // in minutes
    protected ModeOfTransport mode;
    protected Athlete athlete;

    /**
     * Constructor to initialize an Activity.
     * 
     * @param date Date of the activity
     * @param distance Distance traveled in kilometers
     * @param modeOfTransportation The mode used (e.g., walking, running)
     * @param athlete The athlete who performed the activity
     */
    public Activity(LocalDate date, double distance, int duration, ModeOfTransport mode, Athlete athlete) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        this.date = date;
        this.distance = distance;
        this.duration = duration;
        this.mode = mode;
        this.athlete = athlete;
    }

    public Activity(double distance, int duration, ModeOfTransport mode, Athlete athlete) {
        this.distance = distance;
        this.duration = duration;
        this.mode = mode;
        this.date = LocalDate.now();
        this.athlete = athlete;
    }
    // Getters
    public LocalDate getDate() {
        return date;
    }

    public double getDistance() {
        return distance;
    }
    
    public int getDuration()
    {
        return duration;
    }

    public ModeOfTransport getMode() {
        return mode;
    }

    public Athlete getAthlete() {
        return athlete;
    }
    
    // Setters
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDistance(double distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        this.distance = distance;
    }

    public void setModeOfTransportation(ModeOfTransport mode) {
        this.mode = mode;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    /**
     * Calculate the calories burned, MET = intensity from 1-10
     */
    public double getCaloriesBurned()
    {
        double met = mode.getMET();
        return (met * 3.5 * athlete.getWeight() / 200) * duration;
    }

    @Override
    public String toString() {
        return date + " - " + mode + " - " + distance + "km in " + duration + "min by " + athlete.getName();
    }
}
