package shop_pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wallpaper_page {
	WebDriver driver;
	public wallpaper_page(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"collectionListing\"]/section/div[2]/div/div[1]/div[2]/form/fieldset[1]/legend")
	WebElement colour;
	
	@FindBy(xpath="//span[@class=\"form-global__custom-element form-radio-input__custom-element align-middle custom-radio-btn\"]")
	WebElement red_colour;
	
	public void colour() {
		colour.click();
	}
	public void red() {
		red_colour.click();
	}

}
