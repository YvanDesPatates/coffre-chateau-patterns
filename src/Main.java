import controleur.ControleurCoffre;
import controleur.ControleurCoffreInterface;
import model.Coffre;
import model.CoffreFacade;
import vue.FenetreChateauMedieval;
import vue.FenetreChienGentil;
import vue.FenetreEtat;
import vue.FenetreLapinTueur;

public class Main {
    public static void main(String[] args) {
        Coffre coffre = new Coffre();
        ControleurCoffreInterface controleurCoffre = new ControleurCoffre(coffre);
        coffre.addObservateur(new FenetreChateauMedieval(controleurCoffre));
        coffre.addObservateur(new FenetreLapinTueur());
        coffre.addObservateur(new FenetreChienGentil());
        coffre.addObservateur(new FenetreEtat());
    }
}
