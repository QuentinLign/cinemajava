package interfacej;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;

public class connexion { //Classe connexion
//Variables
	protected Shell shlSconnexion;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			connexion window = new connexion();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSconnexion.open();
		shlSconnexion.layout();
		while (!shlSconnexion.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window. Formulaire de connexion
	 */
	protected void createContents() {
		shlSconnexion = new Shell();
		shlSconnexion.setSize(552, 391);
		shlSconnexion.setText("Connexion");
		
		text = new Text(shlSconnexion, SWT.BORDER);
		text.setBounds(178, 74, 224, 31);
		
		Label lblNewLabel = new Label(shlSconnexion, SWT.NONE);
		lblNewLabel.setBounds(48, 77, 101, 25);
		lblNewLabel.setText("Identifiant"); //Identifiant de l'utilisateur
		
		Label lblMotDePasse = new Label(shlSconnexion, SWT.NONE);
		lblMotDePasse.setText("Mot de passe"); //Mot de passe de l'utilisateur
		lblMotDePasse.setBounds(48, 145, 120, 25);
		
		text_1 = new Text(shlSconnexion, SWT.BORDER);
		text_1.setBounds(178, 139, 224, 31);
		
		Button btnConnexion = new Button(shlSconnexion, SWT.NONE);
		btnConnexion.setBounds(145, 212, 105, 35);
		btnConnexion.setText("Connexion");
		
	


	}
}

