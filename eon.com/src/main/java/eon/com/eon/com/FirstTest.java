package eon.com.eon.com;

import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends BasePage {
	
	@Test
	public void clickLogin() {
		driver.findElement(By.id("nav-login")).click();
		
	}

}
