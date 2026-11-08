import java.time.LocalDateTime;

public class Aeroplani extends Transporti {
    private String kompaniaFluturimit;

    public Aeroplani(String nisja, String destinacioni, LocalDateTime orariNisjes, String kompaniaFluturimit) {
        super("Aeroplan", nisja, destinacioni, orariNisjes);
        this.kompaniaFluturimit = kompaniaFluturimit;
    }

    public String getKompaniaFluturimit() {
        return kompaniaFluturimit;
    }

    public void setKompaniaFluturimit(String kompaniaFluturimit) {
        this.kompaniaFluturimit = kompaniaFluturimit;
    }
}

