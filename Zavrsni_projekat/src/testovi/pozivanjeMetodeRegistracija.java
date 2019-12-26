package testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testovi.metodaUnosaRegistracija50;

public class pozivanjeMetodeRegistracija {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		metodaUnosaRegistracija50.registracija50(driver);
		

	}

}
