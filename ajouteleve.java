package interfacej;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ajouteleve { //Classe ajouteleve
//Variables
	protected Shell shlAjouterUnEleve; 
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ajouteleve window = new ajouteleve();
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
		shlAjouterUnEleve.open();
		shlAjouterUnEleve.layout();
		while (!shlAjouterUnEleve.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAjouterUnEleve = new Shell();
		shlAjouterUnEleve.setSize(583, 642);
		shlAjouterUnEleve.setText("Ajouter un eleve");
		
		text = new Text(shlAjouterUnEleve, SWT.BORDER);
		text.setBounds(161, 72, 200, 31);
		
		Label lblNom = new Label(shlAjouterUnEleve, SWT.NONE);
		lblNom.setBounds(52, 75, 103, 25);
		lblNom.setText("Nom \u00E9l\u00E8ve");
		
		Combo classe = new Combo(shlAjouterUnEleve, SWT.NONE);
		classe.setItems(new String[] {"Terminale 1", "SIO SLAM", "SIO SISR", "Premi\u00E8re 3", "Terminale STI2D"});
		classe.setToolTipText("");
		classe.setBounds(161, 195, 200, 33);
		
		Label lblNewLabel_1 = new Label(shlAjouterUnEleve, SWT.NONE);
		lblNewLabel_1.setText("Classe");
		lblNewLabel_1.setBounds(52, 198, 81, 25);
		
		Button btnlundi = new Button(shlAjouterUnEleve, SWT.CHECK);
		btnlundi.setBounds(161, 259, 134, 25);
		btnlundi.setText("Lundi");
		
		Button btnmardi = new Button(shlAjouterUnEleve, SWT.CHECK);
		btnmardi.setText("Mardi");
		btnmardi.setBounds(319, 259, 134, 25);
		
		Button btnmercredi = new Button(shlAjouterUnEleve, SWT.CHECK);
		btnmercredi.setText("Mercredi");
		btnmercredi.setBounds(161, 290, 134, 25);
		
		Button btnjeudi = new Button(shlAjouterUnEleve, SWT.CHECK);
		btnjeudi.setText("Jeudi");
		btnjeudi.setBounds(161, 321, 134, 25);
		
		Button btnvendredi = new Button(shlAjouterUnEleve, SWT.CHECK);
		btnvendredi.setText("Vendredi");
		btnvendredi.setBounds(319, 290, 134, 25);
		
		Label lblNewLabel_1_1 = new Label(shlAjouterUnEleve, SWT.NONE);
		lblNewLabel_1_1.setText("Jours");
		lblNewLabel_1_1.setBounds(52, 290, 81, 25);
		
		Combo DP = new Combo(shlAjouterUnEleve, SWT.NONE);
		DP.setToolTipText("");
		DP.setItems(new String[] {"DP", "Externe"});
		DP.setBounds(161, 374, 200, 33);
		
		Label lblNewLabel_1_1_1 = new Label(shlAjouterUnEleve, SWT.NONE);
		lblNewLabel_1_1_1.setText("R\u00E9gime");
		lblNewLabel_1_1_1.setBounds(52, 377, 81, 25);
		
		Label lblregimealimentaire = new Label(shlAjouterUnEleve, SWT.NONE);
		lblregimealimentaire.setText("R\u00E9gime alimentaire");
		lblregimealimentaire.setBounds(54, 433, 170, 25);
		
		text_1 = new Text(shlAjouterUnEleve, SWT.BORDER);
		text_1.setBounds(230, 430, 200, 31);
		
		Button btnNewButton = new Button(shlAjouterUnEleve, SWT.NONE);
		btnNewButton.setBounds(164, 506, 178, 35);
		btnNewButton.setText("Ajouter");
		
		Combo cantine = new Combo(shlAjouterUnEleve, SWT.NONE);
		cantine.setToolTipText("");
		cantine.setItems(new String[] {"OUI", "NON"});
		cantine.setBounds(161, 131, 200, 33);
		
		Label lblCantine = new Label(shlAjouterUnEleve, SWT.NONE);
		lblCantine.setText("Cantine ?");
		lblCantine.setBounds(52, 139, 103, 25);

	}
}
