package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(desktop).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()=' 1 item(s) - $122.00']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//strong[text()='Sub-Total']/preceding::button[1]")).click();

	}

}
