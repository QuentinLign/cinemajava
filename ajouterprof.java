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

public class ajouterprof {

	protected Shell shlAjouterUnProf;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ajouterprof window = new ajouterprof();
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
		shlAjouterUnProf.open();
		shlAjouterUnProf.layout();
		while (!shlAjouterUnProf.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAjouterUnProf = new Shell();
		shlAjouterUnProf.setSize(583, 642);
		shlAjouterUnProf.setText("Ajouter un prof");
		
		text = new Text(shlAjouterUnProf, SWT.BORDER);
		text.setBounds(161, 72, 200, 31);
		
		Label lblNom = new Label(shlAjouterUnProf, SWT.NONE);
		lblNom.setBounds(52, 75, 103, 25);
		lblNom.setText("Nom prof");
		
		Button btnlundi = new Button(shlAjouterUnProf, SWT.CHECK);
		btnlundi.setBounds(161, 201, 134, 25);
		btnlundi.setText("Lundi");
		
		Button btnmardi = new Button(shlAjouterUnProf, SWT.CHECK);
		btnmardi.setText("Mardi");
		btnmardi.setBounds(319, 201, 134, 25);
		
		Button btnmercredi = new Button(shlAjouterUnProf, SWT.CHECK);
		btnmercredi.setText("Mercredi");
		btnmercredi.setBounds(161, 232, 134, 25);
		
		Button btnjeudi = new Button(shlAjouterUnProf, SWT.CHECK);
		btnjeudi.setText("Jeudi");
		btnjeudi.setBounds(161, 259, 134, 25);
		
		Button btnvendredi = new Button(shlAjouterUnProf, SWT.CHECK);
		btnvendredi.setText("Vendredi");
		btnvendredi.setBounds(319, 232, 134, 25);
		
		Label lblNewLabel_1_1 = new Label(shlAjouterUnProf, SWT.NONE);
		lblNewLabel_1_1.setText("Jours");
		lblNewLabel_1_1.setBounds(52, 244, 81, 25);
		
		Combo DP = new Combo(shlAjouterUnProf, SWT.NONE);
		DP.setToolTipText("");
		DP.setItems(new String[] {"DP", "Externe"});
		DP.setBounds(161, 323, 200, 33);
		
		Label lblNewLabel_1_1_1 = new Label(shlAjouterUnProf, SWT.NONE);
		lblNewLabel_1_1_1.setText("R\u00E9gime");
		lblNewLabel_1_1_1.setBounds(52, 326, 81, 25);
		
		Label lblregimealimentaire = new Label(shlAjouterUnProf, SWT.NONE);
		lblregimealimentaire.setText("R\u00E9gime alimentaire");
		lblregimealimentaire.setBounds(52, 386, 170, 25);
		
		text_1 = new Text(shlAjouterUnProf, SWT.BORDER);
		text_1.setBounds(226, 383, 200, 31);
		
		Button btnNewButton = new Button(shlAjouterUnProf, SWT.NONE);
		btnNewButton.setBounds(164, 506, 178, 35);
		btnNewButton.setText("Ajouter");
		
		Combo cantine = new Combo(shlAjouterUnProf, SWT.NONE);
		cantine.setToolTipText("");
		cantine.setItems(new String[] {"OUI", "NON"});
		cantine.setBounds(161, 131, 200, 33);
		
		Label lblCantine = new Label(shlAjouterUnProf, SWT.NONE);
		lblCantine.setText("Cantine ?");
		lblCantine.setBounds(52, 139, 103, 25);

	}
}
