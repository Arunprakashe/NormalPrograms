package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitDemo {
	WebDriver driver;
	
@Test
public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}

@Test
public void b_search() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys("sachin");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	//Thread.sleep(15000);
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	WebDriverWait ref = new WebDriverWait(driver,15);
	ref.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Wikipedia')]")));
	driver.findElement(By.xpath("//h3[contains(text(),'Wikipedia')]")).click();
	
}

}
