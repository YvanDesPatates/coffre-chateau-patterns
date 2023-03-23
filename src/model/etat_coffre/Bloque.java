package model.etat_coffre;

import java.util.Objects;

public class Bloque extends EtatCoffre{
    private static EtatCoffre instance;

    public static EtatCoffre getInstance(){
        if (Objects.isNull(instance)){
            instance = new Bloque();
        }
        return instance;
    }

    private Bloque() {
        super();
    }
}
