public class Klienti {
    // Atributet private per enkapsulimin e te dhenave
    private String idKlienti;
    private String emri;
    private String mbiemri;
    private String email;

    // Konstruktori me validim
    public Klienti(String idKlienti, String emri, String mbiemri, String email) {
        // Kontrollohet nese fushat per tekst jane te zbrazeta
        if (idKlienti == null || idKlienti.trim().isEmpty()) throw new IllegalArgumentException("ID nuk mund të jetë e zbrazet.");
        if (emri == null || emri.trim().isEmpty()) throw new IllegalArgumentException("Emri nuk mund te jete i zbrazet.");
        if (mbiemri == null || mbiemri.trim().isEmpty()) throw new IllegalArgumentException("Mbiemri nuk mund te jetë i zbrazet.");

        // Kontrolli i formatit baze te email-it
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("Email-i nuk është valid.");

        // Inicializimi i vlerave
        this.idKlienti = idKlienti;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.email = email;
    }
}


