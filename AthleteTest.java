

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AthleteTest {

    @Test
    public void testAthleteCreation() {
        Athlete athlete = new Athlete("Liam", 2000, Gender.MALE, 68);
        assertEquals("Liam", athlete.getName());
        assertEquals(2000, athlete.getYOB());
        assertEquals(Gender.MALE, athlete.getGender());
        assertEquals(68, athlete.getWeight(), 0.001);
    }

    @Test
    public void testAddActivityAndDistance() {
        Athlete athlete = new Athlete("Emma", 1995, Gender.FEMALE, 55);
        ModeOfTransport mode = ModeOfTransport.RUNNING;
        Activity activity = new Activity(5.0, 25, mode, athlete);

        athlete.addActivity(activity);
        assertEquals(5.0, athlete.getTotalDistance(), 0.001);
    }

    @Test
    public void testTotalCalories() {
        Athlete athlete = new Athlete("Chris", 1980, Gender.MALE, 80);
        ModeOfTransport walk = ModeOfTransport.WALKING;
        Activity a1 = new Activity(2.0, 30, walk, athlete);
        Activity a2 = new Activity(3.0, 45, walk, athlete);
        athlete.addActivity(a1);
        athlete.addActivity(a2);

        double expected = a1.getCaloriesBurned() + a2.getCaloriesBurned();
        assertEquals(expected, athlete.getTotalCaloriesBurned(), 0.001);
    }
}
