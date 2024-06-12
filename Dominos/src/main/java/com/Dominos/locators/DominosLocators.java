package com.Dominos.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DominosLocators {

	// Clickorderonline
	@FindBy(xpath = "//*[@id='online-banner']/div/a/button")
	public WebElement clickonlineOrder;

	// EnteryourDeleiveryAddress
	@FindBy(xpath = "//*[@placeholder='Enter your delivery address']")
	public WebElement enterDeleiveryAddress;

	// Enter Area
	@FindBy(xpath = "//input[@placeholder='Enter Area / Locality']")
	public WebElement enterArea;

	// Click Allow
	@FindBy(id = "optInText")
	public WebElement clickAllow;

	// select address
	@FindBy(xpath = "(//div[@class='lst-wrpr'])[1]")
	public WebElement selectAddress;

	// Veg pizza Menu
	@FindBy(xpath = "//span[normalize-space()='VEG PIZZA']")
	public WebElement click_vegPizza_Menu;

	// Margharita pizza
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//span[contains(text(),'Margherita')]")
	public WebElement margherita_Pizza;

	// Margharita pizza add to cart
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//span[contains(text(),'ADD TO CART')]")
	public WebElement margherita_Pizza_addcart;

	// Make my pizza more yummy? No Thanks
	@FindBy(xpath = "//button[@data-label='Add button']//span[contains(text(),'NO THANKS')]")
	public WebElement noThanks;

	// Margharita pizza add more to cart
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//div[@data-label='quantity']//div[@data-label='increase']")
	public WebElement addmoreMargheritaPizza_intoCart;

	// getting Margharita pizza value
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//span[@class='rupee']")
	public WebElement getMargheritaPizzaValue;

	// peppy panner pizza
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//span[contains(text(),'Peppy Paneer')]")
	public WebElement peppyPannerPizza;

	// peppy panner pizza AddtoCart
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//span[contains(text(),'ADD TO CART')]")
	public WebElement peppypannerpizza_AddtoCart;

	// peppy panner pizza add one more to cart
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//div[@data-label='quantity']//div[@data-label='increase']")
	public WebElement addmorePeppyPannerPizza_intoCart;

	// getting peppy panner pizza value
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//span[@class='rupee']")
	public WebElement getPeppyPannerPizzaValue;

	// Primavera Gourmet-Pizza
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//span[contains(text(),'Primavera Gourmet-Pizza')]")
	public WebElement primaveraGourmet_Pizza;

	// Primavera Gourmet-Pizza AddtoCart
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//span[contains(text(),'ADD TO CART')]")
	public WebElement primaveraGourmet_Pizza_AddtoCart;

	// Primavera Gourmet-Pizza add more to cart
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//div[@data-label='quantity']//div[@data-label='increase']")
	public WebElement addmorePrimavera_Gourmet_Pizza_intoCart;

	// getting Primavera Gourmetr pizza value
	@FindBy(xpath = "//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//span[@class='rupee']")
	public WebElement getPrimavera_Gourmetr_pizza_Value;

	// checkout
	@FindBy(xpath = "//button[@data-label='miniCartCheckout']")
	public WebElement checkout;

	// subtotal value in the cart
	@FindBy(xpath = "//span[@data-label='Sub Total']/following-sibling::span/span")
	public WebElement subTotal_cartValue;

	// ExploreMenu
	@FindBy(xpath = "//button[@datalabel='Explore Menu']")
	public WebElement exploreMenu;

	// Beverage section
	@FindBy(xpath = "//span[normalize-space()='BEVERAGES']")
	public WebElement selectBeverage_Menu;

	// select pepsi 475ml
	@FindBy(xpath = "//span[normalize-space()='Pepsi 475ml']")
	public WebElement pepsi_475ml;

	// pepsi 475ml AddtoCart
	@FindBy(xpath = "//div[@data-label='Pepsi 475ml']//span[contains(text(),'ADD TO CART')]")
	public WebElement pepsi_475ml_AddtoCart;

	// getting pepsi 475ml value
	@FindBy(xpath = "//div[@data-label='Pepsi 475ml']//span[@class='rupee']")
	public WebElement getPepsi_475ml_Value;

	// add more pepsi into cart
	@FindBy(xpath = "//div[@data-label='Pepsi 475ml']//div[@data-label='increase']")
	public WebElement addsomemore_Pepsi_475ml;

	// Decrease Margherita Pizza into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Margherita')]/following-sibling::div/div/div[@data-label='quantity']//div[@data-label='decrease']")
	public WebElement decrease_Margherita_Pizza_into_cart;

	// Decrease Pepsi into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Pepsi 475ml')]/following-sibling::div/div/div[@data-label='quantity']//div[@data-label='decrease']")
	public WebElement decrease_Pepsi_475ml;

	// get Margherita Pizza Quantity into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Margherita')]/following-sibling::div/div/div[@data-label='quantity']//span")
	public WebElement get_Margherita_Quantity_into_Cart;

	// get Peppy panner Pizza Quantity into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Peppy Paneer')]/following-sibling::div/div/div[@data-label='quantity']//span")
	public WebElement get_PeppyPaneer_Quantity_into_Cart;

	// get Primavera Gourmet-Pizza Pizza Quantity into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Primavera Gourmet-Pizza')]/following-sibling::div/div/div[@data-label='quantity']//span")
	public WebElement get_Primavera_Gourmet_Pizza_Quantity_into_Cart;

	// get Pepsi_475ml_Quantity_into_Cart;
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Pepsi 475ml')]/following-sibling::div/div/div[@data-label='quantity']//span")
	public WebElement get_Pepsi_475ml_Quantity_into_Cart;

	// get Margherita Pizza value into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Margherita')]/following-sibling::div/div/div[@data-label='cart-item-price']")
	public WebElement get_Margherita_Value_into_Cart;

	// get Peppy panner Pizza Quantity into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Peppy Paneer')]/following-sibling::div/div/div[@data-label='cart-item-price']")
	public WebElement get_PeppyPaneer_Value_into_Cart;

	// get Primavera Gourmet-Pizza Pizza Quantity into cart
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Primavera Gourmet-Pizza')]/following-sibling::div/div/div[@data-label='cart-item-price']")
	public WebElement get_Primavera_Gourmet_Pizza_Value_into_Cart;

	// get Pepsi_475ml_Quantity_into_Cart;
	@FindBy(xpath = "//div[@data-label='cart-item-entry']//span[contains(text(),'Pepsi 475ml')]/following-sibling::div/div/div[@data-label='cart-item-price']")
	public WebElement get_Pepsi_475ml_Value_into_Cart;

}
