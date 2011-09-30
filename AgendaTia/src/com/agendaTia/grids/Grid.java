package com.agendaTia.grids;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Button;

public class Grid extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Table table;
	private String nameColumns[];

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Grid(Composite parent, int style, String[] nameColumns) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		this.setSize(800, 600);
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(125, 119, 85, 45);
		toolkit.adapt(table);
		toolkit.paintBordersFor(table);
		table.setLinesVisible(true);
		this.nameColumns = nameColumns;
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(324, 258, 75, 25);
		toolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("New Button");
		
	}
	
	protected void buildChildreen() {
		TableColumn[] column = new TableColumn[nameColumns.length];

		for (int i = 0; i < nameColumns.length; i++) {
			column[i] = new TableColumn(table, SWT.NONE);
			column[i].setText(nameColumns[i]);
		}

		fillTable(table);

		for (int i = 0, n = column.length; i < n; i++) {
			column[i].pack();
		}
	}
	
	protected void fillTable(Table table){}
}
