package bridalmiiduu.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import bridalmiiduu.pages.ContactUsPage;
import bridalmiiduu.pages.HomePage;

public class ContactUsPageUIDisplayTest extends BridalMidduuBaseTest{
	@Test
	public void contactUsPageUIDisplaySuccessfully () {
		HomePage homePage = new HomePage(this.driver);
		ContactUsPage contactUsPage = homePage.navigateToContactUsPage();
		Assert.assertTrue(contactUsPage.UIDisplaySuccessfully());
	}
}
