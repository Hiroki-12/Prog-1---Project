

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipmentTest {

    @Test
    public void testConstructorAndGetters() {
        Equipment eq = new Equipment("Bike", "Giant", "Bicycle");

        assertEquals("Bike", eq.getName());
        assertEquals("Giant", eq.getBrand());
        assertEquals("Bicycle", eq.getType());
    }

    @Test
    public void testToString() {
        Equipment eq = new Equipment("Treadmill", "NordicTrack", "Cardio");
        String expected = "Treadmill (NordicTrack, Cardio)";
        assertEquals(expected, eq.toString());
    }
}

