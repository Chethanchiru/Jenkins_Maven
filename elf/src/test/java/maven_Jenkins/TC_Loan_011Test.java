package maven_Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_011Test {

	@Test ()
	public void modifyLoan( ) {			
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.kfc.co.in/");	
		driver.quit();
	}
}
