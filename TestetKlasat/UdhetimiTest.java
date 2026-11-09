import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class UdhetimiTest {

    @Test
    public void testKrijimiUdhetimit() {
        Hoteli h = new Hoteli("Hotel International", "Prishtine", 60.0, true);
        Transporti t = new Transporti("Fluturim", "Prishtine", "Gjeneve", LocalDateTime.now().plusDays(1));

        // Përdorim datë në vitin 2027 që të jetë gjithmonë në të ardhmen
        Udhetimi u = new Udhetimi("U2", "Gjeneve", LocalDate.of(2027, 6, 10), 380.0, 3, h, t);

        assertNotNull(u);
        assertEquals("Gjeneve", u.getDestinacioni());
    }

    @Test
    public void testDetajetUdhetimit() {
        Hoteli h = new Hoteli("Hotel Tirana", "Tirane", 40.0, false);
        Transporti t = new Transporti("Autobus", "Prishtine", "Tirane", LocalDateTime.now().plusDays(1));

        // Përdorim datë në vitin 2027 që të jetë gjithmonë në të ardhmen
        Udhetimi u = new Udhetimi("U3", "Tirane", LocalDate.of(2027, 7, 1), 200.0, 5, h, t);

        assertNotNull(u.getHoteli());
        assertNotNull(u.getTransporti());
    }
}