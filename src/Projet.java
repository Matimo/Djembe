import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javax.swing.UIManager;

public class Projet extends Projet2 {

	
	// Matimo d�veloppe en JAVA

	JMenuBar menubar;
	JMenu fichiers_menu;
	JMenuItem ouvrir_image_item, quitter_item;
	JMenu edit_menu;
	JMenuItem new_edit_item, ouvrir_edit_item;

	

	COMListener serialport = null;

	public Projet() {
		super();

	
		// Cr�ation de la fen�tre

		JFrame frame = new JFrame();
		JFrame frame2 = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(2000, 2000);

		// R�cup�ration de l'int�rieure de la fen�tre
		// avec style de placement des composants
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.setLayout(null);
		// on commente pour tester EGIT

	

		// Afficher la fen�tre
		frame.setVisible(true);

	
			

	}

	public static void main(String[] args) {
		new Projet();

	}

	public void OuvrirFichier() {

		while (true) {

		
			// lecture du port s�rie

			
			// interpretation du message

			// lancement de la fonction Play()
			
			
		}

	}

}
