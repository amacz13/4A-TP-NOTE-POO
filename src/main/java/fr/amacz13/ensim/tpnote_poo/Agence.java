package fr.amacz13.ensim.tpnote_poo;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Emprunteur {

    private List<Employe> employes = new ArrayList<Employe>();
    private String nom;
    private Entreprise entreprise;

    public Agence(String n) {
        super();
        this.nom = n;
    }

    public void setEntreprise(Entreprise e) {
        entreprise = e;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

}
