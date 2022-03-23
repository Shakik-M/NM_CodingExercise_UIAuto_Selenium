package userJourney;

public class locators {
	
	String url = "https://www.saucedemo.com/";
	String userName = "standard_user";
	String password = "secret_sauce";
	String nameLoc = "user-name";
	String passLoc = "password";
	String loginBtn = "login-button";
	String sorterLoHi = "//select[@class='product_sort_container']/option[3]";
	String cart = "shopping_cart_link";
	String conShop = "[id='continue-shopping']";
	String chkoutBtn = "checkout";
	String firstNameLoc = "firstName";
	String firstName = "Muhammad";
	String lastNameLoc = "lastName";
	String lastName = "Shakik";
	String postalCodeLoc = "postalCode";
	String postalCode = "12345";
	String conChkOut = "[value='Continue']";
	String finish = "finish";
	String successMessage = "THANK YOU FOR YOUR ORDER";
	
//	Item name & price in inventory page
	
	String item1 = "Sauce Labs Onesie";
	String item2 = "Sauce Labs Bolt T-Shirt";
	String item3 = "Sauce Labs Backpack";
	String item4 = "Sauce Labs Fleece Jacket";
	Double itemPrice1 = 7.99;
	Double itemPrice3 = 29.99;
	Double itemPrice4 = 49.99;
	
//	Item Add2Cart locators in inventory page
	String item1Add = "//div[@class='inventory_list']/div[1]/div[2]/div[2]/button";
	String item2Add = "//div[@class='inventory_list']/div[3]/div[2]/div[2]/button";
	String item3Add = "//div[@class='inventory_list']/div[5]/div[2]/div[2]/button";
	String item4Add = "//div[@class='inventory_list']/div[4]/div[2]/div[2]/button";
	
//	Remove from cart item2
	String removeItem = "//div[@class='cart_item'][2]/div/div[2]/button";
	
//	Item name locators in cart
	String cartItem1 = "//div[@class='cart_item'][1]/div/a";
	String cartItem2 = "//div[@class='cart_item'][2]/div/a";
	String cartItem3 = "//div[@class='cart_item'][3]/div/a";
	
//	Item name locators in cart
	String chkItem1 = "//div[@class='cart_item'][1]/div/a";
	String chkItem2 = "//div[@class='cart_item'][2]/div/a";
	String chkItem3 = "//div[@class='cart_item'][3]/div/a";
	
//	Item price locators in cart
	String taxLoc = "[class='summary_tax_label']";
	String totalPriceLoc  = "[class='summary_total_label']";
	
//	checkout complete
	
	String chkoutCom = "[class='complete-header']";
	
	
}
