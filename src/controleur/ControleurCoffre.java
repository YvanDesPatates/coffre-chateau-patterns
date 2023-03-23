package controleur;

import model.I_CoffreChateau;

public class ControleurCoffre implements ControleurCoffreInterface {
    private I_CoffreChateau coffre;

    public ControleurCoffre(I_CoffreChateau coffre) {
        this.coffre = coffre;
    }

    @Override
    public void oterLivre() {
        coffre.oterLivre();
    }

    @Override
    public void remettreLivre() {
        coffre.remettreLivre();
    }

    @Override
    public void tournerChandelleVersDroite() {
        coffre.tournerChandelleVersDroite();
    }

    @Override
    public void tournerChandelleVersGauche() {
        coffre.tournerChandelleVersGauche();
    }

    @Override
    public void fermerCoffre() {
        coffre.fermerCoffre();
    }
}
