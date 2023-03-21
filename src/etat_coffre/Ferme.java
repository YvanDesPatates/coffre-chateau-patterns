package etat_coffre;

import coffre.Coffre;

import java.util.Objects;

public class Ferme extends Visible{
    private static EtatCoffre instance;

    public static EtatCoffre getInstance(){
        if (Objects.isNull(instance)){
            instance = new Ferme();
        }
        return instance;
    }

    private Ferme() {
        super();
    }
    @Override
    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.libererChienGentil();
        coffre.setEtat(PresqueOuvert.getInstance());
    }
}
