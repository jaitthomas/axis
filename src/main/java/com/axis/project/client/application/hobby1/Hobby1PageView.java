package com.axis.project.client.application.hobby1;

import javax.inject.Inject;

import com.axis.project.client.application.components.Hobby1Component;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class Hobby1PageView extends ViewImpl implements Hobby1PagePresenter.MyView {
    public interface Hobby1PageBinder extends UiBinder<Widget, Hobby1PageView> {
    }
    
    @UiField
    Hobby1Component hobby1Component;
    
    
    @Inject
    Hobby1PageView(Hobby1PageBinder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
