/**
 * Represents a piece of equipment used in powered activities.
 */
public class Equipment {
    private String name;
    private double weight; // in kg

    /**
     * Constructor for Equipment.
     */
    public Equipment(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
