package agjencia.pagesat;

import agjencia.rezervimet.Rezervimi;

public class PagesaMeKarte extends Pagesa implements PagesaInterface {

    public PagesaMeKarte(String idPagesa, Rezervimi rezervimi,
                         double shuma, String statusiPageses) {

        super(idPagesa, rezervimi, shuma, statusiPageses);
    }

    @Override
    public void kryejPagesen(double shuma) {
        System.out.println("Pagesa u krye me kartele: " + shuma + " EUR");
    }
}