/**
 * A powered activity is a physical activity that uses equipment,
 * such as biking, e-biking, or rollerblading.
 * Inherits from Activity and adds an Equipment field.
 */
public class PoweredActivity extends Activity {
    private Equipment equipment;

    /**
     * Constructor for PoweredActivity
     *
     * @param date The date of the activity
     * @param distance Distance in kilometers
     * @param mode Mode of transportation (should be powered)
     * @param athlete The athlete who performed the activity
     * @param equipment The equipment used
     */
    public PoweredActivity(java.time.LocalDate date, double distance, ModeOfTransport mode, Athlete athlete, Equipment equipment) {
        super(date, distance, mode, athlete);
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() + ", Equipment=" + (equipment != null ? equipment.getName() : "None");
    }

    @Override
    public double calculateCaloriesBurned() {
        // Assume powered activities burn fewer calories due to assistance
        double baseCalories = super.calculateCaloriesBurned();
        return baseCalories * 0.7; // Example: 70% of normal activity
    }
}
