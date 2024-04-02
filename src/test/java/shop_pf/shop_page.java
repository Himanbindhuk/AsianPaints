package shop_pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shop_page {
	WebDriver driver;
	public shop_page(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"headerNav\"]/div[1]/ul/li[6]/a[2]")
	WebElement shop;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/a/div[1]/div/img")
	WebElement peel_stickers;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/a/div[1]/div/img")
	WebElement wallstickers;
		
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/a/div[1]/div/img")
	WebElement wallpaper;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[7]/a/div[1]/div/img")
	WebElement Diy;
	
//	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[3]/div/div/div/div[2]/div[1]/a/div[1]/picture/img")
//	WebElement best_pic;
	
	@FindBy(xpath="//input[@id='trackemailid']")
	WebElement email;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe')]")
	WebElement Subscribe;
	
	public void shop() {
		shop.click();
	}
	
	public void peel() {
		peel_stickers.click();
	}
	
	public void wallstickers() {
		wallstickers.click();
	}
	
	public void wallpaper() {
		wallpaper.click();
	}
	public void diy() {
		Diy.click();
	}
	
//	public void bst_pic() {
//		best_pic.click();
//	}
	
	public void Email(String string) {
		
		email.sendKeys(string);
	}
	
	public void sub() {
		Subscribe.click();
	}
	

}
