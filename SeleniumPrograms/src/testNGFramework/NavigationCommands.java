package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
	
	WebDriver driver;
	@Test
	public void a_pageload() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_navigation() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	

}
