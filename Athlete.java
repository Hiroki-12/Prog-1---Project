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
    String name;
    int age;
    Gender gender;
    double height;
    double weight;

  
    public Athlete(String name, int age, Gender gender, double height, double weight)
    {
        
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
}
