package com.axis.project.client.application;

import com.axis.project.client.application.hobby1.Hobby1PagePresenter;
import com.axis.project.client.application.hobby1.Hobby1PageView;
import com.axis.project.client.application.hobby2.Hobby2PagePresenter;
import com.axis.project.client.application.hobby2.Hobby2PageView;
import com.axis.project.client.application.home.HomePagePresenter;
import com.axis.project.client.application.home.HomePageView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        
    	//bind(Hobby1Component.class);
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
        bindPresenter(Hobby1PagePresenter.class, Hobby1PagePresenter.MyView.class, Hobby1PageView.class,
        		Hobby1PagePresenter.MyProxy.class);
        bindPresenter(Hobby2PagePresenter.class, Hobby2PagePresenter.MyView.class, Hobby2PageView.class,
        		Hobby2PagePresenter.MyProxy.class);
        bindPresenter(HomePagePresenter.class, HomePagePresenter.MyView.class, HomePageView.class,
        		HomePagePresenter.MyProxy.class);
        
        
    }
}
