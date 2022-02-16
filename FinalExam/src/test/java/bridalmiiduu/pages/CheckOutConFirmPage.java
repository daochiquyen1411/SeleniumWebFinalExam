package bridalmiiduu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutConFirmPage extends BridalMiiduuBasePage{

	public CheckOutConFirmPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement btnConfirmOrder = keyword.findElement(By.xpath("//span[normalize-space()='Confirm Order']"));
	
	public FinalCheckoutPage navigateToFinalCheckOutPage() {
		keyword.click(btnConfirmOrder);
		return new FinalCheckoutPage(this.driver);
	}
}
