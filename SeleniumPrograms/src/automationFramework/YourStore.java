package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("arun");
		driver.findElement(By.id("input-lastname")).sendKeys("Prakash");
		driver.findElement(By.id("input-email")).sendKeys("arunap12@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("98746641312");
		driver.findElement(By.id("input-password")).sendKeys("arun@123");
		driver.findElement(By.id("input-confirm")).sendKeys("arun@123");
		WebElement newsteller = driver.findElement(By.xpath("//label[text()='Subscribe']/following::input [2]"));
		newsteller.click();
		WebElement privacy = driver.findElement(By.xpath("//b[text()='Privacy Policy']/following::input[1]"));
		privacy.click();
		driver.findElement(By.xpath("//b[text()='Privacy Policy']/following::input[2]")).click();
	}

}
