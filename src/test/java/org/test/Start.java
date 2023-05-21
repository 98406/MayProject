package org.test;

import org.base.CommonUtility;

public class Start extends CommonUtility{

	public static void main(String[] args) {
		getChrome();
		maximize();
		LaunchUrl("https://www.facebook.com/");

	}

}
