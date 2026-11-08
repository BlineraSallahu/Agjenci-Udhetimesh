import java.time.LocalDateTime;

public class TransportiTest {
    public static void main(String[] args) {
        // Data e nisjes vendoset në të ardhmen për të kaluar validimet
        LocalDateTime dataArdhshme = LocalDateTime.now().plusDays(2);

        try {
            // Testimi i Autobusit me emërtim të saktë
            Autobusi autobus = new Autobusi("Prishtinë", "Tiranë", dataArdhshme, 50);
            System.out.println(" Autobusi u krijua me sukses!");
            System.out.println("Lloji: " + autobus.llojiTransportit + " | Numri i ulëseve: " + autobus.getNumriUleseve());

            System.out.println("----------------------------------------");

            // Testimi i Aeroplanit
            Aeroplani aeroplan = new Aeroplani("Shkup", "Zvicër", dataArdhshme, "Austrian Airlines");
            System.out.println("Aeroplani u krijua me sukses!");
            System.out.println("Lloji: " + aeroplan.llojiTransportit + " | Kompania: " + aeroplan.getKompaniaFluturimit());

        } catch (IllegalArgumentException e) {
            System.out.println(" Gabim gjatë validimit: " + e.getMessage());
        }
    }
}
