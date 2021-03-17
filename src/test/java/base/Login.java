package base;

import org.openqa.selenium.By;

import commonUtils.Initialize;
import junit.framework.Assert;

public class Login extends Initialize{
	
	public void EnterLoginCredentials(String username,String password)  {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
	}

	public void verifyhomePage() {
		
		boolean home = driver.findElement(By.xpath("//span[@class= 'user-display']")).isDisplayed();
		Assert.assertTrue(home);
	}
}
