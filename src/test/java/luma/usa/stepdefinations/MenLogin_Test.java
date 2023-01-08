package luma.usa.stepdefinations;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.*;
import luma.usa.basepage.Base_Page;
import luma.usa.elementpage.LoginAndPurchase;
import luma.usa.generic.Common_Utility;
import luma.usa.generic.Highlight_Element;
import luma.usa.generic.Wait_Helper;

public class MenLogin_Test extends Base_Page {
	LoginAndPurchase pf;
	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		//Base_Page.startAutomation();
				//LoginAndPurchase pf= new LoginAndPurchase();
				pf=PageFactory.initElements(driver, LoginAndPurchase.class);
				pf.getLogin();
				
				/*String expected="Welcome, Bankim Boiragee!";
				WebElement ele=driver.findElement(By.xpath("(//*[text()='Welcome, Bankim Boiragee!'])[1]"));
				Assert.assertEquals(expected,actual.getText());
				System.out.println(actual.getText());
			    String actual=ele.getText();
			    */
				String expected=prop.getProperty("LandingPageTitle");
				Highlight_Element.drawBorder(pf.getVeifyLandingPageText());
				Wait_Helper.seleniumWait(pf.getVeifyLandingPageText(),30);
				String actual=pf.getVeifyLandingPageText().getText();
				log.info("User able to verify the landing page");
				Common_Utility.getAssert(expected,actual);   
	    
	}
	@When("User should be able to select Jupiter All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {
			log.info("User able to mousehover over the men module");
		Highlight_Element.drawBorder(pf.getMenModule());
			Wait_Helper.seleniumWait(pf.getMenModule(),30);	
			Common_Utility.getMousHover(pf.getMenModule());	
			 //pf.getMenModule();   
			
			log.info("User able to mousehover over the tops");
			Highlight_Element.drawBorder(pf.getSelectTops());
			Wait_Helper.seleniumWait(pf.getSelectTops(),30);	
			Common_Utility.getMousHover(pf.getSelectTops());
			
			log.info("User able to click on jackets");
			Highlight_Element.drawBorder(pf.getSelectJackets());
			Wait_Helper.seleniumWait(pf.getSelectJackets(),30);
			//Common_Utility.getActionClick(pf.getSelectJackets());
			Common_Utility.getJsClick(pf.getSelectJackets());   
	    
	}
	@When("Verify the jacket name on the Jupiter All-Weather Trainer list")
	public void verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
		/*log.info("User able to verify the specific jacket");
		String expected=prop.getProperty("Jupiter All-Weather Trainer");
		Wait_Helper.seleniumWait(pf.getSelectJupiterJacket(),30);
		String actual=pf.getSelectJupiterJacket().getText();
		Common_Utility.getAssert(expected,actual); 
		*/
		log.info("User able to verify the specific jacket");
		Highlight_Element.drawBorder(pf.getSelectJupiterJacket());
		Wait_Helper.seleniumWait(pf.getSelectJupiterJacket(),30);
		Common_Utility.getJsClick(pf.getSelectJupiterJacket());   
	    
	}
	@When("User should be able to select the S and Blue and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_s_and_blue_and_then_click_on_the_add_to_cart(Integer int1) {
		log.info("User able to select the jacket size");
		Highlight_Element.drawBorder(pf.getSelectJacketSize());
		Wait_Helper.seleniumWait(pf.getSelectJacketSize(),30);
		Common_Utility.getActionClick(pf.getSelectJacketSize());
		
		log.info("User able to select the jacket color");
		Highlight_Element.drawBorder(pf.getSelectJacketColor());
		Wait_Helper.seleniumWait(pf.getSelectJacketColor(),30);
		Common_Utility.getActionClick(pf.getSelectJacketColor());
		
		log.info("User able to select the quantity");
		Highlight_Element.drawBorder(pf.getSelectJacketQuantity());
		Wait_Helper.seleniumWait(pf.getSelectJacketQuantity(),30);
		pf.getSelectJacketQuantity().clear();
		pf.getSelectJacketQuantity().sendKeys("1");
		
		log.info("User able to Add to Cart");
		Highlight_Element.drawBorder(pf.getSelectAddToCart());
		Wait_Helper.seleniumWait(pf.getSelectAddToCart(),30);
		Common_Utility.getJsClick(pf.getSelectAddToCart());
		   
	    
	}
	@When("User should be able to click on the shopping cart and proceed to checkout")
	public void user_should_be_able_to_click_on_the_shopping_cart_and_proceed_to_checkout() {
		log.info("User able to click on the shopping Cart");
		Highlight_Element.drawBorder(pf.getClickOnShoppingCart());
		Wait_Helper.seleniumWait(pf.getClickOnShoppingCart(),30);
		Common_Utility.getJsClick(pf.getClickOnShoppingCart());  
		
		log.info("User able to click on the Proceed ToCheck Out");
		Highlight_Element.drawBorder(pf.getclickOnProceedToCheckOut());
		Wait_Helper.seleniumWait(pf.getclickOnProceedToCheckOut(),30);
		Common_Utility.getJsClick(pf.getclickOnProceedToCheckOut()); 
	    
	}
	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
	  pf.addShippingDetails();  
	    
	}
	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
		/*String expected=prop.getProperty("VerifyThanks");
		Highlight_Element.drawBorder(pf.getVeifyThankText());
		Wait_Helper.seleniumWait(pf.getVeifyThankText(),30);
		String actual=pf.getVeifyThankText().getText();
		log.info("User able to verify the Thank You for Purchase");
		Common_Utility.getAssert(expected,actual); 
	   */ 
	}
	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {
		String expected=prop.getProperty("VerifyThanks");
		Highlight_Element.drawBorder(pf.getVeifyThankText());
		Wait_Helper.seleniumWait(pf.getVeifyThankText(),30);
		String actual=pf.getVeifyThankText().getText();
		log.info("User able to verify the Thank You for Purchase");
		Common_Utility.getAssert(expected,actual);
		
		/*String expected=prop.getProperty("Verifyordernumber"); //Verify Order Number
		Highlight_Element.drawBorder(pf.getVeifyOrderNumber());
		Wait_Helper.seleniumWait(pf.getVeifyOrderNumber(),30);
		String actual=pf.getVeifyOrderNumber().getText();
		log.info("User able to verify the Thank You for Purchase");
		Common_Utility.getAssert(expected,actual);
		*/
	    
	}
}