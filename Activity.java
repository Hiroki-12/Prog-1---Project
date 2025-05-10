import java.time.LocalDate;

/**
 * Represents a general physical activity performed by an athlete.
 * Examples include walking, running, or swimming.
 * This class holds basic attributes such as date, distance, and mode.
 * 
 * @author 
 */
public class Activity {
    private LocalDate date;
    private double distance; // in kilometers
    private ModeOfTransport modeOfTransportation;
    private Athlete athlete;

    /**
     * Constructor to initialize an Activity.
     * 
     * @param date Date of the activity
     * @param distance Distance traveled in kilometers
     * @param modeOfTransportation The mode used (e.g., walking, running)
     * @param athlete The athlete who performed the activity
     */
    public Activity(LocalDate date, double distance, ModeOfTransport modeOfTransportation, Athlete athlete) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        this.date = date;
        this.distance = distance;
        this.modeOfTransportation = modeOfTransportation;
        this.athlete = athlete;
    }

    // Getters
    public LocalDate getDate() {
        return date;
    }

    public double getDistance() {
        return distance;
    }

    public ModeOfTransport getModeOfTransportation() {
        return modeOfTransportation;
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
        this.modeOfTransportation = mode;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    /**
     * Estimates calories burned based on distance and a fixed multiplier.
     * For example, assume 60 calories/km for running.
     */
    public double calculateCaloriesBurned() {
        double caloriesPerKm = 60.0; // default estimation
        return distance * caloriesPerKm;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "date=" + date +
                ", distance=" + distance + " km" +
                ", mode=" + modeOfTransportation +
                ", athlete=" + (athlete != null ? athlete.getName() : "N/A") +
                '}';
    }
}
