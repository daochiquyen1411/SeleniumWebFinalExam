package bridalmiiduu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage extends BridalMiiduuBasePage{

	public AuthenticationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnContinue = keyword.findElement(By.xpath("//a[@onclick=\"$('#account').submit();\"]"));
	private WebElement checkboxGuest = keyword.findElement(By.cssSelector("#guest"));
	
	public CreateAccountPage navigateToCreateAccountPage() {
		keyword.click(btnContinue);
		return new CreateAccountPage(this.driver);
	}
	
	public GuestCheckOutPage navigateToGuestPage() {
		keyword.click(checkboxGuest);
		keyword.click(btnContinue);
		return new GuestCheckOutPage(this.driver);
	}
}
