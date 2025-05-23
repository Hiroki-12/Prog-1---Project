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

    public PoweredActivity(double distance, int duration, ModeOfTransport mode, Athlete athlete, Equipment equipment) {
        super(distance, duration, mode, athlete);
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return super.toString() + " using equipment: " + equipment.getName() + " (" + equipment.getBrand() + ", " + equipment.getType() + ")";
    }
}

