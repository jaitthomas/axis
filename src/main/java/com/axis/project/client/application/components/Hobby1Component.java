package com.axis.project.client.application.components;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Hobby1Component extends Composite {
	public interface Binder extends UiBinder<Widget, Hobby1Component> {
    }
	
	 private static Binder uiBinder = GWT
	            .create(Binder.class);
   
    Hobby1Component() {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    
}
