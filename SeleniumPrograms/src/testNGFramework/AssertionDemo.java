package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	WebDriver driver;

	@Test
	public void a_pageLoad() {

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
	}

	@Test
	public void b_assertEquals() {
		String headertext = driver.findElement(By.xpath("//h1[contains(text(),'Complete Web Form')]")).getText();
		Assert.assertEquals(headertext, "Complete Web Form");
		System.out.println("Assertequals pass");
	}

	@Test
	public void c_assertNotEquals() {
		String headertext = driver.findElement(By.xpath("//h1[contains(text(),'Complete Web Form')]")).getText();
		Assert.assertNotEquals(headertext, "complete web form");
		System.out.println("Assertnotequal pass");
	}

	@Test
	public void d_assertTrue() {
		Assert.assertTrue("Complete Web Form".equals(driver.findElement(By.xpath("//h1[contains(text(),'Complete Web Form')]")).getText()));
		System.out.println("Asserttrue pass");
	}
	
	
	@Test
	public void e_assertFalse() {

		String headertext = driver.findElement(By.xpath("//h1[contains(text(),'Complete Web Form')]")).getText();
		Assert.assertFalse("complete web form".equals(headertext));
		System.out.println("assertfalse pass");
	}
	
	@Test
	public void f_assertNull()
	{
		Object obj = null;
		Assert.assertNull(obj);
		System.out.println("AssertNull pass");
	}
	
	@Test 
	public void g_assertNotNull() {
		Object obj=driver.getTitle();
		Assert.assertNotNull(obj);
		System.out.println("AssertNotNull");
	}

}