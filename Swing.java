package cinema;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Swing {
	// DECLARATION DES ATTRIBUTS
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing window = new Swing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		textField = new JTextField();
		textField.setBounds(128, 28, 86, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//ETUDIANTS :
		
		JLabel lbletudiant = new JLabel("Etudiants");
		lbletudiant.setBounds(65, 31, 76, 14);
		frame.getContentPane().add(lbletudiant);
		
		// - 10 ANS :
		
		JLabel lbldixans = new JLabel("-10 ans");
		lbldixans.setBounds(65, 68, 46, 14);
		frame.getContentPane().add(lbldixans);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 70, 90, 17);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		// NAVIGO :
		
		JLabel lblnavigo = new JLabel("Navigo");
		lblnavigo.setBounds(61, 110, 76, 14);
		frame.getContentPane().add(lblnavigo);

		textField_2 = new JTextField();
		textField_2.setBounds(128, 112, 87, 17);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		
		// PLEIN TARIFS :
		
		JLabel lblpleintarif = new JLabel("Plein tarif");
		lblpleintarif.setBounds(45, 158, 76, 14);
		frame.getContentPane().add(lblpleintarif);
				
		JTextField textArea_1 = new JTextField();
		textArea_1.setBounds(126, 157, 90, 17);
		frame.getContentPane().add(textArea_1);
		
		
		// RENITIALISE 
		JButton btnClear = new JButton("Effacer");
		
		btnClear.setBounds(312, 287, 89, 23);
		frame.getContentPane().add(btnClear);
		
		// CHOIX FILM :
		
		JComboBox<String> combofilm = new JComboBox<String>();
		combofilm.addItem("Film");
		combofilm.addItem("Split");
		combofilm.addItem("Oui Oui");
		combofilm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		combofilm.setBounds(125, 200, 91, 20);
		frame.getContentPane().add(combofilm);
		
		// ENVOYER LE FORMULAIRE :
		
		JButton btnSubmit = new JButton("Envoyer");
		
		//BOUTON D'ENVOI DU FORMULAIRE
		
		btnSubmit.setBackground(Color.GREEN);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBounds(65, 287, 89, 23);
		frame.getContentPane().add(btnSubmit);
		{
			JOptionPane.showMessageDialog(null, "Bienvenue");
			}
		
		btnSubmit.addActionListener(new ActionListener() {
			private JComboBox<String> comboBox;

			public void actionPerformed(ActionEvent arg0) {
				
				BDD bdd = new BDD();
				bdd.insert(textField.getText());
				
				
				comboBox = null;
				if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||(textArea_1.getText().isEmpty())||(comboBox.getSelectedItem().equals("Select")))
					JOptionPane.showMessageDialog(null, "Incomplet :(");
				else		
				JOptionPane.showMessageDialog(null, "Envoyer !");
			}
		});
		
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				textArea_1.setText(null);
				
				combofilm.setSelectedItem("Select");
				
				
			}
		});
		
	}
}
