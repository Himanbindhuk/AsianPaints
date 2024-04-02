package shop_pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Diy {
	WebDriver driver;
	public Diy(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"thin-banner-info\"]/ul/li[1]/a/img")
	WebElement claw;
	
	public void claw() {
		claw.click();
	}

}
