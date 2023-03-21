package etat_coffre;

import coffre.Coffre;

import java.util.Objects;

public class PresqueOuvert extends Visible{
    private static EtatCoffre instance;

    public static EtatCoffre getInstance(){
        if (Objects.isNull(instance)){
            instance = new PresqueOuvert();
        }
        return instance;
    }

    private PresqueOuvert() {
        super();
    }

    @Override
    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.setEtat(Ouvert.getInstance());
    }
}
