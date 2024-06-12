package com.Dominos.actions;

import org.openqa.selenium.support.PageFactory;

import com.Dominos.locators.DominosLocators;
import com.Dominos.utils.HelperClass;

public class DominosActions {

	DominosLocators dominosLocators = null;

	public DominosActions() {

		this.dominosLocators = new DominosLocators();

		PageFactory.initElements(HelperClass.getDriver(), dominosLocators);

	}

	// click on order online now
	public void orderOnlineNow() {
		dominosLocators.clickonlineOrder.click();
	}

	// enter your delivery Address
	public void enteryourDeliveryAddress() {
		dominosLocators.enterDeleiveryAddress.click();
	}

	// Enter Area
	public void enterArea() {
		dominosLocators.enterArea.sendKeys("600100");
		dominosLocators.selectAddress.click();
	}

	// notifications
	public void clickAllow() {
		dominosLocators.clickAllow.click();
	}

	// Click on VegPizza
	public void click_on_VegPizza() {
		dominosLocators.click_vegPizza_Menu.click();
	}

	// add to cart Margherita pizza Quantity of 2
	public void select_Margherita_Pizza() {
		dominosLocators.margherita_Pizza_addcart.click();
		dominosLocators.noThanks.click();
		dominosLocators.addmoreMargheritaPizza_intoCart.click();
	}

	// get Margherita pizza value
	public String verify_Margherita_Pizza_value() {
		HelperClass.waitUntilElementVisible(dominosLocators.getMargheritaPizzaValue);
		return dominosLocators.getMargheritaPizzaValue.getText();
	}

	// add to cart peppy panner pizza Quantity of 2
	public void select_PeppyPanner_Pizza() {
		dominosLocators.peppypannerpizza_AddtoCart.click();
		dominosLocators.addmorePeppyPannerPizza_intoCart.click();
	}

	// get Peppy panner pizza value
	public String verify_Peppypanner_Pizza_value() {
		HelperClass.waitUntilElementVisible(dominosLocators.getPeppyPannerPizzaValue);
		return dominosLocators.getPeppyPannerPizzaValue.getText();
	}

	// add to cart primavera Gourmet pizza Quantity of 2
	public void select_Primavera_Gourmet_Pizza() {
		dominosLocators.primaveraGourmet_Pizza_AddtoCart.click();
		dominosLocators.addmorePrimavera_Gourmet_Pizza_intoCart.click();
	}

	// get Primavera Gourmet pizza value
	public String verify_Primavera_Gourmet_Pizza_value() {
		HelperClass.waitUntilElementVisible(dominosLocators.getPrimavera_Gourmetr_pizza_Value);
		return dominosLocators.getPrimavera_Gourmetr_pizza_Value.getText();
	}

	// check out get subtotal value
	public String verify_Pizzas_subtotal_Value() {

		dominosLocators.checkout.click();
		HelperClass.waitUntilElementVisible(dominosLocators.get_Margherita_Quantity_into_Cart);

		String A = dominosLocators.get_Margherita_Quantity_into_Cart.getText();
		String B = dominosLocators.get_Margherita_Value_into_Cart.getText();
		System.out.println("Margherita_Pizza Quantity-" + A + " , Value -" + B);
		String C = dominosLocators.get_PeppyPaneer_Quantity_into_Cart.getText();
		String D = dominosLocators.get_PeppyPaneer_Value_into_Cart.getText();
		System.out.println("PeppyPaneer_Pizza Quantity-" + C + " , Value -" + D);
		String E = dominosLocators.get_Primavera_Gourmet_Pizza_Quantity_into_Cart.getText();
		String F = dominosLocators.get_Primavera_Gourmet_Pizza_Value_into_Cart.getText();
		System.out.println("Margherita_Pizza Quantity-" + E + " , Value -" + F);

		HelperClass.waitUntilElementVisible(dominosLocators.subTotal_cartValue);
		return dominosLocators.subTotal_cartValue.getText();
	}

	// Explore Menu
	public void explore_menu() {
		dominosLocators.exploreMenu.click();
	}

	// click on Beverages and Add Pepsi 475ml
	public void clickon_Beverages_and_Pepsi_475ml_addtoCart() {
		dominosLocators.selectBeverage_Menu.click();
		HelperClass.waitUntilElementVisible(dominosLocators.pepsi_475ml_AddtoCart);
		dominosLocators.pepsi_475ml_AddtoCart.click();

	}

	// incease the Cart Pepsi 475ml Quantity of 12
	public void pepsi_475ml_Addtocart_and_twelve() {

		for (int i = 1; i < 12; i++) {
			dominosLocators.addsomemore_Pepsi_475ml.click();

		}
	}

	// get Pepsi 475ml value
	public String verify_Pepsi475ml_value() {
		HelperClass.waitUntilElementVisible(dominosLocators.getPepsi_475ml_Value);
		return dominosLocators.getPepsi_475ml_Value.getText();
	}

	// check out get subtotal value
	public String verify_Pizzas_and_Beverages_subtotal_Value() {

		dominosLocators.checkout.click();
		HelperClass.waitUntilElementVisible(dominosLocators.get_Margherita_Quantity_into_Cart);

		String A = dominosLocators.get_Margherita_Quantity_into_Cart.getText();
		String B = dominosLocators.get_Margherita_Value_into_Cart.getText();
		System.out.println("Margherita_Pizza Quantity-" + A + " , Value -" + B);
		String C = dominosLocators.get_PeppyPaneer_Quantity_into_Cart.getText();
		String D = dominosLocators.get_PeppyPaneer_Value_into_Cart.getText();
		System.out.println("PeppyPaneer_Pizza Quantity-" + C + " , Value -" + D);
		String E = dominosLocators.get_Primavera_Gourmet_Pizza_Quantity_into_Cart.getText();
		String F = dominosLocators.get_Primavera_Gourmet_Pizza_Value_into_Cart.getText();
		System.out.println("Margherita_Pizza Quantity-" + E + " , Value -" + F);
		String G = dominosLocators.get_Pepsi_475ml_Quantity_into_Cart.getText();
		String H = dominosLocators.get_Pepsi_475ml_Value_into_Cart.getText();
		System.out.println("Pepsi_475ml Quantity -" + G + " , Value -" + H);

		HelperClass.waitUntilElementVisible(dominosLocators.subTotal_cartValue);
		return dominosLocators.subTotal_cartValue.getText();
	}

	// remove one Margherita pizza into cart
	public void remove_Margarita_Pizza_into_Cart() throws InterruptedException {

		dominosLocators.exploreMenu.click();
		dominosLocators.checkout.click();
        HelperClass.waitUntilElementVisible(dominosLocators.decrease_Margherita_Pizza_into_cart);
        Thread.sleep(3000);
		dominosLocators.decrease_Margherita_Pizza_into_cart.click();

	}

	// get Marghetita Quantity into cart
	public String getMargherita_Quantity_into_cart() {
		HelperClass.waitUntilElementVisible(dominosLocators.get_Margherita_Quantity_into_Cart);
		return dominosLocators.get_Margherita_Quantity_into_Cart.getText();
	}

	// remove Pepsi 475ml Quantity of 6 into cart
	public void remove_Pepsi_into_Cart() throws InterruptedException {

		dominosLocators.exploreMenu.click();
		dominosLocators.checkout.click();
		
		HelperClass.waitUntilElementVisible(dominosLocators.decrease_Pepsi_475ml);

		for(int j=0; j<=6;j++) {

			Thread.sleep(3000);
			dominosLocators.decrease_Pepsi_475ml.click();
		}
	}

	// check out get final cart subtotal value
	public String check_FinalCart_Subtotal_value() throws InterruptedException {

		Thread.sleep(3000);
		dominosLocators.exploreMenu.click();
		dominosLocators.checkout.click();
		 HelperClass.waitUntilElementVisible(dominosLocators.subTotal_cartValue);

		String A = dominosLocators.get_Margherita_Quantity_into_Cart.getText();
		String B = dominosLocators.get_Margherita_Value_into_Cart.getText();
		System.out.println("Margherita_Pizza Quantity-" + A + " , Value -" + B);
		String C = dominosLocators.get_PeppyPaneer_Quantity_into_Cart.getText();
		String D = dominosLocators.get_PeppyPaneer_Value_into_Cart.getText();
		System.out.println("PeppyPaneer_Pizza Quantity-" + C + " , Value -" + D);
		String E = dominosLocators.get_Primavera_Gourmet_Pizza_Quantity_into_Cart.getText();
		String F = dominosLocators.get_Primavera_Gourmet_Pizza_Value_into_Cart.getText();
		System.out.println("Margherita_Pizza Quantity-" + E + " , Value -" + F);
		String G = dominosLocators.get_Pepsi_475ml_Quantity_into_Cart.getText();
		String H = dominosLocators.get_Pepsi_475ml_Value_into_Cart.getText();
		System.out.println("Pepsi_475ml Quantity -" + G + " , Value -" + H);

		HelperClass.waitUntilElementVisible(dominosLocators.subTotal_cartValue);
		return dominosLocators.subTotal_cartValue.getText();
	}

}
