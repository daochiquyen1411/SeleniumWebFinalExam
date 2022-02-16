package bridalmiiduu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentCouponPage extends BridalMiiduuBasePage {

	public PaymentCouponPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement checkboxTerm = keyword.findElement(By.xpath("//input[@name='agree']"));
	private WebElement btnContinue = keyword.findElement(By.xpath("//span[normalize-space()='Continue']"));
	
	public CheckOutConFirmPage navigateToConfirmPage() {
		keyword.click(checkboxTerm);
		keyword.click(btnContinue);
		return new CheckOutConFirmPage(this.driver);
	}
}
