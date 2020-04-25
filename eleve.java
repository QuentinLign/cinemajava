package interfacej;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class eleve { //Classe eleve
//Variables
	protected Shell shlEspaceAdmin;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			eleve window = new eleve();
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
		shlEspaceAdmin.open();
		shlEspaceAdmin.layout();
		while (!shlEspaceAdmin.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlEspaceAdmin = new Shell();
		shlEspaceAdmin.setEnabled(false);
		shlEspaceAdmin.setSize(1145, 747);
		shlEspaceAdmin.setText("Espace eleve");
		
		table = new Table(shlEspaceAdmin, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 44, 1103, 546);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNomlve = new TableColumn(table, SWT.NONE); //Table nom eleve
		tblclmnNomlve.setWidth(130);
		tblclmnNomlve.setText("Nom \u00E9l\u00E8ve");
		
		TableColumn tblclmnClasse = new TableColumn(table, SWT.NONE); //Table classe
		tblclmnClasse.setWidth(100);
		tblclmnClasse.setText("Classe");
		
		TableColumn tblclmnJours = new TableColumn(table, SWT.NONE); //Table jours
		tblclmnJours.setWidth(87);
		tblclmnJours.setText("Cantine ?");
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE); 
		tblclmnNewColumn.setWidth(327);
		tblclmnNewColumn.setText("Jours a la cantine");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(120);
		tblclmnNewColumn_1.setText("DP / Externe");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(165);
		tblclmnNewColumn_2.setText("Regime alimentaire");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(164);
		tblclmnNewColumn_3.setText("Somme mensuelle");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] {"LIGNANI", "SIO SLAM1", "OUI", "Lundi,Mardi,Mercredi", "DP", "Vegan", "58"});
		
		Button btnNewButton = new Button(shlEspaceAdmin, SWT.NONE);
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnNewButton.setBounds(10, 3, 255, 35);
		btnNewButton.setText("Trier par ordre alphab\u00E9tique");
		
		Button btnTrierParClasse = new Button(shlEspaceAdmin, SWT.NONE); //Table trier les données par classe
		btnTrierParClasse.setText("Trier par classe");
		btnTrierParClasse.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnTrierParClasse.setBounds(302, 3, 255, 35);
		
		Button btnAjouterUnlve = new Button(shlEspaceAdmin, SWT.NONE); //Bouton pour ajouter un élève
		btnAjouterUnlve.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		btnAjouterUnlve.setBounds(109, 619, 167, 35);
		btnAjouterUnlve.setText("Ajouter un \u00E9l\u00E8ve");
		
		Button btnModifierUnlve = new Button(shlEspaceAdmin, SWT.NONE); //Bouton pour modifier un élève
		btnModifierUnlve.setForeground(SWTResourceManager.getColor(255, 165, 0));
		btnModifierUnlve.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnModifierUnlve.setText("Modifier un \u00E9l\u00E8ve");
		btnModifierUnlve.setBounds(453, 619, 167, 35);
		
		
		Button btnAjouterUnlve_1_1 = new Button(shlEspaceAdmin, SWT.NONE);
		btnAjouterUnlve_1_1.setForeground(SWTResourceManager.getColor(220, 20, 60));
		btnAjouterUnlve_1_1.setText("Supprimer un \u00E9l\u00E8ve");
		btnAjouterUnlve_1_1.setBounds(806, 619, 167, 35);

	}

}
