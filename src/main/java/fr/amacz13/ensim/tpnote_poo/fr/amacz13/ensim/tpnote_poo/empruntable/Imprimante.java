package fr.amacz13.ensim.tpnote_poo.fr.amacz13.ensim.tpnote_poo.empruntable;

import fr.amacz13.ensim.tpnote_poo.Empruntable;

public class Imprimante extends Empruntable {

    public Imprimante(boolean b) {
        this.setLimitationPretAuxAgence(b);
    }

}
