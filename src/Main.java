import coffre.Coffre;
import coffre.CoffreFacade;
import vue.FenetreChateauMedieval;
import vue.FenetreChienGentil;
import vue.FenetreEtat;
import vue.FenetreLapinTueur;

public class Main {
    public static void main(String[] args) {
        Coffre coffre = new Coffre();
        coffre.addObservateur(new FenetreChateauMedieval(new CoffreFacade(coffre)));
        coffre.addObservateur(new FenetreLapinTueur());
        coffre.addObservateur(new FenetreChienGentil());
        coffre.addObservateur(new FenetreEtat());
    }
}
