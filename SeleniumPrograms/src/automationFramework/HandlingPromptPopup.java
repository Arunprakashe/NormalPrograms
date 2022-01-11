package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[contains(text(),'for')])")).click();
		Alert aler = driver.switchTo().alert();
		String PopUpText =aler.getText();
		System.out.println(PopUpText);
		aler.sendKeys("Arun");
		aler.accept();
		//aler.dismiss();
		String Confirmtext= driver.findElement(By.id("prompt-demo")).getText();
		System.out.println(Confirmtext);
		
		

	}

}
