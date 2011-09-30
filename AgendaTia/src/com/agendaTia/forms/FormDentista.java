package com.agendaTia.forms;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class FormDentista extends Composite {
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
	public FormDentista(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		Label lblNome = new Label(this, SWT.NONE);
		lblNome.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNome.setText("Nome:");
		
		txtNome = new Text(this, SWT.BORDER);
		txtNome.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblTelefone = new Label(this, SWT.NONE);
		lblTelefone.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTelefone.setText("Telefone:");
		
		txtTelefone = new Text(this, SWT.BORDER);
		txtTelefone.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCidade = new Label(this, SWT.NONE);
		lblCidade.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCidade.setText("Cidade:");
		
		txtCidade = new Text(this, SWT.BORDER);
		txtCidade.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblBairro = new Label(this, SWT.NONE);
		lblBairro.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblBairro.setText("Bairro:");
		
		txtBairro = new Text(this, SWT.BORDER);
		txtBairro.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNmero = new Label(this, SWT.NONE);
		lblNmero.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNmero.setText("N\u00FAmero:");
		
		txtNumero = new Text(this, SWT.BORDER);
		txtNumero.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblSecretria = new Label(this, SWT.NONE);
		lblSecretria.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSecretria.setText("Secret\u00E1ria:");
		
		txtSecretaria = new Text(this, SWT.BORDER);
		txtSecretaria.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
