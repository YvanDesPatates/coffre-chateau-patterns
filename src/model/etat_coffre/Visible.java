package model.etat_coffre;

import model.Coffre;

public abstract class Visible extends EtatCoffre{

    @Override
    public void remettreLivre(Coffre coffre) {
        coffre.recupererChienGentil();
        coffre.setEtat(CacheParBibliotheque.getInstance());
    }

    @Override
    public boolean peutRemettreLivre() {
        return true;
    }

    @Override
    public boolean peutTournerChandelleGauche() {
        return true;
    }

    @Override
    public boolean peutTournerChandelleDroite() {
        return true;
    }

    @Override
    public void tournerChandelleVersGauche(Coffre coffre) {
        coffre.libererLapinTueur();
        coffre.setEtat(Bloque.getInstance());
    }
}
