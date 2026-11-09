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
    @Test
    public void testKrijimiPuntoritAdministrativ() {
        assertDoesNotThrow(() -> {
            new PuntoriAdministrativ("P2", "Arta", "Administratore");
        });
    }

    @Test
    public void testKrijimiPuntoritShitjes() {
        assertDoesNotThrow(() -> {
            new PuntoriShitjes("P3", "Blerim", "Agjent i shitjes");
        });
    }
}
