package com.agendaTia.main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.SWTResourceManager;

import com.agendaTia.grids.GridDentista;
import com.agendaTia.composites.CompositeDentista;

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
		shell.setText("Agenda");
		shell.setMaximized(true);
		shell.setImage(SWTResourceManager.getImage(Main.class, "/images/agendaTopo.png"));

		
		ToolBar toolBar = new ToolBar(shell, SWT.BORDER | SWT.RIGHT | SWT.SHADOW_OUT);
		toolBar.setBounds(10, 0, 1430, 60);
		
		ToolItem toolAgenda = new ToolItem(toolBar, SWT.NONE);
		toolAgenda.setToolTipText("Agenda");
		toolAgenda.setImage(SWTResourceManager.getImage(Main.class, "/images/calendar.png"));
//		toolAgenda.addSelectionListener(changeCompositeSelectionListener(AGENDA));

		ToolItem toolAparelho = new ToolItem(toolBar, SWT.NONE);
		toolAparelho.setToolTipText("Aparelho");
		toolAparelho.setImage(SWTResourceManager.getImage(Main.class, "/images/aparelho.png"));
//		toolAparelho.addSelectionListener(changeCompositeSelectionListener(GRID_APARELHO));

		ToolItem toolDentista = new ToolItem(toolBar, SWT.NONE);
		toolDentista.setToolTipText("Dentista");
		toolDentista.setImage(SWTResourceManager.getImage(Main.class, "/images/dentista.png"));
//		toolDentista.addSelectionListener(changeCompositeSelectionListener(GRID_DENTISTA));

		ToolItem toolPaciente = new ToolItem(toolBar, SWT.NONE);
		toolPaciente.setToolTipText("Paciente");
		toolPaciente.setImage(SWTResourceManager.getImage(Main.class, "/images/paciente.png"));
		
		CompositeDentista compositeDentista = new CompositeDentista(shell, SWT.NONE);
		compositeDentista.setBounds(0, 0, 550, 485);
		
		//Composite bodyComposite = new Composite(shell, SWT.BORDER);
		//bodyComposite.setBounds(10, 62, 1000,708);//shell.getBounds().width-10, shell.getBounds().height-56);
		
		
	}
}
