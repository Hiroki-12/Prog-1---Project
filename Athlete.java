import java.util.ArrayList;

/**
 * Represents an athlete who performs activities.
 * Stores personal data including name, YOB, gender, height, and weight.
 * 
 */
public class Athlete {
    public String name;
    public int YOB;
    public Gender gender;
    public double weight; // in kg
    public ArrayList<Activity> activities;

    /**
     * Constructs an Athlete with all attributes.
     */
    public Athlete(String name, int YOB, Gender gender, double weight) {
        this.name = name;
        this.YOB = YOB;
        this.gender = gender;
        this.weight = weight;
        this.activities = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getYOB() {
        return YOB;
    }

    public Gender getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }
    
    public ArrayList<Activity> getActivities()
    {
        return activities;
    }

    // Setters
    public void addActivity(Activity activity)
    {
        activities.add(activity);
    }
    
    public double getTotalDistance()
    {
        double total = 0;
        for (Activity a : activities)
        {
            total += a.getDistance();
        }
        return total;
    }
    
    public double getTotalCaloriesBurned() {
        double total = 0;
        for (Activity a : activities) {
            total += a.getCaloriesBurned();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Athlete(" +
                "Name = " + name + '\'' +
                ", YOB = " + YOB + "yrs" +
                ", Gender = " + gender +
                ", Weight = " + weight + "kg" +
                ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Athlete)) return false;
        Athlete other = (Athlete) obj;
        return name.equals(other.name) && YOB == other.YOB;
    }
}
