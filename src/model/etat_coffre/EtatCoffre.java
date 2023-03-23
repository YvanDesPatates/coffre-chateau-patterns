package model.etat_coffre;

import model.Coffre;

public abstract class EtatCoffre {

    public void oterLivre(Coffre coffre) {

    }

    public void remettreLivre(Coffre coffre) {

    }

    public void tournerChandelleVersDroite(Coffre coffre) {

    }

    public void tournerChandelleVersGauche(Coffre coffre) {

    }

    public void fermerCoffre(Coffre coffre) {

    }

    public boolean peutOterLivre(){
        return false;
    }
    public boolean peutRemettreLivre(){
        return false;
    }
    public boolean peutTournerChandelleGauche(){
        return false;
    }
    public boolean peutTournerChandelleDroite(){
        return false;
    }
    public boolean peutFermerCoffre(){
        return false;
    }
}
