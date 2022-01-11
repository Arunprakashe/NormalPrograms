package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_up");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("feasfg*123");
		driver.findElement(By.xpath("//input[@id='user_password']/following::input")).click();

	}

}
