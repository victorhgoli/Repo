package com.agendaTia.main;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class compgrd extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public compgrd(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		

		Composite composite = new Composite(parent, SWT.NULL);
	    composite.setLayout(new FillLayout());
	    
	    // Creates a form instance.
	    // Form form = toolkit.createForm(composite);
	    ScrolledForm form = toolkit.createScrolledForm(composite);
	    form.setLayoutData(new GridData(GridData.FILL_BOTH));
	    
	    // Sets title.
	    form.setText("Composing an Email Message");
	    
	    // Adds body contents.
	    form.getBody().setLayout(new GridLayout(2, false));
	    Label label = toolkit.createLabel(form.getBody(), "To: ", SWT.NULL);
	    Text textTo = toolkit.createText(form.getBody(), "");
	    textTo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    label = toolkit.createLabel(form.getBody(), "Subject: ", SWT.NULL);
	    Text textSubject = toolkit.createText(form.getBody(), "");
	    textSubject.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    label = toolkit.createLabel(form.getBody(), "Message: ", SWT.NULL);
	    Text textMessage = toolkit.createText(form.getBody(), "");
	    textMessage.setLayoutData(new GridData(GridData.FILL_BOTH));
	    
	    label = toolkit.createLabel(form.getBody(), "Option: ", SWT.NULL);
	    Button buttonOption = toolkit.createButton(form.getBody(), "save a copy", SWT.CHECK);
	  
	    
	    Button buttonClose = toolkit.createButton(form.getBody(), "Close", SWT.PUSH);
	    GridData gridData = new GridData();
	    gridData.horizontalSpan = 2;
	    gridData.horizontalAlignment = GridData.END;
	    buttonClose.setLayoutData(gridData);
	    
	    
	    // Button button = toolkit.createButton(form.getBody(), "Test", SWT.NULL);  
	    
	    // Adds tool bar items.
	    form.getToolBarManager().add(new Action("Send") {
	      public void run() {
	        System.out.println("Sending email ...");
	      }
	    });
	    
	    form.getToolBarManager().add(new Action("Cancel") {
	      public void run() {
	        System.out.println("Cancelled.");
	      }
	    });
	    
	    form.updateToolBar();



	}

}
