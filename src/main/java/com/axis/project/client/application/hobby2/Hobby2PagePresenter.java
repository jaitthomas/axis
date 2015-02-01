package com.axis.project.client.application.hobby2;

import java.util.logging.Logger;

import javax.inject.Inject;

import com.axis.project.client.application.ApplicationPresenter;
import com.axis.project.client.place.NameTokens;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class Hobby2PagePresenter extends Presenter<Hobby2PagePresenter.MyView, Hobby2PagePresenter.MyProxy> {
	private static Logger logger = Logger.getLogger("");
	Hobby2PageView view;
	
	public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.hobby2)
    public interface MyProxy extends ProxyPlace<Hobby2PagePresenter> {
    }

    @Inject
    Hobby2PagePresenter(EventBus eventBus,
    		Hobby2PageView view,
                      MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
        this.view = view;
    }
    
    @Override
    public void onBind() {
      super.onBind();
      view.getResetButton().addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			logger.info("Name :"+view.getName().getValue());
			logger.info("Date :"+view.getDateBox().getValue());
			view.getName().setText("");
			view.getDateBox().setValue(null);
		}
      });
    }
}
