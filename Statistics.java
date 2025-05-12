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
    public static double totalDistance(ArrayList<Activity> activities) {
        return activities.stream().mapToDouble(Activity::getDistance).sum();
    }

    public static double totalCalories(ArrayList<Activity> activities) {
        return activities.stream().mapToDouble(Activity::getCaloriesBurned).sum();
    }

    public static double distanceByAthlete(Athlete athlete) {
        return athlete.getTotalDistance();
    }

    public static double caloriesByAthlete(Athlete athlete) {
        return athlete.getTotalCaloriesBurned();
    }
    
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
