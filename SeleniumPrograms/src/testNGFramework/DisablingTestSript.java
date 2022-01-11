  package testNGFramework;

import org.testng.annotations.Test;

public class DisablingTestSript {

@Test
public void f1Test() {
	System.out.println("printing f1");
}
@Test(enabled=false)
public void f2() {
	System.out.println("printing f2");
}@Test
public void f3() {
	System.out.println("printing f3");
}@Test(enabled=false)
public void f4() {
	System.out.println("printing f4");
}@Test
public void f5() {
	System.out.println("printing f5");
}

}
