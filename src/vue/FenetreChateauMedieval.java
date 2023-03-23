package vue;

import controleur.ControleurCoffreInterface;
import model.Coffre;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FenetreChateauMedieval extends JFrame implements ActionListener,
        WindowListener, Observateur{

    private JButton btOterLivre;
    private JButton btRemettreLivre;
    private JButton btTournerGauche;
    private JButton btTournerDroite;
    private JButton btFermerCoffre;
    private JButton btQuitter;

    private ControleurCoffreInterface controleurCoffre;


    public FenetreChateauMedieval(ControleurCoffreInterface controleurCoffre) {
        this.controleurCoffre = controleurCoffre;

        setTitle("exercice Chateau Médiéval (F02)");
        setBounds(500, 100, 400, 200);
        JPanel panBibliotheque = new JPanel();
        JPanel panCentre = new JPanel();
        JPanel panChandelle = new JPanel();
        JPanel panCoffre = new JPanel();
        JPanel panQuitter = new JPanel();
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        btOterLivre = new JButton("Oter livre UML");
        btRemettreLivre = new JButton("Remettre livre UML");
        btTournerGauche = new JButton("Tourner chandelle gauche");
        btTournerDroite = new JButton("Tourner chandelle droite");
        btFermerCoffre = new JButton("Fermer Coffre");
        btQuitter = new JButton("Quitter");
        panBibliotheque.add(btOterLivre);
        panBibliotheque.add(btRemettreLivre);
        panChandelle.add(btTournerGauche);
        panChandelle.add(btTournerDroite);
        panCoffre.add(btFermerCoffre);
        panQuitter.add(btQuitter);

        panCentre.add(panChandelle, "North");
        panCentre.add(panCoffre, "South");
        contentPane.add(panBibliotheque, "North");
        contentPane.add(panCentre);
        contentPane.add(panQuitter, "South");

        btOterLivre.addActionListener(this);
        btRemettreLivre.addActionListener(this);
        btTournerGauche.addActionListener(this);
        btTournerDroite.addActionListener(this);
        btFermerCoffre.addActionListener(this);
        btQuitter.addActionListener(this);

        addWindowListener(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btOterLivre)
            controleurCoffre.oterLivre();
        if (e.getSource() == btRemettreLivre)
            controleurCoffre.remettreLivre();
        if (e.getSource() == btTournerGauche)
            controleurCoffre.tournerChandelleVersGauche();
        if (e.getSource() == btTournerDroite)
            controleurCoffre.tournerChandelleVersDroite();
        if (e.getSource() == btFermerCoffre)
            controleurCoffre.fermerCoffre();
        if (e.getSource() == btQuitter) {
            System.exit(0);
        }
    }

    public void windowClosing(WindowEvent arg0) {
        System.out.println("terminer");
        System.exit(0);
    }

    public void windowActivated(WindowEvent arg0) {
    }

    public void windowClosed(WindowEvent arg0) {
    }

    public void windowDeactivated(WindowEvent arg0) {
    }

    public void windowDeiconified(WindowEvent arg0) {
    }

    public void windowIconified(WindowEvent arg0) {
    }

    public void windowOpened(WindowEvent arg0) {
    }

		

	private void afficherBtChandelle()
		{
			btTournerDroite.setVisible(true);
			btTournerGauche.setVisible(true);
		}

		private void cacherBtChandelle()
		{
			btTournerDroite.setVisible(false);
			btTournerGauche.setVisible(false);
		}

		private void afficherBtFermerCoffre()
		{
			btFermerCoffre.setVisible(true);
		}

		private void cacherBtFermerCoffre()
		{
			btFermerCoffre.setVisible(false);
		}

		private void afficherBtOterLivre()
		{
			btOterLivre.setVisible(true);
		}

		private void cacherBtOterLivre()
		{
			btOterLivre.setVisible(false);
		}

		private void afficherBtRemettreLivre()
		{
			btRemettreLivre.setVisible(true);
		}

		private void cacherBtRemettreLivre()
		{
			btRemettreLivre.setVisible(false);
		}


    @Override
    public void notifier(Coffre coffre) {
        cacherBtOterLivre();
        if (coffre.peutOterLivreUML()){
            afficherBtOterLivre();
        }
        cacherBtRemettreLivre();
        if (coffre.peutRemettreLivreUML()){
            afficherBtRemettreLivre();
        }
        cacherBtFermerCoffre();
        if (coffre.peutFermerCoffre()){
            afficherBtFermerCoffre();
        }
        cacherBtChandelle();
        if (coffre.peutTournerChandelleDroite() && coffre.peutTournerChandelleGauche()){
            afficherBtChandelle();
        }
    }
}

	


