package com.agendaTia.compons;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Navigator extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Navigator(Composite parent, int style) {
		super(parent, SWT.BORDER);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button btnChangeFace = new Button(this, SWT.NONE);
		btnChangeFace.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		
		
		
		toolkit.adapt(btnChangeFace, true, true);
		btnChangeFace.setText("changeFace");
		
		Button btnBackward = new Button(this, SWT.NONE);
		toolkit.adapt(btnBackward, true, true);
		btnBackward.setText("backward");
		
		Button btnForward = new Button(this, SWT.NONE);
		toolkit.adapt(btnForward, true, true);
		btnForward.setText("forward");
		
		Button btnAdd = new Button(this, SWT.NONE);
		toolkit.adapt(btnAdd, true, true);
		btnAdd.setText("add");
		
		Button btnConfirm = new Button(this, SWT.NONE);
		toolkit.adapt(btnConfirm, true, true);
		btnConfirm.setText("confirm");
		
		Button btnCancel = new Button(this, SWT.NONE);
		toolkit.adapt(btnCancel, true, true);
		btnCancel.setText("cancel");
		
		Button btnDelete = new Button(this, SWT.NONE);
		toolkit.adapt(btnDelete, true, true);
		btnDelete.setText("delete");
	}
}
