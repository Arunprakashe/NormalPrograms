package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK ')])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'an')]")).click();
		Alert aler = driver.switchTo().alert();
		String popuptext= aler.getText();
		System.out.println(popuptext);
		Thread.sleep(5000);
		aler.accept();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK ')])[2]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm ')]")).click();
		Alert aler1= driver.switchTo().alert();
		String confirm = aler1.getText();
		System.out.println(confirm);
		Thread.sleep(5000);
		aler1.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//a[contains(text(),'Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt ')]")).click();
		Alert aler2= driver.switchTo().alert();
		String prompt= aler2.getText();
		System.out.println(prompt);
		Thread.sleep(5000);
		aler2.sendKeys("Automation");
		aler2.accept();
		String pbox = driver.findElement(By.id("demo1")).getText();
		System.out.println(pbox);
		
	}

}
