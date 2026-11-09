public class RezervimiStandard extends Rezervimi {
    private boolean kaPaketeUshqimi;

    public RezervimiStandard(String idRezervimi, Klienti klienti, Udhetimi udhetimi, String statusi, boolean kaPaketeUshqimi) {
        super(idRezervimi, klienti, udhetimi, statusi);
        this.kaPaketeUshqimi = kaPaketeUshqimi;
    }

    public boolean isKaPaketeUshqimi() { return kaPaketeUshqimi; }
}