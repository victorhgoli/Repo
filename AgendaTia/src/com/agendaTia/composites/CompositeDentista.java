package com.agendaTia.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;

import com.agendaTia.compons.Navigator;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.custom.StackLayout;
import com.agendaTia.forms.FormDentista;

public class CompositeDentista extends ScrolledComposite {
	
	private Navigator navigator;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CompositeDentista(Composite parent, int style) {
		super(parent, SWT.NONE|SWT.V_SCROLL|SWT.H_SCROLL);
		setExpandVertical(true);
		setExpandHorizontal(true);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Composite bodyDentista = new Composite(composite, SWT.BORDER);
		bodyDentista.setLayout(new StackLayout());
		GridData gd_bodyDentista = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_bodyDentista.heightHint = 249;
		bodyDentista.setLayoutData(gd_bodyDentista);
		bodyDentista.setBounds(0, 0, 64, 64);
		
		FormDentista formDentista = new FormDentista(bodyDentista, SWT.NONE);
		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
