package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class Flipkart {
	WebDriver driver;
	@Test
	public void a_pageload() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_closeLogin() {
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
	}
	
	@Test
	public void c_search() {
		
		driver.findElement(By.xpath("//a[text()='Explore']/following::input[1]")).sendKeys("redmi");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	@Test
	public void d_selectProduct() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Redmi GPS Watch']")).click();
	}
	
	@Test
	public void e_getPageTitle() {
		
		ArrayList <String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
