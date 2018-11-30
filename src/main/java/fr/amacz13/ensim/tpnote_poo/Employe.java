package fr.amacz13.ensim.tpnote_poo;

public class Employe extends Emprunteur {

    private Agence agence;
    private Entreprise entreprise;

    public Employe(Agence a, Entreprise e) {
        this.agence = a;
        this.entreprise = e;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public Agence getAgence() {
        return agence;
    }

}
