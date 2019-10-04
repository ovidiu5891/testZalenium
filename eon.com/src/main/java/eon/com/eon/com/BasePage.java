package eon.com.eon.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BasePage {

	public DesiredCapabilities caps;

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@Before
	public void goToHomePage() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://zalenium.eon-software.com:4444/wd/hub"), dc);
		driver.manage().window().maximize();
		driver.get("https://www.eon.de/de/pk.html");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}