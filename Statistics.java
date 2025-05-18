import java.util.List;
import java.util.ArrayList;

/**
 Class Statistics:
    Attributes:
        - distance: Double
        - duration: Double
        - intensity: String
        - calories: Integer
        - weight: Integer
        - gender: Gender

    Methods:
        - Constructor(distance, duration, intensity, calories, weight, gender)
        - getDistance()
        - getDuration()
        - getIntensity()
        - getCalories()
        - getWeight()
        - getGender()

 * @author (Anthony)
 */
public class Statistics
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static double calculateTotalDistance(List<Activity> activities)
    {
        double total = 0;
        for (Activity a : activities) {
            total += a.getDistance();
        }
        return total;
    }
    
    public static double calculateDistanceByAthlete(List<Activity> activities, Athlete athlete)
    {
        double total = 0;
        for (Activity a: activities){
            if(a.getAthlete().equals(athlete)) {
                total += a.getDistance();
            }
        }
        return total;
    }
    
    public static double calculateCaloriesByAthlete(List<Activity> activities, Athlete athlete)
    {
        double total = 0;
        for (Activity a:activities) {
            if (a.getAthlete().equals(athlete)) {
                total += a.getCaloriesBurned();
            }
        }
        return total;
    }
}
