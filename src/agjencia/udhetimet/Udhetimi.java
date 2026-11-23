package agjencia.udhetimet;

import agjencia.hotelet.Hoteli;
import agjencia.transportet.Transporti;

import java.time.LocalDate;
// Klasa abstrakte qe perfaqeson nje udhetim ne agjenci
public abstract class Udhetimi {
    protected String idUdhetimi;
    protected String destinacioni;
    protected LocalDate dataNisjes;
    protected double cmimi;
    protected int maxPersona;

    protected Hoteli hoteli;
    protected Transporti transporti;

    public Udhetimi(String idUdhetimi, String destinacioni, LocalDate dataNisjes, double cmimi, int maxPersona, Hoteli hoteli, Transporti transporti) {
        if (idUdhetimi == null || idUdhetimi.trim().isEmpty()) throw new IllegalArgumentException("ID nuk mund te jete e zbrazet.");
        if (destinacioni == null || destinacioni.trim().isEmpty()) throw new IllegalArgumentException("Destinacioni nuk mund te jetë i zbrazet.");
        if (dataNisjes == null || dataNisjes.isBefore(LocalDate.now())) throw new IllegalArgumentException("Data nuk mund te jete ne te kaluaren.");
        if (cmimi <= 0) throw new IllegalArgumentException("Çmimi duhet te jete mbi 0.");
        if (maxPersona <= 0) throw new IllegalArgumentException("Numri i personave duhet të jetë mbi 0.");
        if (hoteli == null) throw new IllegalArgumentException("Duhet te caktohet nje hotel.");
        if (transporti == null) throw new IllegalArgumentException("Duhet te caktohet transporti.");

        this.idUdhetimi = idUdhetimi;
        this.destinacioni = destinacioni;
        this.dataNisjes = dataNisjes;
        this.cmimi = cmimi;
        this.maxPersona = maxPersona;
        this.hoteli = hoteli;
        this.transporti = transporti;
    }

    public abstract double llogaritCmiminTotal();

    public String getIdUdhetimi() { return idUdhetimi; }
    public String getDestinacioni() { return destinacioni; }
    public LocalDate getDataNisjes() { return dataNisjes; }
    public double getCmimi() { return cmimi; }
    public int getMaxPersona() { return maxPersona; }
    public Hoteli getHoteli() { return hoteli; }
    public Transporti getTransporti() { return transporti; }
}