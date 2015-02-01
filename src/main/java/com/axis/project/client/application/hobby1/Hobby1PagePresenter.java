package com.axis.project.client.application.hobby1;

import javax.inject.Inject;

import com.axis.project.client.application.ApplicationPresenter;
import com.axis.project.client.place.NameTokens;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class Hobby1PagePresenter extends Presenter<Hobby1PagePresenter.MyView, Hobby1PagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.hobby1)
    public interface MyProxy extends ProxyPlace<Hobby1PagePresenter> {
    }

    @Inject
    Hobby1PagePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
}
