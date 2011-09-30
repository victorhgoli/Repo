package com.agendaTia.forms;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

public class FormDentistaold extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text txtNome;
	private Text txtTelefone;
	private Text txtCidade;
	private Text txtBairro;
	private Text txtNumero;
	private Text txtSecretaria;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public FormDentistaold(Composite parent, int style) {
		super(parent, style);
		setBackgroundMode(SWT.INHERIT_DEFAULT);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout());
		
		Composite composite = new Composite(this, SWT.NONE);
		/*FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 384);
		fd_composite.right = new FormAttachment(0, 526);
		fd_composite.top = new FormAttachment(0);
		fd_composite.left = new FormAttachment(0);
		
		*/
		GridData gridData = new GridData();
		gridData.grabExcessVerticalSpace = true;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginTop = 1;
		gridLayout.marginBottom = 1;
		gridLayout.verticalSpacing = 4;
		gridLayout.marginWidth = 1;
		gridLayout.marginHeight = 1;
		gridLayout.horizontalSpacing = 1;
		
		
		composite.setLayoutData(gridData);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		composite.setLayout(gridLayout);
		
		FormText formNome = toolkit.createFormText(composite, false);
		toolkit.paintBordersFor(formNome);
		formNome.setText("Nome:", false, false);
		
		txtNome = toolkit.createText(composite, "New Text", SWT.BORDER);
		txtNome.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtNome.setText("");
		
		FormText formTelefone = toolkit.createFormText(composite, false);
		toolkit.paintBordersFor(formTelefone);
		formTelefone.setText("Telefone:", false, false);
		
		txtTelefone = toolkit.createText(composite, "New Text", SWT.NONE);
		GridData gd_txtTelefone = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_txtTelefone.widthHint = 340;
		txtTelefone.setLayoutData(gd_txtTelefone);
		txtTelefone.setText("");
		
		FormText formCidade = toolkit.createFormText(composite, false);
		toolkit.paintBordersFor(formCidade);
		formCidade.setText("Cidade:", false, false);
		
		txtCidade = toolkit.createText(composite, "New Text", SWT.NONE);
		txtCidade.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtCidade.setText("");
		
		FormText formBairro = toolkit.createFormText(composite, false);
		toolkit.paintBordersFor(formBairro);
		formBairro.setText("Bairro:", false, false);
		
		txtBairro = toolkit.createText(composite, "New Text", SWT.NONE);
		txtBairro.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtBairro.setText("");
		
		FormText formNumero = toolkit.createFormText(composite, false);
		toolkit.paintBordersFor(formNumero);
		formNumero.setText("N\u00FAmero:", false, false);
		
		txtNumero = toolkit.createText(composite, "New Text", SWT.NONE);
		txtNumero.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtNumero.setText("");
		
		FormText formSecretaria = toolkit.createFormText(composite, false);
		toolkit.paintBordersFor(formSecretaria);
		formSecretaria.setText("Secret\u00E1ria:", false, false);
		
		txtSecretaria = toolkit.createText(composite, "New Text", SWT.NONE);
		txtSecretaria.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtSecretaria.setText("");

	}
}
