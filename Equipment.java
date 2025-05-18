/**
 * Represents a piece of equipment used in powered activities.
 */
public class Equipment {
    private String name;
    private String type;
    private String brand;

    /**
     * Constructor for Equipment.
     */
    public Equipment(String name, String brand, String type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public String getBrand()
    {
        return brand;
    }

    @Override
    public String toString() {
        return name + " (" + brand + ", " + type + ")";
    }
}
