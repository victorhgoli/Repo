package com.agendaTia.main;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FillLayout;
import com.agendaTia.compons.Navigator;
import org.eclipse.swt.custom.ScrolledComposite;
import com.agendaTia.composites.CompositeDentista;
import org.eclipse.swt.graphics.Point;
import com.agendaTia.compons.TopBar;
import org.eclipse.swt.custom.StackLayout;

public class Main {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
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
		shell.setMinimumSize(new Point(800, 600));
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Composite topBar = new Composite(composite, SWT.NONE);
		GridData gd_topBar = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_topBar.widthHint = 419;
		topBar.setLayoutData(gd_topBar);
		topBar.setBounds(0, 0, 64, 64);
		
		TopBar topBar_1 = new TopBar(topBar, SWT.NONE);
		topBar_1.setBounds(0, 0, 560, 138);
		
		Composite bodyComposite = new Composite(composite, SWT.BORDER);
		bodyComposite.setLayout(new GridLayout(1, false));
		bodyComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Navigator navigator = new Navigator(bodyComposite, SWT.NONE);
		navigator.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		
		Composite mainComposite = new Composite(bodyComposite, SWT.NONE);
		mainComposite.setLayout(new StackLayout());
		mainComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		CompositeDentista compositeDentista = new CompositeDentista(mainComposite, SWT.NONE);

	}
}
