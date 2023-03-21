package vue;

import java.awt.*;
import javax.swing.*;

public class FenetreEtat extends JFrame {

    private JTextField txtEtat;

    public FenetreEtat() {
        setTitle("Etat du coffre");
        setBounds(500, 500, 190, 130);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel labEtat = new JLabel("ETAT");
        contentPane.add(labEtat);
        txtEtat = new JTextField(15);
        contentPane.add(txtEtat);
        setVisible(true);
        afficherEtat("pas d'�tat");
    }

    public void afficherEtat(String etat) {
        txtEtat.setText(etat);
    }
}