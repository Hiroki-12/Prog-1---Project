/**
 * Represents available modes of transportation for activities.
 * Some modes are considered "powered" (e.g., biking) and others are regular (e.g., walking).
 */
enum ModeOfTransport {
    WALKING(3.5), RUNNING(7.0), SWIMMING(5.8), BIKING(6.0);
    
    private final double met;
    
    ModeOfTransport(double met)
    {
        this.met = met;
    }
    
    public double getMET()
    {
        return met;
    }
}
