package bridalmiiduu.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GuestCheckOutPage extends BridalMiiduuBasePage{

	public GuestCheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement txtFirstName = keyword.findElement(By.xpath("//input[@name='firstname']"));
	private WebElement txtLastName = keyword.findElement(By.xpath("//input[@name='lastname']"));
	private WebElement txtEmail = keyword.findElement(By.xpath("//input[@name='email']"));
	private WebElement txtTelephone = keyword.findElement(By.xpath("//input[@name='telephone']"));
	private WebElement txtFax = keyword.findElement(By.xpath("//input[@name='fax']"));
	private WebElement txtConpany = keyword.findElement(By.xpath("//input[@name='company']"));
	private WebElement txtAddress1 = keyword.findElement(By.xpath("//input[@name='address_1']"));
	private WebElement txtAddress2 = keyword.findElement(By.xpath("//input[@name='address_2']"));
	private WebElement txtCity = keyword.findElement(By.xpath("//input[@name='city']"));
	private WebElement txtPostCode = keyword.findElement(By.xpath("//input[@name='postcode']"));
	private WebElement ddlCountry = keyword.findElement(By.xpath("//select[@id='country_id']"));
	private WebElement ddlRegion = keyword.findElement(By.xpath("//select[@name='zone_id']"));
	private WebElement checkboxSeparateShippingAddress = keyword.findElement(By.id("shipping_indicator"));
	private WebElement btnContinue = keyword.findElement(By.xpath("//span[normalize-space()='Continue']"));	
	
	private WebElement txtShippingFirstName;
	private WebElement txtShippingLastName;
	private WebElement txtShippingConpany;
	private WebElement txtShippingAddress1;
	private WebElement txtShippingAddress2;
	private WebElement txtShippingCity;
	private WebElement txtShippingPostCode;
	private WebElement ddlShippingCountry;
	private WebElement ddlShippingRegion;

	public void fillInfomation() {
		Random rand = new Random();
	    int int_random = rand.nextInt(100);

		keyword.setText(txtFirstName, "Quyen");
		keyword.setText(txtLastName, "Dao");
		keyword.setText(txtEmail, String.format("daoquyen1411%s@gmail.com", String.valueOf(int_random)));
		
		keyword.setText(txtTelephone, "0966834771");
		keyword.setText(txtFax, "38370183");
		keyword.setText(txtConpany, "None");
		keyword.setText(txtAddress1, "385 Nguyen Trai");
		keyword.setText(txtAddress2, "152 Lac Long Quan");
		keyword.setText(txtCity, "Ho Chi Minh");
		keyword.setText(txtPostCode, "70000");
		
		Select selectddlCountry = new Select(ddlCountry);
		selectddlCountry.selectByIndex(4);
		

		Select selectddlRegion = new Select(ddlRegion);
		selectddlRegion.selectByIndex(3);
		
		keyword.click(checkboxSeparateShippingAddress);

	}
	
	public PaymentCouponPage navigateToPaymentCouponPage() {
		fillInfomation();
		txtShippingFirstName = keyword.findElement(By.xpath("//input[@name='shipping_firstname']"));
		txtShippingLastName = keyword.findElement(By.xpath("//input[@name='shipping_lastname']"));
		txtShippingConpany = keyword.findElement(By.xpath("//input[@name='shipping_company']"));
		txtShippingAddress1 = keyword.findElement(By.xpath("//input[@name='shipping_address_1']"));
		txtShippingAddress2 = keyword.findElement(By.xpath("//input[@name='shipping_address_2']"));
		txtShippingCity = keyword.findElement(By.xpath("//input[@name='shipping_city']"));
		txtShippingPostCode = keyword.findElement(By.xpath("//input[@name='shipping_postcode']"));
		ddlShippingCountry = keyword.findElement(By.xpath("//select[@id='shipping_country_id']"));
		ddlShippingRegion = keyword.findElement(By.xpath("//select[@name='shipping_zone_id']"));
		
		keyword.setText(txtShippingFirstName, "Quyen");
		keyword.setText(txtShippingLastName, "Dao");
		keyword.setText(txtShippingConpany, "None");
		keyword.setText(txtShippingAddress1, "111 Nguyen Trai");
		keyword.setText(txtShippingAddress2, "322 Lac Long Quan");
		keyword.setText(txtShippingCity, "Ho Chi Minh");
		keyword.setText(txtShippingPostCode, "70000");
		
		Select selectddlShippingCountry = new Select(ddlShippingCountry);
		selectddlShippingCountry.selectByIndex(4);
		

		Select selectddlShippingRegion = new Select(ddlShippingRegion);
		selectddlShippingRegion.selectByIndex(3);
		
		keyword.click(btnContinue);
		
		return new PaymentCouponPage(this.driver);
	}
}
