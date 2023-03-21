package etat_coffre;

import coffre.Coffre;

import java.util.Objects;

public class Ouvert extends EtatCoffre{
    private static EtatCoffre instance;

    public static EtatCoffre getInstance(){
        if (Objects.isNull(instance)){
            instance = new Ouvert();
        }
        return instance;
    }

    private Ouvert() {
        super();
    }

    @Override
    public void fermerCoffre(Coffre coffre) {
        coffre.setEtat(Ferme.getInstance());
    }
}