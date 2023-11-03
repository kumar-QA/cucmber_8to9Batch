package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	@Given("launch the browser enter url")
	public void launch_the_browser_enter_url() {
		driver=new ChromeDriver();
	    driver.get("https://admin-demo.nopcommerce.com/login");
	    driver.manage().window().maximize();	
	}
	@When("enter valid username")
	public void enter_valid_username() {
		driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	}
	@When("enter valid password")
	public void enter_valid_password() {
    driver.findElement(By.name("Password")).clear();
	driver.findElement(By.name("Password")).sendKeys("admin");
	}
	@When("click on login btn")
	public void click_on_login_btn() {
		driver.findElement(By.className("login-button")).click();
	}
	@Then("it should navgate to Dashboard page")
	public void it_should_navgate_to_dashboard_page() {
	 String Result=driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText();
	 System.out.println("Succesfully Navigated to "+Result);
	}
	@When("enter Invalid username")
	public void enter_invalid_username() {
		driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
	    	}
	@When("enter Invalid password")
	public void enter_invalid_password() {
	    driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("xyz");
	    	}
	@Then("it should through error message")
	public void it_should_through_error_message() {
	String Actualtext=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/descendant::li")).getText();
	String Expectedtext="No customer account found";
	Assert.assertEquals("Verifiying error message", Expectedtext, Actualtext);
	   	}
	@Then("it should through usernmae error message")
	public void it_should_through_usernmae_error_message() {
		String Actualtext=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/descendant::li")).getText();
		String Expectedtext="No customer account found";
		Assert.assertEquals("Verifiying error message", Expectedtext, Actualtext);
	}
	 @Then("it should through invalid password error message")
	 public void it_should_through_invalid_password_error_message() {
			String Actualtext=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/descendant::li")).getText();
			String Expectedtext="The credentials provided are incorrect";
			Assert.assertEquals("Verifiying error message", Expectedtext, Actualtext);
	 }
	 @Then("it should through required error message")
	 public void it_should_through_required_error_message() {
			String Actualtext=driver.findElement(By.xpath("//span[@id='Email-error']")).getText();
			String Expectedtext="Please enter your email";
			Assert.assertEquals("Verifiying error message", Expectedtext, Actualtext);
	 }
	 
	 @When("username field keep as empty")
	 public void username_filed_keep_as_empty() {
		 driver.findElement(By.name("Email")).clear();
	 }
	 @And("Password field keep as empty")
	  public void Password_field_keep_as_empty() {
		 driver.findElement(By.name("Password")).clear();  
	   }
	 
	 @And("Close the Browser")
	 public void Close_the_Browser() {
		 driver.close();
	 }

	 @When("user click on product")
	 public void user_click_on_product() throws InterruptedException {
		 driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		 
	     	 }

	 @When("Search for product name with {string}")
	 public void search_for_product_name_with(String Productname) throws InterruptedException {
		 driver.findElement(By.id("SearchProductName")).sendKeys(Productname);
		 Thread.sleep(1000);
	     	 }
	 @Then("it Should show result")
	 public void it_should_show_result() throws InterruptedException {
		WebElement searchbtn=driver.findElement(By.xpath("//div[@class='text-center col-12']/button"));
		searchbtn.click();
//		 JavascriptExecutor js= (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();",searchbtn);
         Thread.sleep(5000);
         
	     	 }
	 
	 
	 
	 @When("user click on categories link")
	 public void user_click_on_categories_link() throws InterruptedException {
		
		 driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@href='/Admin/Category/List']")).click();
		
		 
	     	 }

	 @When("^Search for categorie name as(.*)$")
	 public void search_for_categorie_name_as(String categoriename) {
		 driver.findElement(By.id("SearchCategoryName")).sendKeys(categoriename);
	      }

	 @Then("it should display the result")
	 public void it_should_display_the_result() throws InterruptedException {
		 WebElement searchbtn=driver.findElement(By.xpath("//div[@class='text-center col-12']/button"));
		 searchbtn.click();
//		 JavascriptExecutor js= (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();",searchbtn);
		 Thread.sleep(5000);
	     	 }
}
