package de.jb.mp3store.web;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

import de.jb.mp3store.web.beans.TestBean;

public class HomePage extends WebPage {
	
    @SpringBean
    TestBean testBean;
	
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        	System.out.println("test");
        	
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		add(new Label("testString", testBean.getTestString()));
		 
    }
}
