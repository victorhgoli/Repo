package com.agendaTia.compons;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;

public abstract class INavigatorControl {

	public static void clickSelected(Button btn){
			SelectionAdapter sel = new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					
				}
			};
			
	}
	
}
