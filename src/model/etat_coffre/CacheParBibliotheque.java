package model.etat_coffre;

import model.Coffre;

import java.util.Objects;

public class CacheParBibliotheque extends EtatCoffre{
    private static EtatCoffre instance;

    public static EtatCoffre getInstance(){
        if (Objects.isNull(instance)){
            instance = new CacheParBibliotheque();
        }
        return instance;
    }

    private CacheParBibliotheque() {
        super();
    }
    @Override
    public void oterLivre(Coffre coffre) {
        coffre.setEtat(Ferme.getInstance());
    }

    @Override
    public boolean peutOterLivre() {
        return true;
    }
}
