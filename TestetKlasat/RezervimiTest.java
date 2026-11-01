import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class RezervimiTest {

    @Test
    public void testKrijimiSukses() {
        Klienti k = new Klienti("K1", "Filan", "Fisteku", "filan@email.com");
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(2));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);

        assertDoesNotThrow(() -> {
            new Rezervimi("R1", k, u, "I konfirmuar");
        });
    }

    @Test
    public void testMungesaKlientitHedhException() {
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(2));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);

        assertThrows(IllegalArgumentException.class, () -> {
            // Dergimi i 'null' per klientin duhet te dështoje
            new Rezervimi("R1", null, u, "I konfirmuar");
        });
    }
}
