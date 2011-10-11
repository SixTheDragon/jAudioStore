package de.jb.mp3store.web.beans;

import javax.inject.Named;

@Named("testBean")
public class TestBean {
	
	private boolean testParam = false;
	private String testString = "LEERER STRING";

	/**
	 * @return the testParam
	 */
	public boolean isTestParam() {
		return testParam;
	}
	/**
	 * @param testParam the testParam to set
	 */
	public void setTestParam(boolean testParam) {
		this.testParam = testParam;
	}
	/**
	 * @return the testString
	 */
	public String getTestString() {
		return testString;
	}
	/**
	 * @param testString the testString to set
	 */
	public void setTestString(String testString) {
		this.testString = testString;
	}
}
