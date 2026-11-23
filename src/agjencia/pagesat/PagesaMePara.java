package agjencia.pagesat;

import agjencia.rezervimet.Rezervimi;

public class PagesaMePara extends Pagesa implements PagesaInterface {

    public PagesaMePara(String idPagesa, Rezervimi rezervimi,
                        double shuma, String statusiPageses) {

        super(idPagesa, rezervimi, shuma, statusiPageses);
    }

    @Override
    public void kryejPagesen(double shuma) {
        System.out.println("Pagesa u krye me para ne dore: " + shuma + " EUR");
    }
}