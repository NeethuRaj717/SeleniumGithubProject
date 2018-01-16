package org.Openmrs.tests;

import org.Openmrs.pages.ActiveVisits;
import org.Openmrs.util.BaseClass;
import org.Openmrs.util.OpenMrsHelper;
import org.testng.annotations.Test;

public class ActiveVisitTests extends BaseClass {

	@Test(groups= {"sanity"})
	public void activevisitTc() throws InterruptedException {
		OpenMrsHelper helper = new OpenMrsHelper(driver);
		helper.login("Admin", "Admin123");
		ActiveVisits act = new ActiveVisits(driver);
		act.activeVistitTest();

		helper.logout();

	}

}
