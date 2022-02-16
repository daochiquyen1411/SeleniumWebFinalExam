package bridalmiiduu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BridalMiiduuBasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement TopMenu = keyword.findElement(By.className("topmenu")); 
	private WebElement btnContactUs = TopMenu.findElement(By.cssSelector("[href='index.php?route=information/contact']"));
	private WebElement btnBridalParty = TopMenu.findElement(By.cssSelector("[href='/bridal-party']"));
	
	public ContactUsPage navigateToContactUsPage() {
		keyword.click(btnContactUs);
		return new ContactUsPage(this.driver);
	}
	
	public BridalPartyPage navigateToBridalPartyPage() {
		keyword.click(btnBridalParty);
		return new BridalPartyPage(this.driver);
	}
}
