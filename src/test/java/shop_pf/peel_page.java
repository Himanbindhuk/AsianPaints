package shop_pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class peel_page {
	WebDriver driver;
	public peel_page(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"sort-products\"]")
	WebElement pop;
	
	
	public void pop() {
		Select popularity_Select = new Select(pop);
		popularity_Select.selectByIndex(1);
		
	}
	


}
