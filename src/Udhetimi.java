import java.time.LocalDate;

public class Udhetimi {
    private String idUdhetimi;
    private String destinacioni;
    private LocalDate dataNisjes;
    private double cmimi;
    private int maxPersona;

    // Agregimi: Lidhja me klasat e tjera bashkepunetore (Collaborators)
    private Hoteli hoteli;
    private Transporti transporti;

    public Udhetimi(String idUdhetimi, String destinacioni, LocalDate dataNisjes, double cmimi, int maxPersona, Hoteli hoteli, Transporti transporti) {
        if (idUdhetimi == null || idUdhetimi.trim().isEmpty()) throw new IllegalArgumentException("ID nuk mund te jete e zbrazet.");
        if (destinacioni == null || destinacioni.trim().isEmpty()) throw new IllegalArgumentException("Destinacioni nuk mund te jetë i zbrazet.");

        // Validimi qe data e udhetimit te mos jete ne te kaluaren
        if (dataNisjes == null || dataNisjes.isBefore(LocalDate.now())) throw new IllegalArgumentException("Data nuk mund te jete ne te kaluaren.");

        // Validimi i vlerave numerike (duhet te jene pozitive)
        if (cmimi <= 0) throw new IllegalArgumentException("Çmimi duhet te jete mbi 0.");
        if (maxPersona <= 0) throw new IllegalArgumentException("Numri i personave duhet t jetë mbi 0.");

        // Sigurohemi qe objektet e lidhura ekzistojnë
        if (hoteli == null) throw new IllegalArgumentException("Duhet te caktohet nje hotel.");
        if (transporti == null) throw new IllegalArgumentException("Duhet te caktohet transporti.");

        this.idUdhetimi = idUdhetimi;
        this.destinacioni = destinacioni;
        this.dataNisjes = dataNisjes;
        this.cmimi = cmimi;
        this.maxPersona = maxPersona;
        this.hoteli = hoteli;
        this.transporti = transporti;
    }
}

