package coffre;

import etat_coffre.CacheParBibliotheque;
import etat_coffre.EtatCoffre;

public class Coffre implements I_CoffreChateau{
    private boolean chienLibre = false;
    private boolean lapinLibre = false;
    private EtatCoffre etat = CacheParBibliotheque.getInstance();

    @Override
    public void oterLivre() {
        etat.oterLivre(this);
    }

    @Override
    public void remettreLivre() {
        etat.remettreLivre(this);
    }

    @Override
    public void tournerChandelleVersDroite() {
        etat.tournerChandelleVersDroite(this);
    }

    @Override
    public void tournerChandelleVersGauche() {
        etat.tournerChandelleVersGauche(this);
    }

    @Override
    public void fermerCoffre() {
        etat.fermerCoffre(this);
    }

    @Override
    public boolean lapinEstLibere() {
        return lapinLibre;
    }

    @Override
    public boolean chienEstLibere() {
        return chienLibre;
    }

    @Override
    public String nomEtat() {
        return etat.getClass().getSimpleName();
    }

    public void libererLapinTueur(){
        this.lapinLibre = true;
    }

    public void libererChienGentil() {
        this.chienLibre = true;
    }

    public void recupererChienGentil() {
        this.chienLibre = false;
    }

    public void setEtat(EtatCoffre etat) {
        this.etat = etat;
    }
}
