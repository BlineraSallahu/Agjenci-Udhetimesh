import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HoteliTest {

    @Test
    public void testKrijimiSukses() {
        assertDoesNotThrow(() -> {
            new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        });
    }

    @Test
    public void testCmimiNegativHedhException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Hoteli("Hotel Grand", "Prishtine", -10.0, true);
        });
    }
}
