package vue;

import model.Coffre;

public interface Observateur {
    public void notifier(Coffre coffre);
}
