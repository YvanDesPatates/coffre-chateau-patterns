package vue;

import coffre.Coffre;

public interface Observateur {
    public void notifier(Coffre coffre);
}
