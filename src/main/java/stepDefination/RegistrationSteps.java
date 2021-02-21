package stepDefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegistrationSteps {
	WebDriver driver;

	@Given("^user is already on signup Page$")
	public void user_is_already_on_signup_Page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Abinash\\SelenuimTool\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://2-qa.cookandchef.in/index.php");
		driver.manage().window().maximize();

	}

	@When("^user clicks on iamACook signin button$")
	public void user_clicks_on_iamACook_signin_button() {
		driver.findElement(By.xpath("//button[@id='myBtn2']")).click();
		String signInPage = driver.getTitle();
		Assert.assertEquals("CookandChef", signInPage);
	}

	@Then("^user select thecooktype$")
	public void user_select_thecooktype() {
		driver.findElement(By.xpath("//input[@id='username1']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

	}

	@Then("^user enters the name \"([^\"]*)\"$")
	public void user_enters_the_name(String name) {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);

	}

	@Then("^user enters the email \"([^\"]*)\"$")
	public void user_enters_the_email(String emailAddress) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailAddress);

	}

	@Then("^user enters the mobile number \"([^\"]*)\"$")
	public void user_enters_the_mobile_number(String mobile) {
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(mobile);
	}

	@Then("^user enters the password \"([^\"]*)\" and enters the confirm password \"([^\"]*)\"$")
	public void user_enters_the_password_and_enters_the_confirm_password(String password, String cpassword) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='cpassword']")).sendKeys(cpassword);

	}

	@Then("^user select the gender \"([^\"]*)\"$")
	public void user_select_the_gender(String gender) {
		WebElement gen = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[1]/form/div[7]/div"));
		gen.click();
		Actions actions = new Actions(driver);
		WebElement male=driver.findElement(By.xpath("//li[contains(text(),'Male')]"));
		actions.moveToElement(male).click();
		
//		Select gendrop = new Select(gen);
//		gendrop.selectByVisibleText(gender);
//		Select s = new Select(driver.findElement(By.name("gender")));
//		s.selectByVisibleText("Male");

	}

	@Then("^user clicks on signup button$")
	public void user_clicks_on_signup_button() {
		driver.findElement(By.xpath("//button[@class='submitForm']")).click();
		Alert signupalt = driver.switchTo().alert();
		String altMgs = signupalt.getText();
		signupalt.accept();
		System.out.println(altMgs);

	}

	@Then("^user enters the otp on otp page \"([^\"]*)\"$")
	public void user_enters_the_otp_on_otp_page(String otp) {
		driver.findElement(By.xpath("//input[@name='otp']")).sendKeys(otp);

	}

	@Then("^user clicks on otp submit button on otp verification page$")
	public void user_clicks_on_otp_submit_button_on_otp_verification_page() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Alert accountverificationALert = driver.switchTo().alert();
		String altMgs = accountverificationALert.getText();
		accountverificationALert.accept();
		System.out.println(altMgs);
	}

	@Then("^user is on userHomePage$")
	public void user_is_on_userHomePage() {
		String userPage = driver.getTitle();
		Assert.assertEquals("CookandChef | Cook Dashboard", userPage, "Titel not matching");

	}

}
