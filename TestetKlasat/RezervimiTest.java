import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class RezervimiTest {

    @Test
    public void testKrijimiSukses() {
        Klienti k = new Klienti("K1", "Filan", "Fisteku", "filan@example.com");
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(1));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.of(2027, 6, 10), 150.0, 3, h, t);

        Rezervimi r = new Rezervimi("R1", k, u, "Konfirmuar");

        assertNotNull(r);
        assertEquals("R1", r.getIdRezervimi());
        assertEquals(k, r.getKlienti());
        assertEquals("Konfirmuar", r.getStatusi());
    }

    @Test
    public void testMungesaklier() {
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(1));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.of(2027, 6, 10), 150.0, 3, h, t);

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Rezervimi("R2", null, u, "Ne pritje")
        );

        assertNotNull(exception);
    }
}



