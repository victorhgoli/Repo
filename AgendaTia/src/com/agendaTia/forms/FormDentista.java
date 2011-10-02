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
		GridData gd_txtNome = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtNome.widthHint = 299;
		txtNome.setLayoutData(gd_txtNome);
		
		Label lblTelefone = new Label(this, SWT.NONE);
		lblTelefone.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTelefone.setText("Telefone:");
		
		txtTelefone = new Text(this, SWT.BORDER);
		GridData gd_txtTelefone = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_txtTelefone.widthHint = 160;
		txtTelefone.setLayoutData(gd_txtTelefone);
		
		Label lblCidade = new Label(this, SWT.NONE);
		lblCidade.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCidade.setText("Cidade:");
		
		txtCidade = new Text(this, SWT.BORDER);
		GridData gd_txtCidade = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_txtCidade.widthHint = 80;
		txtCidade.setLayoutData(gd_txtCidade);
		
		Label lblBairro = new Label(this, SWT.NONE);
		lblBairro.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblBairro.setText("Bairro:");
		
		txtBairro = new Text(this, SWT.BORDER);
		GridData gd_txtBairro = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_txtBairro.widthHint = 160;
		txtBairro.setLayoutData(gd_txtBairro);
		
		Label lblNmero = new Label(this, SWT.NONE);
		lblNmero.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNmero.setText("N\u00FAmero:");
		
		txtNumero = new Text(this, SWT.BORDER);
		GridData gd_txtNumero = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_txtNumero.widthHint = 80;
		txtNumero.setLayoutData(gd_txtNumero);
		
		Label lblSecretria = new Label(this, SWT.NONE);
		lblSecretria.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSecretria.setText("Secret\u00E1ria:");
		
		txtSecretaria = new Text(this, SWT.BORDER);
		GridData gd_txtSecretaria = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtSecretaria.widthHint = 287;
		txtSecretaria.setLayoutData(gd_txtSecretaria);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
