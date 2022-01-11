package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.id("signin_button")).click();
		String Login = driver.getCurrentUrl();
		System.out.println(Login);
		String Head = driver.findElement(By.xpath("//h3[contains(text(),'Log in to ZeroBank')]")).getText();
		System.out.println(Head);
		String pwd = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getText();
		System.out.println(pwd);
		String sign = driver.findElement(By.name("submit")).getTagName();
		System.out.println(sign);
		String sign1 = driver.findElement(By.name("submit")).getAttribute("type");
		System.out.println(sign1);
		String sign2 = driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(sign2);
		
		
		
	}

}
