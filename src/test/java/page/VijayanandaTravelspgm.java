package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VijayanandaTravelspgm {
	WebDriver driver;
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.xpath("//*[@id=\"ToCity\"]");
	By depdate=By.xpath("//*[@id=\"txtFromDate\"]");
	By searching=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	By contarctbus=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By name=By.id("txtcontactPerson");
	By emailId=By.id("txtEmail");
	By phone=By.id("txtMobileNo");
	public VijayanandaTravelspgm(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setSDvalues(String sourc,String dest,String datedes)
	{
		driver.findElement(source).sendKeys(sourc);
		driver.findElement(destination).sendKeys(dest);
		driver.findElement(depdate).sendKeys(datedes);
	}
	public void searchs()
	{
		driver.findElement(searching).click();
	}
	public void contract()
	{
		driver.findElement(contarctbus).click();
	}

	public void setvalues(String names,String email,String phonenum)
	{
		driver.findElement(name).sendKeys(names);
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(phone).sendKeys(phonenum);
	}
}










