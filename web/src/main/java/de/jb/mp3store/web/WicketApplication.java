package de.jb.mp3store.web;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see de.jb.mp3store.web.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    	
    public WicketApplication() {

    }

	
	/**
	 * @see org.apache.wicket.Application#	getHomePage()
	 */
	@Override
	public Class<HomePage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();		
		Application.get().getComponentInstantiationListeners().add(new SpringComponentInjector(this));
	}
}
