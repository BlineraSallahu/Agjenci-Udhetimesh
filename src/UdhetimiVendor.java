import java.time.LocalDate;

public class UdhetimiVendor extends Udhetimi {
    private String rajoni;

    public UdhetimiVendor(String idUdhetimi, String destinacioni, LocalDate dataNisjes, double cmimi, int maxPersona, Hoteli hoteli, Transporti transporti, String rajoni) {
        super(idUdhetimi, destinacioni, dataNisjes, cmimi, maxPersona, hoteli, transporti);

        if (rajoni == null || rajoni.trim().isEmpty()) {
            throw new IllegalArgumentException("Rajoni nuk mund të jetë i zbrazët.");
        }
        this.rajoni = rajoni;
    }

    public String getRajoni() { return rajoni; }
}