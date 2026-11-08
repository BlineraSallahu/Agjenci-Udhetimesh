public class HotelimeYje extends Hoteli {
    private int numriYjeve; // Veçori unike për këtë nënklasë

    public HotelimeYje(String emriHotelit, String lokacioni, double cmimiPerNate, boolean eshteIDisponueshem, int numriYjeve) {
        // super() dërgon të 4 parametrat fiks te konstruktori i klasës Hoteli
        super(emriHotelit, lokacioni, cmimiPerNate, eshteIDisponueshem);

        // Validim që yjet të jenë brenda kufijve logjikë
        if (numriYjeve < 1 || numriYjeve > 5) {
            throw new IllegalArgumentException("Numri i yjeve duhet të jetë midis 1 dhe 5!");
        }
        this.numriYjeve = numriYjeve;
    }

    public int getNumriYjeve() {
        return numriYjeve;
    }

    public void setNumriYjeve(int numriYjeve) {
        this.numriYjeve = numriYjeve;
    }
}
