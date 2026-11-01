import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class PagesaTest {

    @Test
    public void testKrijimiSukses() {
        Klienti k = new Klienti("K1", "Filan", "Fisteku", "filan@email.com");
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(2));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);
        Rezervimi r = new Rezervimi("R1", k, u, "I konfirmuar");

        assertDoesNotThrow(() -> {
            new Pagesa("PAY1", r, 120.0, "E kryer");
        });
    }

    @Test
    public void testShumaNegativeHedhException() {
        Klienti k = new Klienti("K1", "Filan", "Fisteku", "filan@email.com");
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(2));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);
        Rezervimi r = new Rezervimi("R1", k, u, "I konfirmuar");

        assertThrows(IllegalArgumentException.class, () -> {
            // Pagesa me vlere 0 ose negative duhet te deshtoje
            new Pagesa("PAY1", r, -5.0, "E kryer");
        });
    }
}
