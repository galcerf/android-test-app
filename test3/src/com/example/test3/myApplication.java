package com.example.test3;
import com.applause.android.Applause;
import com.applause.android.Applause.Mode;
import com.applause.android.config.Configuration;

import android.app.Application;


public class myApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		
//	String APP_KEY = "e5fbd9828777d16ac20fb1f28b4dc54eca4631a3";
//		
//		Configuration configuration = new Configuration.Builder(this)
//		.withAPIKey(APP_KEY) //Provides Apphance APP_KEY
//		.withMode(Mode.QA) //Selects Apphance mode
//		.withReportOnShakeEnabled(true) //Enables shake report trigger
//		.withServerURL("https://apphance-testing.herokuapp.com")
//		.build();
//
//		Applause.startNewSession(this, configuration);
	}

}
