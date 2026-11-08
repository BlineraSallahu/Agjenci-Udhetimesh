public class ResortiAllInclusive extends Hoteli {
    private boolean kaPlazhPrivat; // Veçori unike për resortet

    public ResortiAllInclusive(String emriHotelit, String lokacioni, double cmimiPerNate, boolean eshteIDisponueshem, boolean kaPlazhPrivat) {
        // Kalon të gjitha të dhënat e kërkuara te klasa bazë Hoteli
        super(emriHotelit, lokacioni, cmimiPerNate, eshteIDisponueshem);
        this.kaPlazhPrivat = kaPlazhPrivat;
    }

    public boolean isKaPlazhPrivat() {
        return kaPlazhPrivat;
    }

    public void setKaPlazhPrivat(boolean kaPlazhPrivat) {
        this.kaPlazhPrivat = kaPlazhPrivat;
    }
}
