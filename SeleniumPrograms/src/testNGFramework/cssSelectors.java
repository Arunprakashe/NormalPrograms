package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cssSelectors {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void b_cssSelectors() {
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector(".submit-button btn_action")).click();
	}
}
