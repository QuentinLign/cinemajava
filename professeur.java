package interfacej;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.TableItem;

public class professeur {

	protected Shell shlEspaceProfesseur;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			professeur window = new professeur();
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
		shlEspaceProfesseur.open();
		shlEspaceProfesseur.layout();
		while (!shlEspaceProfesseur.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlEspaceProfesseur = new Shell();
		shlEspaceProfesseur.setSize(1167, 782);
		shlEspaceProfesseur.setText("Espace professeur");
		
		table = new Table(shlEspaceProfesseur, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 65, 1125, 577);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(187);
		tblclmnNewColumn.setText("Nom");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Cantine ?");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(303);
		tblclmnNewColumn_2.setText("Jours");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(127);
		tblclmnNewColumn_3.setText("DP / Externe");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_4.setWidth(253);
		tblclmnNewColumn_4.setText("regime alimentaire");
		
		TableColumn tblclmnSomme = new TableColumn(table, SWT.NONE);
		tblclmnSomme.setWidth(130);
		tblclmnSomme.setText("Somme");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] {"Ambert", "O", "Lundi,Jeudi,Vendredi", "DP", "Aucun", "53"});
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] {"Manel", "N", "/", "Externe", "Pas de viandes", "0"});
		
		Button btnNewButton = new Button(shlEspaceProfesseur, SWT.NONE);
		btnNewButton.setText("Trier par ordre alphab\u00E9tique");
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnNewButton.setBounds(10, 21, 255, 35);
		
		Button btnRetour = new Button(shlEspaceProfesseur, SWT.NONE);
		btnRetour.setBounds(530, 662, 105, 35);
		btnRetour.setText("Retour");

	}

}
