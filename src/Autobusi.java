import java.time.LocalDateTime;

public class Autobusi extends Transporti {
    private int numriUleseve; // Emërtimi i saktë në gjuhën shqipe

    public Autobusi(String nisja, String destinacioni, LocalDateTime orariNisjes, int numriUleseve) {
        super("Autobus", nisja, destinacioni, orariNisjes);
        this.numriUleseve = numriUleseve;
    }

    public int getNumriUleseve() {
        return numriUleseve;
    }

    public void setNumriUleseve(int numriUleseve) {
        this.numriUleseve = numriUleseve;
    }
}
