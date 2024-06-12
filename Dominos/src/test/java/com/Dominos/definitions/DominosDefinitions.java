package com.Dominos.definitions;


import java.io.FileNotFoundException;

import org.junit.Assert;

import com.Dominos.actions.DominosActions;
import com.Dominos.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DominosDefinitions {

	DominosActions objDominos = new DominosActions();

	@Given("Open browser and enter url")
	public void open_browser_and_enter_url() throws FileNotFoundException {
		HelperClass.openUrl();

	}

	@Given("Click on order online now")
	public void click_on_order_online_now() {
		objDominos.orderOnlineNow();
		objDominos.clickAllow();

	}

	@Given("Enter your delivery address and pick on address")
	public void enter_your_delivery_address_and_pick_on_address() {

		objDominos.enteryourDeliveryAddress();

		objDominos.enterArea();

	}

	@When("Click on veg pizza menu")
	public void click_on_veg_pizza_menu() {
		objDominos.click_on_VegPizza();
	}

	@When("Select on Margherita pizza quantity of two")
	public void select_on_margherita_pizza_quantity_of_two() {
		objDominos.select_Margherita_Pizza();

	}

	@When("Verify the Margherita pizza value")
	public void verify_the_margherita_pizza_value() {

		String Margherita_Value = "239";
		Assert.assertEquals(objDominos.verify_Margherita_Pizza_value(), Margherita_Value);
		System.out.println("Margherita pizza_value -" + " " + objDominos.verify_Margherita_Pizza_value());
	}

	@When("Select on primavera Gourmet Pizza quantity two")
	public void select_on_primavera_gourmet_pizza_quantity_two() {
		objDominos.select_Primavera_Gourmet_Pizza();
	}

	@When("Verify the primavera Gourmet Pizza value")
	public void verify_the_primavera_gourmet_pizza_value() {

		String primavera_Gourmet_pizza_value = "549";
		Assert.assertEquals(objDominos.verify_Primavera_Gourmet_Pizza_value(), primavera_Gourmet_pizza_value);
		System.out.println("primavera Gourmet Pizza_value -" + " " + objDominos.verify_Primavera_Gourmet_Pizza_value());
	}

	@When("Select on Peppy Paneer pizza quantity of two")
	public void select_on_peppy_paneer_pizza_quantity_of_two() {
		objDominos.select_PeppyPanner_Pizza();
	}

	@When("Verify the Peppy Paneer Pizza value")
	public void verify_the_peppy_paneer_pizza_value() {
		String PeppyPaneer_pizza_value = "459";
		Assert.assertEquals(objDominos.verify_Peppypanner_Pizza_value(), PeppyPaneer_pizza_value);
		System.out.println("Peppy Paneer Pizza_value -" + " " + objDominos.verify_Peppypanner_Pizza_value());

	}

	@When("Verify subtotal value only pizzas")
	public void verify_subtotal_value_only_pizzas() {
		// objDominos.verify_subtotal_Value();
		System.out.println("Pizzas_subtotal_value -" + " " + objDominos.verify_Pizzas_subtotal_Value());

	}

	@Then("Explore menu")
	public void explore_menu() {
		objDominos.explore_menu();
	}

	@Then("Click on beverages add pepsi into cart")
	public void click_on_beverages_add_pepsi_into_cart() {
		objDominos.clickon_Beverages_and_Pepsi_475ml_addtoCart();

	}

	@Then("Verify the Pepsi 475ml Value")
	public void verify_the_pepsi_475ml_value() {
		String pepsi_475ml_value = "60";
		Assert.assertEquals(objDominos.verify_Pepsi475ml_value(), pepsi_475ml_value);
		System.out.println("Pepsi_475ml_ value -" + " " + objDominos.verify_Pepsi475ml_value());
	}

	@Then("add pepsi 475ml quantity of twelve")
	public void add_pepsi_475ml_quantity_of_twelve() {
		objDominos.pepsi_475ml_Addtocart_and_twelve();
	}

	@Then("Verify subtotal value total cart")
	public void verify_subtotal_value_total_cart() {
		// objDominos.verify_subtotal_Value();
		System.out.println("Pizza and Beverages_subtotal_ value -" + " "+ objDominos.verify_Pizzas_and_Beverages_subtotal_Value());
	}

	

	@Then("Remove pepsi 475ml quantity of six into cart")
	public void remove_pepsi_475ml_quantity_of_six_into_cart() throws InterruptedException {
		
		objDominos.remove_Pepsi_into_Cart();
	}
	
	@Then("Remove Margherita pizza quantity of one into cart")
	public void remove_margherita_pizza_quantity_of_one_into_cart() throws InterruptedException {

		objDominos.remove_Margarita_Pizza_into_Cart();
	}

	@Then("Verify subtotal final cart value")
	public void verify_subtotal_final_cart_value() throws InterruptedException {
		// objDominos.check_FinalCart_Subtotal_value();
		System.out.println("Pizza and Beverages_subtotal_finalcart_value -" + " " + objDominos.check_FinalCart_Subtotal_value());

	}

}