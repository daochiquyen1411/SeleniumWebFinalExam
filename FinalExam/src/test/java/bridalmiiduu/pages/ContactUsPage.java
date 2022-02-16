package bridalmiiduu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BridalMiiduuBasePage{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement txtFirstName = keyword.findElement(By.xpath("//input[@name='name']"));
	private WebElement txtLastName = keyword.findElement(By.xpath("//input[@name='last_name']"));
	private WebElement txtPhoneNumber = keyword.findElement(By.xpath("//input[@name='phone_number']"));
	private WebElement txtEmail = keyword.findElement(By.xpath("//input[@name='email']"));
	private WebElement txtSubject = keyword.findElement(By.xpath("//input[@name='subject']"));
	private WebElement txtareaEnquiry = keyword.findElement(By.xpath("//textarea[@name='enquiry']"));
//	private WebElement lblCapcha = keyword.findElement(By.cssSelector("#recaptcha-anchor-label"));
	
	public boolean UIDisplaySuccessfully() {
		
		if (txtFirstName.isDisplayed() && txtLastName.isDisplayed() 
			&& txtPhoneNumber.isDisplayed() && txtEmail.isDisplayed() 
			&& txtSubject.isDisplayed() && txtareaEnquiry.isDisplayed()
			) {
			
			return true;
		}
		return false;
	}
	
}
