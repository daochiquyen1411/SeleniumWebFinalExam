package bridalmiiduu.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;

public class CreateAccountPage extends BridalMiiduuBasePage{

	public CreateAccountPage(WebDriver driver) {
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
	private WebElement selectddlCountry = keyword.findElement(By.xpath("//select[@id='country_id']"));
	private WebElement selectddlRegion = keyword.findElement(By.xpath("//select[@name='zone_id']"));
	private WebElement txtPassword = keyword.findElement(By.xpath("//input[@name='password']"));
	private WebElement txtConfirmPassword = keyword.findElement(By.xpath("//input[@name='confirm']"));
//	private WebElement checkboxCaptcha = keyword.findElement(By.cssSelector(".recaptcha-checkbox-borderAnimation"));
	private WebElement checkboxCaptcha;
	
	public void createAccount() {
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
		
		Select select = new Select(selectddlCountry);
		select.selectByIndex(4);
		
		Select select2 = new Select(selectddlRegion);
		select2.selectByIndex(3);
		
		keyword.setText(txtPassword, "123456789");
		keyword.setText(txtConfirmPassword, "123456789");
		
		
		keyword.scrollPageUsingJs(300);
		checkboxCaptcha = keyword.findElementWaitUntilClickable(By.cssSelector("#recaptcha-anchor"));
		keyword.click(checkboxCaptcha);

	}
	       
		

}
