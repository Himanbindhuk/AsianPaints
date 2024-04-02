package shop_pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wall_page {
	WebDriver driver;
	public wall_page(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"filterSectionWp\"]/div/div/div[2]")
	WebElement price;
	
	@FindBy(xpath="//label[contains(text(),'rs200-rs299')]\r\n")
	WebElement rs200;

	
	public void price() {
		price.click();
	}
	
	public void Rupees() {
		rs200.click();
	}

}
