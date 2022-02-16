package bridalmiiduu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends BridalMiiduuBasePage{

	public ProductDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement btnAddToCart = keyword.findElement(By.className("floatleftt"));
	
	public CartPage addToCartAndNavigateToCartPage() {
		keyword.click(btnAddToCart);
		return new CartPage(this.driver);
	}
	
}
