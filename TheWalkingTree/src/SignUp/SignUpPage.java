package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

		WebDriver driver;
		

		public SignUpPage(WebDriver driver) {
			this.driver=driver;
		}
		

		By username= By.className("textfield__input");
		By useremail =  By.xpath("//input[@placeholder='Email']");
		By userpassword = By.xpath("//input[@placeholder='Password']");
		WebElement eventLocation1 =  driver.findElement(By.xpath("//input[@id='txtStrPoblacion']"));
		Select dropdown = new Select(eventLocation1);  
		By eventLocation2 =  By.xpath("//select[@name='Pais']");
		By eventDate= By.xpath("//div[@class='textfield storefront-contact-date app-common-datepicker']");
		By calender = By.className("textfield__icon icon icon-form-cal");
		By userPhoneNumber = By.id("phoneFormSignUp");
	    By userIdentity= By.xpath(".//span[contains(.,' Bride ')]");
		By submit =  By.xpath("//button[@type='submit']");
		By save=By.xpath("//input[@value='Save']");
		
		public void insertusername() {
			driver.findElement(username).sendKeys("abc def");
		}
		
		public void insertemail() {
			driver.findElement(useremail).sendKeys("youremail@gmail.com");
		}
		
		public void insertpassword() {
			driver.findElement(userpassword).sendKeys("Trial12345");
		}
		public void insertlocation1() {
			dropdown.selectByValue("Mumbai");
		}
		public void insertDate() {
			driver.findElement(calender).click();
			By yearselect = By.cssSelector(".year active");
			driver.findElement(yearselect).click();
			By monthselect = By.cssSelector(".month active");
			driver.findElement(monthselect).click();
			By dayselect = By.cssSelector(".day active");
			driver.findElement(dayselect).click();
			
		}
		public void insertphone() {
			driver.findElement(userPhoneNumber).sendKeys("123456789");
		}
		public void userIdentity() {
			driver.findElement(userIdentity).click();
		}
		public void clicksubmit() {
			driver.findElement(submit).click();
		}
		public void clickSave() {
			driver.findElement(save).click();
		}
}
