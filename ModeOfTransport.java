public enum ModeOfTransport {
    WALKING(3.5),
    RUNNING(8.0),
    BIKING(6.0),
    SWIMMING(7.0);

    private final double MET;

    ModeOfTransport(double MET) {
        this.MET = MET;
    }

    public double getMET() {
        return MET;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase(); // e.g., "Running"
    }
}
