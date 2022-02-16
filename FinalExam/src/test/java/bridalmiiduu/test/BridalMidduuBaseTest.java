package bridalmiiduu.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import core.configuration.Configuration;
import core.driver.DriverFactory;
import core.keyword.WebKeyword;

public class BridalMidduuBaseTest {
	  public WebDriver driver;
	  public WebKeyword keyword;
	  public Configuration config;
	  
	  @BeforeMethod
	  public void setUp() throws Exception {
		  this.config = new Configuration("src/test/resources/bridalmiduu/config.properties");
	      this.driver = DriverFactory.getDriver(config.getProperty("browser"));
	      this.keyword = new WebKeyword(driver);
	      keyword.openUrl(config.getProperty("url"));
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  this.driver.quit();
	  }
}
