import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class UdhetimiTest {

    @Test
    public void testKrijimiSukses() {
        // Krijojme objektet ndihmese qe i duhen udhetimit
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtina", LocalDateTime.now().plusDays(2));

        assertDoesNotThrow(() -> {
            new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);
        });
    }

    @Test
    public void testMungesaHotelitHedhException() {
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtina", LocalDateTime.now().plusDays(2));

        assertThrows(IllegalArgumentException.class, () -> {
            // Dergimi i vleres 'null' ne vend te hotelit
            new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, null, t);
        });
    }
}
