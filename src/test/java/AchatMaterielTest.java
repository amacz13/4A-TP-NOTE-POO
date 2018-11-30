import fr.amacz13.ensim.tpnote_poo.Administrateur;
import fr.amacz13.ensim.tpnote_poo.Agence;
import fr.amacz13.ensim.tpnote_poo.Entreprise;
import fr.amacz13.ensim.tpnote_poo.fr.amacz13.ensim.tpnote_poo.empruntable.UC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AchatMaterielTest {

    Entreprise e = new Entreprise("Tutu");
    Agence a = new Agence("La plage");
    Administrateur admin = new Administrateur(a,e);
    UC u = new UC();

    @Before
    public void setUp() {
        e.getAgences().add(a);
    }

    @Test
    public void achatMateriel() {
        admin.achatMateriel(u);
        int nb = admin.getEntreprise().listeMateriel().size();
        Assert.assertEquals("ajouterAuStock: fail", 1, nb);
    }
}
