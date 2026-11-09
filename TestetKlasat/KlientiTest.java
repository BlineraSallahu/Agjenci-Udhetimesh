import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KlientiTest {

    @Test
    public void testKrijimimeSukses() {
        // Skenari pozitiv: çdo gjë është në rregull
        assertDoesNotThrow(() -> {
            new Klienti("K1", "Filan", "Fisteku", "filan@email.com");
        });
    }

    @Test
    public void testEmailGabuarHedhException() {
        // Skenari negativ: email pa '@' duhet te deshtoje
        assertThrows(IllegalArgumentException.class, () -> {
            new Klienti("K1", "Filan", "Fisteku", "email-pa-at.com");
        });
    }

    @Test
    public void testEmerZbrazetHedhException() {
        // Skenari negativ: emri i zbrazet duhet te deshtoje
        assertThrows(IllegalArgumentException.class, () -> {
            new Klienti("K1", "", "Fisteku", "filan@email.com");
        });
    }
    @Test
    public void testKrijimiKlientitVIP() {
        assertDoesNotThrow(() -> {
            new KlientiVIP(
                    "K2",
                    "Arta",
                    "Berisha",
                    "arta@email.com"
            );
        });
    }

    @Test
    public void testKrijimiKlientitStandard() {
        assertDoesNotThrow(() -> {
            new KlientiStandard(
                    "K3",
                    "Blerim",
                    "Krasniqi",
                    "blerim@email.com"
            );
        });
    }
}



