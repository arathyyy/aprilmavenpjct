package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Amazoneopen;

public class amazonesearchtest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test1()
	{
		Amazoneopen ob=new Amazoneopen(driver);
		ob.setvalues("mobiles");
	}

}
