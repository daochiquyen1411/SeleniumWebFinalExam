package bridalmiiduu.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import bridalmiiduu.pages.BridalPartyPage;
import bridalmiiduu.pages.HomePage;

public class BridalPartyPageTest extends BridalMidduuBaseTest{
	
	@Test
	public void Display5ProductsSuccessfully() {
		HomePage homePage = new HomePage(this.driver);
		int productCounts = homePage.navigateToBridalPartyPage()
									.productsCount();
		Assert.assertEquals(productCounts, 5);
	}

}
