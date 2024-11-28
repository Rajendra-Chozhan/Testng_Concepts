package testng;

import org.testng.annotations.Test;

@Test(groups= {"Full.Regression"})
public class TestNG_Groups {
	
	
	@Test(groups= {"Sanity"})
	public void Test1() {
		
		System.out.println("This is Test 1");
	}

	@Test(groups= {"Sanity","Smoke"})
public void Test2() {
		
		System.out.println("This is Test 2");
	}
	@Test(groups= {"Sanity"})
public void Test3() {
	
	System.out.println("This is Test 3");
}
	@Test(groups= {"Sanity","Regression"})
public void Test4() {
	
	System.out.println("This is Test 4");
}
	@Test(groups= {"Regression"})
public void Test5() {
	
	System.out.println("This is Test 5");
}
	@Test
public void Test6() {
	
	System.out.println("This is Test 6");
}
	@Test(groups= {"Regression"})
public void Test7() {
	
	System.out.println("This is Test 7");
}
}
