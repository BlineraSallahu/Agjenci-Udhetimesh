import java.time.LocalDateTime;

public class Pagesa {
    // Atributet baze per transaksionin
    private String idPagesa;
    private double shuma;
    private String statusiPageses;
    private LocalDateTime dataPageses; // Ruhet momenti i sakte i pageses

    // Lidhja me Rezervimin (Bashkepunetori sipas kartes CRC)
    private Rezervimi rezervimi;

    public Pagesa(String idPagesa, Rezervimi rezervimi, double shuma, String statusiPageses) {
        // Validimi i të dhënave hyrëse
        if (idPagesa == null || idPagesa.trim().isEmpty()) throw new IllegalArgumentException("ID e pageses nuk mund te jete e zbrazet.");
        if (rezervimi == null) throw new IllegalArgumentException("Pagesa duhet të jetë e lidhur me një rezervim.");

        // Sigurohemi që shuma e paguar është vlerë pozitive
        if (shuma <= 0) throw new IllegalArgumentException("Shuma e pageses duhet te jete me e madhe se 0.");
        if (statusiPageses == null || statusiPageses.trim().isEmpty()) throw new IllegalArgumentException("Statusi i pagesës nuk mund te jete i zbrazet.");

        this.idPagesa = idPagesa;
        this.rezervimi = rezervimi;
        this.shuma = shuma;
        this.statusiPageses = statusiPageses;

        // Sistemi gjeneron automatikisht kohen aktuale te transaksionit
        this.dataPageses = LocalDateTime.now();
    }
}

