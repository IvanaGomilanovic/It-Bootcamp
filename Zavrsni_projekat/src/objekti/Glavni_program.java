package objekti;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Glavni_program {
	public static void wait1() {
		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		
		
		driver.get(Home_page.URL);
		 String url = driver.getCurrentUrl();
		  
		  if(Home_page.URL.equals(url)) { System.out.println("Web stranica je dobra!");
		  }else { System.out.println("Web stranica nije dobra!"); } wait1();
		  
		  
		  Home_page.clickEnter(driver); wait1(); GoreMeni.clickBirds2(driver); wait1();
		  driver.navigate().back(); wait1(); LevoMeni.clickBirds1(driver); wait1();
		  driver.navigate().back(); SlikeMeni.clickBirds3(driver); wait1();
	 
		  
		  driver.get(Registracija.URL);
		  
		  
		
	
		
		
	}
	

}
