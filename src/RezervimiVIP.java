public class RezervimiVIP extends Rezervimi {
    private double zbritjaProcent;

    public RezervimiVIP(String idRezervimi, Klienti klienti, Udhetimi udhetimi, String statusi, double zbritjaProcent) {
        super(idRezervimi, klienti, udhetimi, statusi);

        if (zbritjaProcent < 0 || zbritjaProcent > 100) {
            throw new IllegalArgumentException("Zbritja duhet të jetë mes 0 dhe 100.");
        }
        this.zbritjaProcent = zbritjaProcent;
    }

    public double getZbritjaProcent() { return zbritjaProcent; }
}