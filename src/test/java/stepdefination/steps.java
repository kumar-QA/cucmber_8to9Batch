package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	ChromeDriver driver;
	
		@Given("launch the browser and enter url")
		public void launch_the_browser_and_enter_url() {
		    driver=new ChromeDriver();
		    driver.get("https://admin-demo.nopcommerce.com/login");
		    driver.manage().window().maximize();
		}
		
		@When("I Enter valid username")
		public void I_Enter_valid_username() {
			driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		}
		
		@And("I Enter  valid password")
		public void I_Enter_valid_password() {
			driver.findElement(By.id("Password")).sendKeys("admin");
		}
		
		@Then("click  on login Btn and naviagate to Dashboardpage")
		public void click_on_login_Btn_and_naviagate_to_Dashboardpage() throws InterruptedException {
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
		String result=driver.findElement(By.xpath("//div[@class=\"content-header\"]/h1")).getText();	
		System.out.println("successfully naviagted to : "+result);
		}
	

}
