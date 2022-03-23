package userJourney;

import java.text.DecimalFormat;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

@Test

public class ShopperJourney {
	
	public static void labSauceDemo () {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		locators loc = new locators();
		DecimalFormat df = new DecimalFormat("0.00");
		
		driver.get(loc.url);
		
		
		driver.findElement(By.id(loc.nameLoc)).sendKeys(loc.userName);
		driver.findElement(By.name(loc.passLoc)).sendKeys(loc.password);
		driver.findElement(By.id(loc.loginBtn)).click();
		
		driver.findElement(By.xpath(loc.sorterLoHi)).click();
		
		driver.findElement(By.xpath(loc.item1Add)).click();
		driver.findElement(By.xpath(loc.item2Add)).click();
		driver.findElement(By.xpath(loc.item3Add)).click();
		
		driver.findElement(By.className(loc.cart)).click();
		
		String cartItem1 = driver.findElement(By.xpath(loc.cartItem1)).getText();
		String cartItem2 = driver.findElement(By.xpath(loc.cartItem2)).getText();
		String cartItem3 = driver.findElement(By.xpath(loc.cartItem3)).getText();
		
		Assert.assertEquals(cartItem1, loc.item1, "ERROR! I1");
		Assert.assertEquals(cartItem2, loc.item2, "ERROR! I2");
		Assert.assertEquals(cartItem3, loc.item3, "ERROR! I3");
		
		driver.findElement(By.xpath(loc.removeItem)).click();
		
		driver.findElement(By.cssSelector(loc.conShop)).click();
		driver.findElement(By.xpath(loc.item4Add)).click();
		
		driver.findElement(By.className(loc.cart)).click();
		driver.findElement(By.id(loc.chkoutBtn)).click();
		
		driver.findElement(By.name(loc.firstNameLoc)).sendKeys(loc.firstName);
		driver.findElement(By.name(loc.lastNameLoc)).sendKeys(loc.lastName);
		driver.findElement(By.name(loc.postalCodeLoc)).sendKeys(loc.postalCode);
		driver.findElement(By.cssSelector(loc.conChkOut)).click();
		
		String chkoutItem1 = driver.findElement(By.xpath(loc.chkItem1)).getText();
		String chkoutItem2 = driver.findElement(By.xpath(loc.chkItem2)).getText();
		String chkoutItem3 = driver.findElement(By.xpath(loc.chkItem3)).getText();
		
		Assert.assertEquals(chkoutItem1, loc.item1, "ERROR Chkout! I1");
		Assert.assertEquals(chkoutItem2, loc.item3, "ERROR Chkout! I2");
		Assert.assertEquals(chkoutItem3, loc.item4, "ERROR Chkout! I4");
		
		String tax = driver.findElement(By.cssSelector(loc.taxLoc)).getText();
		Double Tax = Double.parseDouble(tax.substring(6));
		Double TotalPriceInclTax = Tax+loc.itemPrice1+loc.itemPrice3+loc.itemPrice4;
		String ExTotalPrice = df.format(TotalPriceInclTax);
		
		
		String priceTotal = driver.findElement(By.cssSelector(loc.totalPriceLoc)).getText();
		Double TP = Double.parseDouble(priceTotal.substring(8));
		String ActTotalPrice = df.format(TP);
		Assert.assertEquals(ActTotalPrice, ExTotalPrice, "Total Price Error!");
		
		
		driver.findElement(By.id(loc.finish)).click();
		
		String successMessage = driver.findElement(By.cssSelector(loc.chkoutCom)).getText();
		Assert.assertEquals(successMessage, loc.successMessage, "Checkout Complete Error!");
		
		System.out.println(successMessage);
		
		driver.quit();
	}

}
