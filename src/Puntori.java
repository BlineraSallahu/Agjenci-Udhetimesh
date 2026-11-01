public class Puntori {
    // Atributet private per te ruajtur te dhenat e stafit
    private String idPuntori;
    private String emri;
    private String pozita;

    // Konstruktori qe pranon vlerat dhe ben validimin e tyre
    public Puntori(String idPuntori, String emri, String pozita) {
        // Kontrollohet nese ndonjera nga fushat e detyrueshme eshte lene e zbrazet
        if (idPuntori == null || idPuntori.trim().isEmpty()) throw new IllegalArgumentException("ID e punetorit nuk mund te jete e zbrazet.");
        if (emri == null || emri.trim().isEmpty()) throw new IllegalArgumentException("Emri nuk mund të jete i zbrazet.");
        if (pozita == null || pozita.trim().isEmpty()) throw new IllegalArgumentException("Pozita nuk mund te jete e zbrazet.");

        // Inicializimi i atributeve me vlerat e pranuara
        this.idPuntori = idPuntori;
        this.emri = emri;
        this.pozita = pozita;
    }
}

