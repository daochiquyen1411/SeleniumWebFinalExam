package bridalmiiduu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BridalPartyPage extends BridalMiiduuBasePage{

	public BridalPartyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement blockItemProducts = keyword.findElement(By.className("col-main"));
	private List<WebElement> productLsts = blockItemProducts.findElements(By.className("item"));
	
	public int productsCount() {
		return productLsts.size();
	}
	
	public ProductDetailPage selectProduct(String productName) {
		String xpath = String.format("//a[@title = '%s']", productName);
        keyword.click(blockItemProducts.findElement(By.xpath(xpath)));
        return new ProductDetailPage(this.driver);
	}
}
