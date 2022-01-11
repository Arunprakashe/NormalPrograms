package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationCommands {
	WebDriver driver;

	@Test
	public void a_pageLoad() {

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_radioButton() {
		
		WebElement radio = driver.findElement(By.id("radio-button-1"));
		radio.click();
		System.out.println(radio.isEnabled());
	}
	
	@Test
	public void c_checkButton() {
		
		WebElement gender = driver.findElement(By.id("checkbox-1"));
		gender.click();
		System.out.println(gender.isSelected());
	}
	
	@Test
	public void d_text() {
		
		
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Complete Web Form')]")).isDisplayed());
	}
}
