package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YourStore {
	WebDriver driver;
@Test

public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
}

@Test
public void b_info() {
		driver.findElement(By.id("input-firstname")).sendKeys("arun");
		driver.findElement(By.id("input-lastname")).sendKeys("Prakash");
		driver.findElement(By.id("input-email")).sendKeys("arunap12@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("98746641312");
		driver.findElement(By.id("input-password")).sendKeys("arun@123");
		driver.findElement(By.id("input-confirm")).sendKeys("arun@123");
}
@Test
public void c_news() {
		WebElement newsteller = driver.findElement(By.xpath("//label[text()='Subscribe']/following::input [2]"));
		newsteller.click();
}

@Test
public void d_privacy() {
		WebElement privacy = driver.findElement(By.xpath("//b[text()='Privacy Policy']/following::input[1]"));
		privacy.click();
		driver.findElement(By.xpath("//b[text()='Privacy Policy']/following::input[2]")).click();
	}

}
