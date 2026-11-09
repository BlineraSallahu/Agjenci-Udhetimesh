import java.time.LocalDate;

public class UdhetimiNderkombetar extends Udhetimi {
    private String shtetiDestinacion;
    private boolean kerkohetViza;

    public UdhetimiNderkombetar(String idUdhetimi, String destinacioni, LocalDate dataNisjes, double cmimi, int maxPersona, Hoteli hoteli, Transporti transporti, String shtetiDestinacion, boolean kerkohetViza) {
        super(idUdhetimi, destinacioni, dataNisjes, cmimi, maxPersona, hoteli, transporti);

        if (shtetiDestinacion == null || shtetiDestinacion.trim().isEmpty()) {
            throw new IllegalArgumentException("Shteti destinacion nuk mund të jetë i zbrazët.");
        }
        this.shtetiDestinacion = shtetiDestinacion;
        this.kerkohetViza = kerkohetViza;
    }

    public String getShtetiDestinacion() { return shtetiDestinacion; }
    public boolean isKerkohetViza() { return kerkohetViza; }
}