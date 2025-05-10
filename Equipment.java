/**
 * Represents a piece of equipment used in powered activities.
 */
public class Equipment {
    private String name;
    private String brand;
    private String type;
    private double weight; // in kg

    /**
     * Constructor for Equipment.
     */
    public Equipment(String name, String brand, double weight) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
    
    public String getType() {
        return type;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (" + brand + ", " + weight + " kg)";
    }
}
