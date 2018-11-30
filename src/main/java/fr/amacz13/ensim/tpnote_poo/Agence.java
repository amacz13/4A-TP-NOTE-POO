package fr.amacz13.ensim.tpnote_poo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agence extends Emprunteur implements Comparable<Agence> {

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

    public int compareTo(Agence o) {
        int myDefect = 0, otherDefect = 0;
        for (Empruntable e : this.listeMateriel()) if (e.isDefectueux()) myDefect ++;
        for (Empruntable e : o.listeMateriel()) if (e.isDefectueux()) otherDefect ++;
        return myDefect - otherDefect;
    }
}
