import fr.amacz13.ensim.tpnote_poo.Administrateur;
import fr.amacz13.ensim.tpnote_poo.Agence;
import fr.amacz13.ensim.tpnote_poo.Entreprise;
import fr.amacz13.ensim.tpnote_poo.fr.amacz13.ensim.tpnote_poo.empruntable.UC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComparatorTest {
    Entreprise e = new Entreprise("Tutu");
    Agence a1 = new Agence("La plage");
    Agence a2 = new Agence("La montagne");
    Administrateur admin = new Administrateur(a1,e);
    UC u1 = new UC();
    UC u2 = new UC();
    UC u3 = new UC();
    UC u4 = new UC();

    @Before
    public void setUp() {
        u1.declarerDefectueux();
        u2.declarerDefectueux();
        u3.declarerDefectueux();
        a1.listeMateriel().add(u1);
        a1.listeMateriel().add(u2);
        a2.listeMateriel().add(u3);
        a2.listeMateriel().add(u4);
    }

    @Test
    public void comparaison() {
        Assert.assertEquals("Comparaison: fail", 1, a1.compareTo(a2));
    }
}
