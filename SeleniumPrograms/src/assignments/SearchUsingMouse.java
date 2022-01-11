package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchUsingMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Explore')]/following::input[1]")).sendKeys("redmi");
		WebElement search = driver.findElement(By.xpath("//a[contains(text(),'Explore')]/following::button"));
		Actions act = new Actions(driver);
		act.moveToElement(search).click().build().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[contains(text(),'REDMI SonicBass Neckband Bluetooth Headset')])[1]")).click();
		
	}

}
