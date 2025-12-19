package testingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingClass 
{
	 @Test
	    public void testOne() 
	    {
	        System.out.println("Test One: This test will PASS");
	    }

	    /*@Test
	    public void testTwo() 
	    {
	        System.out.println("Test Two: This test will FAIL");
	        Assert.fail("Intentional failure for learning TestNG");
	    }*/

	    @Test
	    public void testThree() 
	    {
	        System.out.println("Test Three: This test will PASS");
	    }
}
