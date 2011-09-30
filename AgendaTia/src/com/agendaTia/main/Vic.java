package com.agendaTia.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import com.agendaTia.composites.CompositeDentista;
import org.eclipse.swt.SWT;
import com.agendaTia.forms.FormDentistaold;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class Vic {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Vic window = new Vic();
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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(525, 435);
		shell.setText("SWT Application");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(0, 0, 359, 397);
		
		FormDentistaold formDentista = new FormDentistaold(composite, SWT.NONE);
		formDentista.setSize(526, 384);
		
		
	
	}
}
