package com.axis.project.client.application.hobby2;

import javax.inject.Inject;

import com.axis.project.client.application.utils.Messages;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.gwtplatform.mvp.client.ViewImpl;

public class Hobby2PageView extends ViewImpl implements Hobby2PagePresenter.MyView {
	@UiField (provided=true) FlexTable table;
	
	private static final Messages messages = GWT.create(Messages.class);
	Button resetButton;
	TextBox name;
	DateBox started;
	
    public interface Binder extends UiBinder<Widget, Hobby2PageView> {
    }

    @Inject
    Hobby2PageView(Binder uiBinder) {
    	initialize();
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    private void initialize(){
    	setupTable();
    	
    }
    
    private FlexTable setupTable() {
    	if(table == null){
		    table = new FlexTable();
		    table.setCellSpacing(6);
		    FlexCellFormatter cellFormatter = table.getFlexCellFormatter();
		    table.setHTML(0, 0, messages.hobby2());
		    cellFormatter.setColSpan(0, 0, 2);
		    cellFormatter.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
		    table.setHTML(1, 0, messages.name());
		    table.setWidget(1, 1, getName());
		    table.setHTML(2, 0, messages.started());
		    table.setWidget(2, 1, getDateBox());
		    table.setWidget(4, 0, getResetButton());
		    cellFormatter.setColSpan(4, 0, 2);
		    cellFormatter.setHorizontalAlignment(4, 0, HasHorizontalAlignment.ALIGN_CENTER);
		}
    	return table;
	  }
    
    public TextBox getName(){
    	if(name == null){
    		name = new TextBox();
    	}
    	return name;
    }
    
    public DateBox getDateBox(){
    	if(started == null){
    		started = new DateBox();
    		DateTimeFormat dateFormat = DateTimeFormat.getFormat("MM/dd/yyyy");
    		started.setFormat(new DateBox.DefaultFormat(dateFormat));
    	}
    	return started;
    }

    public Button getResetButton(){
    	if(resetButton == null){
    		resetButton = new Button(messages.resetButton());
   
        	
    	}
    	return resetButton;
    }
    
    
}
