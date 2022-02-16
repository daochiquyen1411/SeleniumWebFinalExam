package bridalmiiduu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bridalmiiduu.test.BridalMidduuBaseTest;

public class CartPage extends BridalMiiduuBasePage{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnProcessToCheckOut = keyword.findElement(By.xpath("//a[@class='button button3']"));
	
	public AuthenticationPage processToCheckOut() {
		keyword.click(btnProcessToCheckOut);
		return new AuthenticationPage(this.driver);
	}
	
	
}
