package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazoneopen {
	WebDriver driver;
	By seraching=By.id("twotabsearchtextbox");
	public Amazoneopen(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void setvalues(String search)
	{
		driver.findElement(seraching).sendKeys(search,Keys.ENTER);
	}

}
