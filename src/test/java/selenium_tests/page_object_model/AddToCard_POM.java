package selenium_tests.page_object_model;
import org.openqa.selenium.*;

public final class AddToCard_POM {
	
	public static By prod1 = By.xpath("//a[contains(@href, '?add-to-cart=54')]");
	public static By prod2 = By.xpath("//a[contains(@href, '?add-to-cart=26')]");
	public static By prod3 = By.xpath("//a[contains(@href, '?add-to-cart=25')]");
	public static By prod4 = By.xpath("//a[contains(@href, '?add-to-cart=22')]");
	
	public static By btnCart = By.xpath("//a[contains(text(),'Cart')]");	
	public static By btnRemove = By.xpath("//a[contains(text(),'×')]");	
	
	public static By btnShop = By.xpath("(//a[contains(text(),'Shop')])[2]");	
	
	public static By txtQty = By.xpath("//input[@id='quantity_62*']");	
	
	
	

}
