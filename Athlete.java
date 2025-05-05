/**Class Athlete:
    //Attributes:
       // - name: String
       // - age: Integer
       // - gender: Gender
        //- weight: Integer

   // Methods:
       // - Constructor(name, age, gender, weight)
      //  - getName()
        //- getAge()
       // - getGender()
        //- getWeight()
 * @author (Anthony)

 */
public class Athlete
{
    private String name;
    private int age;
    private Gender gender;
    private double height;
    private double weight;

  
    public Athlete(String name, int age, Gender gender, double height, double weight)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public Gender getGender()
    {
        return gender;
    }
    
    public double getHeight()
    {
       return height; 
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Height: " + height + " cm, Weight: " + weight + " kg"; 
    }
}
