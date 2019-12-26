package testovi;

import org.openqa.selenium.WebDriver;


import objekti.Registracija;
import excel.Utility;

public class metodaUnosaRegistracije {
	public static void registracija1(WebDriver driver, int i) {
		
		driver.get(Registracija.URL);

		Utility.setExcell("UserRandomData.xlsx");
		Utility.setWorkSheet(0);
		String s;
		
			
			Registracija.clickUserID(driver);
			s = Utility.getDataAtNum(i, 0);
			Registracija.inputUserID(driver, s);
			
			Registracija.clickPass(driver);
			Registracija.clickNewPass(driver);
			s = Utility.getDataAt(i, 1);
			Registracija.inputPass(driver, s);
			Registracija.inputNewPass(driver, s);
			
			
			
			
			// FirstName
			Registracija.clickFName(driver);
			s = Utility.getDataAt(i, 2);
			Registracija.inputFName(driver, s);

			// LastName
			Registracija.clickLName(driver);
			s = Utility.getDataAt(i, 3);
			Registracija.inputLName(driver, s);

			// Email
			Registracija.clickEmail(driver);
			s = Utility.getDataAt(i, 4);
			Registracija.inputEmail(driver, s);

			// Phone
			Registracija.clickPhone(driver);
			s = Utility.getDataAtNum(i, 5);
			Registracija.inputPhone(driver, s);

			//Address1
			Registracija.clickAddress1(driver);
			s = Utility.getDataAt(i, 6);
			Registracija.inputAddress1(driver, s);
			//Address2
			Registracija.clickAddress2(driver);
			s = Utility.getDataAt(i, 7);
			Registracija.inputAddress2(driver, s);
					
			//City
			Registracija.clickCity(driver);
			s = Utility.getDataAt(i, 8);
			Registracija.inputCity(driver, s);
			
			//State
			Registracija.clickState(driver);
			s = Utility.getDataAt(i, 9);
			Registracija.inputState(driver, s);
			
			//Zip
			Registracija.clickZip(driver);
			s = Utility.getDataAtNum(i, 10);
			Registracija.inputZip(driver, s);
			
			//Country
			Registracija.clickCountry(driver);
			s = Utility.getDataAt(i, 11);
			Registracija.inputCountry(driver, s);
			
			//Language
			s = Utility.getDataAt(i, 12);
			Registracija.inputLang(driver, s);
			//Favorite
			s = Utility.getDataAt(i, 13);
			Registracija.inputLang(driver, s);
			
			//myList
			s = Utility.getDataAt(i, 14);
			if (s.equals("YES")) {
				Registracija.clickMyList(driver);
			}
			//myBanner
			s = Utility.getDataAt(i, 14);
			if (s.equals("YES")) {
				Registracija.clickMyBanner(driver);
			}
			// Submit
			Registracija.clickSaveAcc(driver);
			
	}		
		
}
