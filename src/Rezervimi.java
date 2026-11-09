import java.time.LocalDateTime;

public class Rezervimi {
    // Atributet e bëra 'protected' që të mund të qasen nga nënklasat
    protected String idRezervimi;
    protected LocalDateTime dataRezervimit;
    protected String statusi;

    // Nderlidhja e objekteve sipas kartës CRC
    protected Klienti klienti;
    protected Udhetimi udhetimi;

    public Rezervimi(String idRezervimi, Klienti klienti, Udhetimi udhetimi, String statusi) {
        if (idRezervimi == null || idRezervimi.trim().isEmpty()) throw new IllegalArgumentException("ID nuk mund te jete e zbrazet.");
        if (klienti == null) throw new IllegalArgumentException("Rezervimi duhet te kete nje klient.");
        if (udhetimi == null) throw new IllegalArgumentException("Rezervimi duhet te kete nje udhetim.");
        if (statusi == null || statusi.trim().isEmpty()) throw new IllegalArgumentException("Statusi nuk mund te jete i zbrazet.");

        this.idRezervimi = idRezervimi;
        this.klienti = klienti;
        this.udhetimi = udhetimi;
        this.statusi = statusi;

        // Regjistrimi automatik i kohes aktuale kur krijohet objekti
        this.dataRezervimit = LocalDateTime.now();
    }

    // Metodat Getter (të dobishme për leximin e të dhënave)
    public String getIdRezervimi() { return idRezervimi; }
    public LocalDateTime getDataRezervimit() { return dataRezervimit; }
    public String getStatusi() { return statusi; }
    public Klienti getKlienti() { return klienti; }
    public Udhetimi getUdhetimi() { return udhetimi; }
}