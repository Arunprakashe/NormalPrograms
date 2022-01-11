package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
		WebElement Electronics= driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).build().perform();
	
	}

	
}
