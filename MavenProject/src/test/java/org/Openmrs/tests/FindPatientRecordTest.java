package org.Openmrs.tests;

import org.Openmrs.pages.FindPntRecord;
import org.Openmrs.util.BaseClass;
import org.Openmrs.util.OpenMrsHelper;
import org.testng.annotations.Test;

public class FindPatientRecordTest extends BaseClass {
	@Test(groups= {"sanity"})
	public void findrecord() {
		OpenMrsHelper helper =new OpenMrsHelper(driver);
		helper.login("Admin", "Admin123");
		FindPntRecord record=new FindPntRecord(driver) ;
		record.findPatientMethod();
		helper.logout();
			
		
	}
	

}
