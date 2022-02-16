package bridalmiiduu.test;

import org.testng.annotations.Test;
import bridalmiiduu.testdata.ProductData;
import bridalmiiduu.pages.AuthenticationPage;
import bridalmiiduu.pages.BridalPartyPage;
import bridalmiiduu.pages.CartPage;
import bridalmiiduu.pages.CheckOutConFirmPage;
import bridalmiiduu.pages.CreateAccountPage;
import bridalmiiduu.pages.FinalCheckoutPage;
import bridalmiiduu.pages.GuestCheckOutPage;
import bridalmiiduu.pages.HomePage;
import bridalmiiduu.pages.PaymentCouponPage;
import bridalmiiduu.pages.ProductDetailPage;

public class OrderProductSuccessfullyTest extends BridalMidduuBaseTest{
	
	@Test(dataProvider = "products", dataProviderClass = ProductData.class)
	public void orderProductsSuccessfully(String productsName) {
		HomePage homePage = new HomePage(this.driver);
		BridalPartyPage bridalPartyPage = homePage.navigateToBridalPartyPage();
		ProductDetailPage productDetailPage = bridalPartyPage.selectProduct(productsName);
		CartPage cartPage = productDetailPage.addToCartAndNavigateToCartPage();
		AuthenticationPage authenticationPage = cartPage.processToCheckOut();
		GuestCheckOutPage guestCheckOutPage = authenticationPage.navigateToGuestPage();
		PaymentCouponPage paymentCouponPage = guestCheckOutPage.navigateToPaymentCouponPage();
		CheckOutConFirmPage checkOutConFirmPage = paymentCouponPage.navigateToConfirmPage();
		FinalCheckoutPage finalCheckoutPage = checkOutConFirmPage.navigateToFinalCheckOutPage();
		finalCheckoutPage.completeCheckOut();
	}
	
}
