package fr.amacz13.ensim.tpnote_poo;

public abstract class Empruntable {

    private boolean limitationPretAuxAgence = false;
    private boolean defectueux = false;

    public void declarerDefectueux() {
        this.defectueux = true;
    }

    public boolean isDefectueux() {
        return defectueux;
    }

    public boolean isLimitationPretAuxAgence() {
        return limitationPretAuxAgence;
    }

    public void setLimitationPretAuxAgence(boolean v) {
        this.limitationPretAuxAgence = v;
    }

}
