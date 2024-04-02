package stepDefinitions;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shop_pf.Diy;
//import shop_pf.Review;
import shop_pf.peel_page;
import shop_pf.shop_page;
import shop_pf.wall_page;
import shop_pf.wallpaper_page;
//import io.cucumber.messages.types.Duration;

public class shop {
	
	
	WebDriver driver;
	
	@Given("I want to login to asianpaints")
	public void i_want_to_login_to_asianpaints() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications");
		
		driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		String url = ("https://www.asianpaints.com/");
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"profileholder\"]/a[1]")).click();

	}

	@When("I enter mobile number as {string}")
	public void i_enter_mobile_number_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[@id=\"loginMobile\"]")).sendKeys(string);
	}

	@When("click on submit")
	public void click_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/div/div/div[2]/form/div[2]")).click();
	}

	@When("I enter otp")
	public void i_enter_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter otp");
	    String otp=sc.next();
	    driver.findElement(By.xpath("//*[@id=\"loginOtp\"]")).sendKeys(otp);
	}

	@When("click submit")
	public void click_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[@id=\"validate-otp\"]/div[3]/button")).click();
		
	}

	@Then("the login is successful")
	public void the_login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("I am on shop module")
	public void i_am_on_shop_module() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications");
		
		driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		String url = ("https://www.asianpaints.com/");
		driver.get(url);
		//driver.findElement(By.xpath("//*[@id=\"headerNav\"]/div[1]/ul/li[6]/a[2]")).click();
		shop_page sp = new shop_page(driver);
		sp.shop();
	}

	@When("I select the Peel & Sticker Wallpapers category")
	public void i_select_the_peel_sticker_wallpapers_category() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/a/div[1]/div/img")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		shop_page sp = new shop_page(driver);
		sp.peel();
		
	}

	@When("I sort the stickers by price from low to high")
	public void i_sort_the_stickers_by_price_from_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement popularity  = driver.findElement(By.xpath("//*[@id=\"sort-products\"]"));
//		Select popularity_Select = new Select(popularity);
//		popularity_Select.selectByIndex(1);
		peel_page pp = new peel_page(driver);
		pp.pop();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Then("it display stickers from low to high")
	public void it_display_stickers_from_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
//		javascriptExecutor.executeScript("window.scrollBy(0,1000)");
	}
	
	@When("I select Wall Stickers category")
	public void i_select_wall_stickers_category() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/a/div[1]/div/img")).click();
		shop_page sp = new shop_page(driver);
		sp.wallstickers();

		
	}

	@When("I select price option")
	public void i_select_price_option() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,700)");

		//driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		wall_page wp = new wall_page(driver);
		wp.price();
		wp.Rupees();
	}

	@Then("it displays price filter option")
	public void it_displays_price_filter_option() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[2]/div/div/ul/li[2]/div/label/input")).click();
		
	}
	
	@When("I select WallPapers category")
	public void i_select_wall_papers_category() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/a/div[1]/div/img")).click();
		shop_page sp = new shop_page(driver);
		sp.wallpaper();
	}


	@When("I select colour")
	public void i_select_colour() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"collectionListing\"]/section/div[2]/div/div[1]/div[2]/form/fieldset[1]/legend")).click();
		//WebElement red = driver.findElement(By.xpath("//span[@class=\"form-global__custom-element form-radio-input__custom-element align-middle custom-radio-btn\"]"));
		//boolean yes_selected = red.isSelected();
		//red.click();
		//driver.findElement(By.xpath("//*[@id=\"collectionListing\"]/section/div[2]/div/div[1]/div[2]/form/fieldset[1]/div/label[1]/span[1]")).click();
		wallpaper_page wp = new wallpaper_page(driver);
		wp.colour();
		wp.red();
	}

	@Then("it display stickers based on the colour")
	public void it_display_stickers_based_on_the_colour() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	

	@When("I select DIY Tools")
	public void i_select_diy_tools() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[7]/a/div[1]/div/img")).click();
		shop_page sp = new shop_page(driver);
		sp.diy();
	}

	@When("I select product")
	public void i_select_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"thin-banner-info\"]/ul/li[1]/a/img")).click();
//		driver.findElement(By.xpath("//h4[@class='accor-title']")).click();
//		driver.findElement(By.xpath("//label[@class='form-checkbox' and contains(text(),'hand tools')]/input[@type='checkbox']")).click();
		Diy diy = new Diy(driver);
		diy.claw();
	}

	@Then("it displays the product details")
	public void it_displays_the_product_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement qty = driver.findElement(By.xpath("//div[@class='cart-item-number input-qty']"));
//		Select qty_Select = new Select(qty);
//		qty_Select.selectByIndex(2);

	}
	


//	@When("I select Magnificence of a Peacock sticker")
//	public void i_select_magnificence_of_a_peacock_sticker() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div/div[3]/div/div/div/div[2]/div[1]/a/div[1]/picture/img")).click();
//		shop_page sp = new shop_page(driver);
//		sp.bst_pic();
//	}

//	@When("I click on reveiws")
//	public void i_click_on_reveiws() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		//driver.findElement(By.xpath("//a[contains(text(),'(5 Reviews)')]")).click();
//		Review rw = new Review(driver);
//		rw.review();
//		
//	}
//
//	@Then("it displays reviews of a sticker")
//	public void it_displays_reviews_of_a_sticker() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
	
	@When("I enter email as {string}")
	public void i_enter_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//input[@id='trackemailid']")).sendKeys(string);
		shop_page sp = new shop_page(driver);
		sp.Email(string);
		
	}

	@When("I click on subscribe button")
	public void i_click_on_subscribe_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//button[contains(text(),'Subscribe')]")).click();
		shop_page sp = new shop_page(driver);
		sp.sub() ;
		
	}

	@Then("I subscribed successfully")
	public void i_subscribed_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	



































}

