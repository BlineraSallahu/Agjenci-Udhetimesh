import java.time.LocalDateTime;

public class Transporti {
    // Atributet për menaxhimin e udhetimit fizik
    protected String llojiTransportit; // p.sh., "Aeroplan", "Autobus"
    protected String nisja;
    protected String destinacioni;
    protected LocalDateTime orariNisjes; // Data dhe ora e nisjes

    public Transporti(String llojiTransportit, String nisja, String destinacioni, LocalDateTime orariNisjes) {
        // Validimi i rruges dhe llojit te mjetit te transportit
        if (llojiTransportit == null || llojiTransportit.trim().isEmpty()) throw new IllegalArgumentException("Lloji i transportit nuk mund te jete i zbrazet.");
        if (nisja == null || nisja.trim().isEmpty()) throw new IllegalArgumentException("Vendi i nisjes nuk mund te jete i zbrazet.");
        if (destinacioni == null || destinacioni.trim().isEmpty()) throw new IllegalArgumentException("Destinacioni nuk mund te jete i zbrazet.");

        // Validimi qe mjeti nuk mund te niset ne nje kohe qe ka kaluar tashme
        if (orariNisjes == null || orariNisjes.isBefore(LocalDateTime.now())) throw new IllegalArgumentException("Orari i nisjes nuk mund te jete ne te kaluaren.");

        this.llojiTransportit = llojiTransportit;
        this.nisja = nisja;
        this.destinacioni = destinacioni;
        this.orariNisjes = orariNisjes;
    }
}

