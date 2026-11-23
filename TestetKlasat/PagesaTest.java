
import agjencia.hotelet.Hoteli;
import agjencia.klientet.Klienti;
import agjencia.pagesat.Pagesa;
import agjencia.pagesat.PagesaInterface;
import agjencia.pagesat.PagesaMeKarte;
import agjencia.pagesat.PagesaMePara;
import agjencia.rezervimet.Rezervimi;
import agjencia.transportet.Transporti;
import agjencia.udhetimet.Udhetimi;

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
            new Pagesa("PAY1", r, -5.0, "E kryer");
        });
    }

    @Test
    public void testKrijimiPagesesMeKarte() {

        Klienti k = new Klienti("K1", "Filan", "Fisteku", "filan@email.com");
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(2));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);
        Rezervimi r = new Rezervimi("R1", k, u, "I konfirmuar");

        assertDoesNotThrow(() -> {
            new PagesaMeKarte("PAY2", r, 120.0, "E kryer");
        });
    }

    @Test
    public void testKrijimiPagesesMePara() {

        Klienti k = new Klienti("K1", "Filan", "Fisteku", "filan@email.com");
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(2));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);
        Rezervimi r = new Rezervimi("R1", k, u, "I konfirmuar");

        assertDoesNotThrow(() -> {
            new PagesaMePara("PAY3", r, 120.0, "E kryer");
        });
    }

    // Testimi i Interface me dy implementime

    @Test
    public void testInterfaceMeDyImplementime() {

        Klienti k = new Klienti("K1", "Filan", "Fisteku", "filan@email.com");
        Hoteli h = new Hoteli("Hotel Grand", "Prishtine", 50.0, true);
        Transporti t = new Transporti("Autobus", "Ferizaj", "Prishtine", LocalDateTime.now().plusDays(2));
        Udhetimi u = new Udhetimi("U1", "Prishtine", LocalDate.now().plusDays(2), 120.0, 30, h, t);
        Rezervimi r = new Rezervimi("R1", k, u, "I konfirmuar");

        PagesaInterface pagesa1 =
                new PagesaMeKarte("PAY4", r, 120.0, "E kryer");

        PagesaInterface pagesa2 =
                new PagesaMePara("PAY5", r, 120.0, "E kryer");

        assertDoesNotThrow(() -> pagesa1.kryejPagesen(120.0));

        assertDoesNotThrow(() -> pagesa2.kryejPagesen(120.0));
    }
}

