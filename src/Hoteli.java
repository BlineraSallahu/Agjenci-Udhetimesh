public class Hoteli {
    // Atributet e hotelit per akomodim
    private String emriHotelit;
    private String lokacioni;
    private double cmimiPerNate;
    private boolean eshteiDisponueshem; // Tregon nese ka dhoma të lira (true/false)

    public Hoteli(String emriHotelit, String lokacioni, double cmimiPerNate, boolean eshteiDisponueshem) {
        // Validimi i teksteve qe te mos jene te zbrazeta
        if (emriHotelit == null || emriHotelit.trim().isEmpty()) throw new IllegalArgumentException("Emri i hotelit nuk mund te jete i zbrazet.");
        if (lokacioni == null || lokacioni.trim().isEmpty()) throw new IllegalArgumentException("Lokacioni nuk mund te jete i zbrazet.");

        // Kontrolli që çmimi të jetë logjik (mbi 0)
        if (cmimiPerNate <= 0) throw new IllegalArgumentException("Çmimi per nate duhet te jetë me i madh se 0.");

        this.emriHotelit = emriHotelit;
        this.lokacioni = lokacioni;
        this.cmimiPerNate = cmimiPerNate;
        this.eshteiDisponueshem = eshteiDisponueshem;
    }
}

