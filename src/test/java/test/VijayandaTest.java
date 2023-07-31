package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.VijayanandaTravelspgm;

public class VijayandaTest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void test1()
	{
		 VijayanandaTravelspgm nw=new  VijayanandaTravelspgm(driver);
		 nw.setSDvalues("mumbai", "pune", "13-07-2023");
		 nw.searchs();
		 nw.contract();
		 nw.setvalues("raju", "rajuvbnm@gmail.com", "9874563210");
	}

}
