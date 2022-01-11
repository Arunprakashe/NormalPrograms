package testNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationDemo {
  @Test
  public void test() {
	  System.out.println("printing f");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("printing before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("printing after method");
  }

/*
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }*/
  @BeforeClass
  public void beforeClass() {

	  System.out.println("printing fbefore class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("printing after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("printing before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("printing after test" );
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("printing before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("printing after suite");
	  
  }

  @BeforeMethod
  public void bM1() {
	  System.out.println("before method1");
  }
  
  @Test
  public void Test1()
  {
	  System.out.println("Test 1");
  }
}
