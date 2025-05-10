/**
 * Represents available modes of transportation for activities.
 * Some modes are considered "powered" (e.g., biking) and others are regular (e.g., walking).
 */
public enum ModeOfTransport {
    WALKING,
    RUNNING,
    SWIMMING,
    BIKING,
    E_BIKE,
    ROLLERBLADING,
    SCOOTER,
    SKATEBOARDING;

    /**
     * Determines if the mode of transport requires equipment.
     * @return true if it's a powered activity.
     */
    public boolean isPowered() {
        return this == BIKING || this == E_BIKE || this == ROLLERBLADING || this == SCOOTER || this == SKATEBOARDING;
    }
}
