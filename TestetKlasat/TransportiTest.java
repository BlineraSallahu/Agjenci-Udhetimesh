import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class TransportiTest {

    @Test
    public void testKrijimiSukses() {
        assertDoesNotThrow(() -> {
            // Data në të ardhmen (viti 2027)
            LocalDateTime dataArdhme = LocalDateTime.of(2027, 5, 20, 10, 0);
            new Transporti("Aeroplan", "Prishtinë", "Romë", dataArdhme);
        });
    }

    @Test
    public void testDataKaluarHedhException() {
        assertThrows(IllegalArgumentException.class, () -> {
            // Data në të kaluarën (viti 2020)
            LocalDateTime dataKaluar = LocalDateTime.of(2020, 1, 1, 12, 0);
            new Transporti("Aeroplan", "Prishtinë", "Romë", dataKaluar);
        });
    }
}
