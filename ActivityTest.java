
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate; 

public class ActivityTest {

    @Test
    public void testConstructorAndGetters() {
        Athlete athlete = new Athlete("Alex", 1990, Gender.MALE, 70);
        ModeOfTransport mode = ModeOfTransport.RUNNING; 
        Activity activity = new Activity(LocalDate.of(2023, 5, 10), 5.0, 30, mode, athlete);

        assertEquals(5.0, activity.getDistance(), 0.001);
        assertEquals(30, activity.getDuration());
        assertEquals(mode, activity.getMode());
        assertEquals(athlete, activity.getAthlete());
        assertEquals(LocalDate.of(2023, 5, 10), activity.getDate());
    }

        @Test
    public void testInvalidDistance() {
    Athlete athlete = new Athlete("Sara", 1992, Gender.FEMALE, 60);
    ModeOfTransport mode = ModeOfTransport.WALKING;
    
    assertThrows(IllegalArgumentException.class, () -> {
        new Activity(LocalDate.now(), -2.0, 20, mode, athlete);
    });
    }


    @Test
    public void testCaloriesBurned() {
        Athlete athlete = new Athlete("John", 1985, Gender.MALE, 75);
        ModeOfTransport mode = ModeOfTransport.BIKING;
        Activity activity = new Activity(10.0, 40, mode, athlete);

        double expected = (6.0 * 3.5 * 75 / 200) * 40;
        assertEquals(expected, activity.getCaloriesBurned(), 0.001);
    }
}
