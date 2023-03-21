package etat_coffre;

import coffre.Coffre;

public abstract class Visible extends EtatCoffre{

    @Override
    public void remettreLivre(Coffre coffre) {
        coffre.recupererChienGentil();
        coffre.setEtat(CacheParBibliotheque.getInstance());
    }

    @Override
    public void tournerChandelleVersGauche(Coffre coffre) {
        coffre.libererLapinTueur();
        coffre.setEtat(Bloque.getInstance());
    }
}
