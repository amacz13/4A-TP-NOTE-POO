package fr.amacz13.ensim.tpnote_poo;

import java.util.ArrayList;
import java.util.List;

public class Administrateur extends Employe{

    public Administrateur(Agence a, Entreprise e){
        super(a,e);
    }

    public boolean attribuerMateriel(Empruntable e, Emprunteur f) {
        if (f instanceof Agence) {
            f.ajouterAuStock(e);
            Agence a = (Agence) f;
            if (a.getEntreprise().perdreMateriel(e)) {
                return true;
            } else return false;
        } else if (f instanceof Administrateur) {
            f.ajouterAuStock(e);
            Administrateur a = (Administrateur) f;
            if (a.getEntreprise().perdreMateriel(e)) {
                return true;
            } else return false;
        } else if (f instanceof Employe) {
            f.ajouterAuStock(e);
            Employe a = (Employe) f;
            if (e.isLimitationPretAuxAgence()) return false;
            if (a.getEntreprise().perdreMateriel(e)) {
                return true;
            } else return false;
        }
        return false;
    }

    public boolean recupererMateriel(Empruntable e, Emprunteur f){
        if (f instanceof Agence) {
            if (f.perdreMateriel(e)) {
                Agence a = (Agence) f;
                //a.getEntreprise().ajouterAuStock(e);
                this.ajouterAuStock(e);
                return true;
            } else return false;
        } else if (f instanceof Employe) {
            if (f.perdreMateriel(e)) {
                Employe a = (Employe) f;
                //a.getEntreprise().ajouterAuStock(e);
                this.ajouterAuStock(e);
                return true;
            } else return false;
        }
        return false;
    }

    public List<Empruntable> stockEntreprise() {
        ArrayList<Empruntable> list = new ArrayList<Empruntable>();
        list.addAll(this.getEntreprise().listeMateriel());
        for (Agence a : this.getEntreprise().getAgences()) {
            list.addAll(a.listeMateriel());
        }
        return list;
    }

    public List<Empruntable> stockAgence() {
        ArrayList<Empruntable> list = new ArrayList<Empruntable>();
        list.addAll(this.getAgence().listeMateriel());
        for (Employe e : this.getAgence().getEmployes()) {
            list.addAll(e.listeMateriel());
        }
        return list;
    }

    public void transfererMateriel(Emprunteur e, Empruntable f, Emprunteur g) {
        if (!(g instanceof Employe && f.isLimitationPretAuxAgence())) {
            if (e.perdreMateriel(f)) g.ajouterAuStock(f);
        }
    }

    public void supprimerMateriel(Empruntable e) {
        this.perdreMateriel(e);
    }

    public void supprimerMaterielDefectueuxEntreprise() {
        supprimerMaterielDefectueuxDe(this.getEntreprise());
    }

    public void supprimerMaterielDefectueuxAgence(Agence a) {
        supprimerMaterielDefectueuxDe(a);
    }

    private void supprimerMaterielDefectueuxDe(Emprunteur e) {
        ArrayList<Empruntable> list = new ArrayList<Empruntable>();
        for (Empruntable a : e.listeMateriel()) {
            if (a.isDefectueux()) list.add(a);
        }
        for (Empruntable a :list) { e.perdreMateriel(a);}
    }
}
