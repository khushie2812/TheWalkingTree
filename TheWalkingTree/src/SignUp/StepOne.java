package SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepOne {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal Jagwani\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.weddingwire.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("FREE SIGN UP")).click();
				
		SignUpPage signUp= new SignUpPage(driver);
		Enquiry enquiry = new Enquiry(driver);
		
		signUp.insertusername();
		signUp.insertemail();
		signUp.insertpassword();
		signUp.insertlocation1();
		signUp.insertDate();
		signUp.insertphone();
		signUp.userIdentity();
		signUp.clicksubmit() ;
		Thread.sleep(3000);
		signUp.clickSave();
		
		
		
	
		enquiry.clickenquiry();
		enquiry.clicksend();
		
		
		 System.out.println("Page navigated to: " +driver.getTitle());
	    // driver.quit();
	}	
	

	
}
