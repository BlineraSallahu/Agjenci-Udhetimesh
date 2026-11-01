import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PuntoriTest {

    @Test
    public void testKrijimiSukses() {
        assertDoesNotThrow(() -> {
            new Puntori("P1", "Kron", "Agjent");
        });
    }

    @Test
    public void testPozitaZbrazetHedhException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Puntori("P1", "Kron", "   ");
        });
    }
}
