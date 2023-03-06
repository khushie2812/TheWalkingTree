package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Enquiry {

	WebDriver driver;
	
	
	public Enquiry(WebDriver driver) {
		this.driver=driver;
	}
	
	By enquiry = By.xpath("//li[@id='vendorTile70362']//button[@aria-label='Request pricing'][normalize-space()='Request pricing']");
	
	By send= By.xpath("//button[@aria-label='Send']");
	
	
	
	public void clickenquiry() {
		driver.findElement(enquiry).click();
	}
	
	public void clicksend() {
		driver.findElement(send).click();
	}
}
