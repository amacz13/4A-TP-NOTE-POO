package fr.amacz13.ensim.tpnote_poo;

import java.util.ArrayList;
import java.util.List;

public class Entreprise extends Emprunteur {

    private List<Agence> agences = new ArrayList<Agence>();

    private List<Employe> employes = new ArrayList<Employe>();

    private String nomEntreprise;

    public Entreprise(String name) {
        this.nomEntreprise = name;
    }

    public List<Agence> getAgences() {
        return agences;
    }

}
