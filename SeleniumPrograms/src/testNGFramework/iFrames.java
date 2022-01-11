package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrames {
	WebDriver driver;
	@Test
	public void a_pageLoad() {

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
	}
	@Test
	public void b_iFrames() {
		driver.switchTo().frame("oddcouple");
		String iFrametext = driver.findElement(By.xpath("//div[starts-with(text(),'A television ')]")).getText();
		System.out.println(iFrametext);
	}
	
}
