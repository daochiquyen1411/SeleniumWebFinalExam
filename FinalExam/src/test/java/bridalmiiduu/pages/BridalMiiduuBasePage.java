package bridalmiiduu.pages;

import org.openqa.selenium.WebDriver;

import core.keyword.WebKeyword;

public class BridalMiiduuBasePage {
	 public WebDriver driver;
	 public WebKeyword keyword;

	 public BridalMiiduuBasePage(WebDriver driver){
	    this.driver = driver;
	    this.keyword = new WebKeyword(driver);
	 }
}
