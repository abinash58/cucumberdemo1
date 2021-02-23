package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination_withmap {

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

	@Then("^user enters username  and enters password$")
	public void user_enters_username_and_enters_password(DataTable credentials) {

		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@name='uname']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(data.get("password"));
		}

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
}
