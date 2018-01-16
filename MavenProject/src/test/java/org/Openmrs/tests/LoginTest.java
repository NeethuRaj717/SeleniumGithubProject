package org.Openmrs.tests;

import org.Openmrs.util.BaseClass;
import org.Openmrs.util.OpenMrsHelper;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	@Test(groups= {"sanity"})
	public void logintst() {

		OpenMrsHelper help = new OpenMrsHelper(driver);
		help.login("Admin", "Admin123");
		help.logout();

	}

}