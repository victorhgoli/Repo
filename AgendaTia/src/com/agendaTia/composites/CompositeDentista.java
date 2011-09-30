package com.agendaTia.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.agendaTia.compons.Navigator;
import com.agendaTia.forms.FormDentistaold;
import com.agendaTia.grids.GridDentista;

public class CompositeDentista extends Composite{

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CompositeDentista(Composite parent, int style) {
		super(parent, style);
		setLayout(new FormLayout());
		
		Navigator navigator = new Navigator(this, SWT.NONE);
		FormData fd_navigator = new FormData();
		fd_navigator.top = new FormAttachment(0, 21);
		fd_navigator.left = new FormAttachment(0, 10);
		navigator.setLayoutData(fd_navigator);
		
		Composite composite = new Composite(this, SWT.NONE);
		final StackLayout stackLayout = new StackLayout();
		composite.setLayout(stackLayout);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 485);
		fd_composite.right = new FormAttachment(0, 550);
		fd_composite.top = new FormAttachment(0, 56);
		fd_composite.left = new FormAttachment(0, 10);
		composite.setLayoutData(fd_composite);
		
		FormDentistaold formDentista = new FormDentistaold(composite, SWT.NONE);
		
		final GridDentista gridDentista = new GridDentista(composite, SWT.NONE);
		composite.setParent(formDentista);
		composite.setTabList(new Control[]{formDentista, gridDentista});
		
		Control[] children = composite.getChildren();
		Control control = stackLayout.topControl;
		
		int i=0;
		for (int n = children.length; i < n; i++) {
		      Control child = children[i];
		      if (child == control) {
		        break;
		      }
		    }
		    ++i;
		    if (i >= children.length) {
		      i = 0;
		    }
		    stackLayout.topControl = children[i];
		    composite.layout();
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
//				composite.setParent(gridDentista);
				
				stackLayout.topControl = gridDentista;
				
			}
		});
		btnNewButton.setLayoutData(new FormData());
		btnNewButton.setText("New Button");
		
		
		
				
		

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
