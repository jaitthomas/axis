package com.axis.project.client.application.utils;

import com.google.gwt.resources.client.ClientBundle;

public interface ImageResource extends ClientBundle{

	@Source("pingpong.jpg")
	com.google.gwt.resources.client.ImageResource hobby1();
	
	@Source("cricket.jpg")
	com.google.gwt.resources.client.ImageResource hobby2();
	
}
