
/**
 Class Equipment:
    Attributes:
        - name: String
        - type: String

    Methods:
        - Constructor(name, type)
        - getName()
        - getType()

 * @author (Anthony)
 */
public class Equipment
{
    String equipmentName;
    String model;
    String type;
    String brand;

    /**
     * Constructor for objects of class Equipment
     */
    public Equipment()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getEquipmentName()
    {
        return equipmentName;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getBrand()
    {
        return brand;
    }
}
