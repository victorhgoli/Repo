package com.agendaTia.grids;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;


public class GridDentista extends Grid {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GridDentista(Composite parent, int style) {
		super(parent, style, new String[] {"Código","Nome","Telefone","Cidade","Bairro","Número","Secretária"});
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);

	}
	
	@Override
	protected void fillTable(org.eclipse.swt.widgets.Table table) {
//		table.setRedraw(false);
//		DentistaBO dentistaBO = new DentistaBO();
//		List<Dentista> dentistas = dentistaBO.getDentistas();
//
//		for (Dentista dentista : dentistas) {
//			TableItem item = new TableItem(table, SWT.NONE);
//			int c = 0;
//			item.setText(c++, dentista.getId().toString());
//			item.setText(c++, dentista.getNome());
//			item.setText(c++, dentista.getTelefone());
//			item.setText(c++, dentista.getCidade());
//			item.setText(c++, dentista.getBairro());
//			item.setText(c++, dentista.getNumero());
//			item.setText(c++, dentista.getSecretaria());
//		}
		table.setRedraw(true);

	}

}
