import agjencia.hotelet.Hoteli;
import agjencia.transportet.Transporti;
import agjencia.udhetimet.Udhetimi;
import agjencia.udhetimet.UdhetimiNderkombetar;
import agjencia.udhetimet.UdhetimiVendor;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class UdhetimiTest {

    @Test
    public void testKrijimiUdhetimitNderkombetar() {
        Hoteli h = new Hoteli("Hotel International", "Prishtine", 60.0, true);
        Transporti t = new Transporti("Fluturim", "Prishtine", "Gjeneve", LocalDateTime.now().plusDays(1));

        Udhetimi u = new UdhetimiNderkombetar(
                "U2", "Gjeneve", LocalDate.of(2027, 6, 10),
                380.0, 3, h, t, "Zvicer", true
        );

        assertNotNull(u);
        assertEquals("Gjeneve", u.getDestinacioni());
        assertEquals(400.0, u.llogaritCmiminTotal());
    }

    @Test
    public void testKrijimiUdhetimitVendor() {
        Hoteli h = new Hoteli("Hotel Rugova", "Peje", 45.0, true);
        Transporti t = new Transporti("Autobus", "Prishtine", "Peje", LocalDateTime.now().plusDays(1));

        Udhetimi u = new UdhetimiVendor(
                "U1", "Peje", LocalDate.of(2027, 5, 15),
                100.0, 10, h, t, "Rrafshi i Dukagjinit"
        );

        assertNotNull(u);
        assertEquals("Peje", u.getDestinacioni());
        assertEquals(100.0, u.llogaritCmiminTotal());
    }

    @Test
    public void testDetajetUdhetimit() {
        Hoteli h = new Hoteli("Hotel Tirana", "Tirane", 40.0, false);
        Transporti t = new Transporti("Autobus", "Prishtine", "Tirane", LocalDateTime.now().plusDays(1));

        Udhetimi u = new UdhetimiNderkombetar(
                "U3", "Tirane", LocalDate.of(2027, 7, 1),
                200.0, 5, h, t, "Shqiperi", false
        );

        assertNotNull(u.getHoteli());
        assertNotNull(u.getTransporti());
        assertEquals(200.0, u.llogaritCmiminTotal());
    }
}