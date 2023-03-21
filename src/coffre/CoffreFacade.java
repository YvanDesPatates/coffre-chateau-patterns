package coffre;

public class CoffreFacade implements I_CoffreChateau{
    private I_CoffreChateau coffre;

    public CoffreFacade() {
        coffre = new Coffre();
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

    @Override
    public boolean lapinEstLibere() {
        return coffre.lapinEstLibere();
    }

    @Override
    public boolean chienEstLibere() {
        return coffre.chienEstLibere();
    }

    @Override
    public String nomEtat() {
        return coffre.nomEtat();
    }
}
