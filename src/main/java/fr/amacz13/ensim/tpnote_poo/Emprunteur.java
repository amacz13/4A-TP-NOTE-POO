package fr.amacz13.ensim.tpnote_poo;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {

    public List<Empruntable> stock = new ArrayList<Empruntable>();

    public void ajouterAuStock(Empruntable e) {
        stock.add(e);
    }

    public List<Empruntable> listeMateriel() {
        return stock;
    }

    public boolean perdreMateriel(Empruntable e) {
        return stock.remove(e);
    }

}
