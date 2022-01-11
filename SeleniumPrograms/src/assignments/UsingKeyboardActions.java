package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Explore')]/following::input[1]")).sendKeys("redmi");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'REDMI 9i (Nature Green, 64 GB)')]")).click();
		

	}

}
