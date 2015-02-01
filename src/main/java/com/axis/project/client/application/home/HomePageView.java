package com.axis.project.client.application.home;

import javax.inject.Inject;

import com.axis.project.client.application.components.Hobby1Component;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class HomePageView extends ViewImpl implements HomePagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, HomePageView> {
    }
    
    @UiField
    Hobby1Component hobbyComponent;

    @Inject
    HomePageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    public Hobby1Component getHobbyComponent(){
    	return hobbyComponent;
    }
}
