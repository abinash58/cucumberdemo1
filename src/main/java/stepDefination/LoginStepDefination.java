package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {

	WebDriver driver;

	@Given("^user is already on login Page$")
	public void user_is_already_on_login_Page() {

		System.setProperty("webdriver.chrome.driver", "D:\\Abinash\\SelenuimTool\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://2-qa.cookandchef.in/index.php");
		driver.manage().window().maximize();

	}

	@SuppressWarnings("deprecation")
	@When("^title of login page is Login Title$")
	public void title_of_login_page_is_Login_Title() {
		driver.findElement(By.xpath("//i[@class='flaticon-login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CookandChef", title);
	}

	@Then("^user enters username \"(.*)\" and enters password \"(.*)\"$")
	public void user_enters_username_and_enters_password(String username,String password) {

		driver.findElement(By.xpath("//input[@name='uname']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("myBtn1")).click();

	}

	@SuppressWarnings("deprecation")
	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("CookandChef | Cook Dashboard", homePageTitle);
		System.out.println(homePageTitle);
		driver.quit();
	}

	@Given("^user is already on homepage$")
	public void user_is_already_on_homepage() {

		System.setProperty("webdriver.chrome.driver", "D:\\Abinash\\SelenuimTool\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://2-qa.cookandchef.in/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//i[@class='flaticon-login']")).click();
		driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("Test@yopmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Welcome1@");
		driver.findElement(By.id("myBtn1")).click();

		String homePageTitle = driver.getTitle();
		Assert.assertEquals("CookandChef | Cook Dashboard", homePageTitle);
		System.out.println(homePageTitle);

	}

	@When("^user clicks on edit profile button$")
	public void user_clicks_on_edit_profile_button() {

		driver.findElement(By.xpath("//a[contains(text(),'edit profile')]")).click();
		String editpage = driver.getTitle();
		Assert.assertEquals("CookandChef | Cook Dashboard", editpage);
		driver.findElement(By.xpath("//input[@name='fileupload']"))
				.sendKeys("C:\\Users\\Deepita\\Pictures\\Camera Roll\\12.jpg");

	}

	@Then("^user enters date of birth$")
	public void user_enters_date_of_birth() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Select dt = new Select(driver.findElement(By.xpath("//select[@name='date']")));
		Select month = new Select(driver.findElement(By.xpath("//select[@name='month']")));
		Select year = new Select(driver.findElement(By.xpath("//select[@name='year']")));
		dt.selectByVisibleText("8");
		month.selectByVisibleText("Aug");
		year.selectByVisibleText("1979");
	}

	@Then("^user enters Qualification$")
	public void user_enters_Qualification() {
		Select qual = new Select(driver.findElement(By.xpath("//select[@name='qualification']")));
		qual.selectByVisibleText("Bachelors");
		// Select language = new
		// Select(driver.findElement(By.xpath("//div[@id='ms-list-1']")));
		// language.selectByVisibleText("English");
		// List<WebElement> options = language.getOptions();
		// System.out.println(options);

	}

	@Then("^user enters AddressLine$")
	public void user_enters_AddressLine() {
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("flat 111/3");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Blr");

	}

	@Then("^user enters State$")
	public void user_enters_State() {
		Select state = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		state.selectByVisibleText("Delhi");
	}

	@Then("^user enters City Area Pin LandMark$")
	public void user_enters_City_Area_Pin_LandMark() {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Blrarp");
		driver.findElement(By.xpath("//input[@name='area']")).sendKeys("Marathlali");
		driver.findElement(By.xpath("//input[@name='pin']")).clear();
		driver.findElement(By.xpath("//input[@name='pin']")).sendKeys("560037");
		driver.findElement(By.xpath("//input[@name='landmark']")).sendKeys("Munnekolala");

	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() {
		driver.findElement(By.xpath("//button[@name='submit']")).click();

	}

	@Then("^user profile is updated$")
	public void user_profile_is_updated() {
		driver.switchTo().alert().accept();
		driver.getTitle();
		driver.quit();

	}

}
