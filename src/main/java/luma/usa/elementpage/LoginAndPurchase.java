package luma.usa.elementpage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.usa.basepage.Base_Page;
import luma.usa.generic.Common_Utility;
import luma.usa.generic.Highlight_Element;
import luma.usa.generic.Wait_Helper;

public class LoginAndPurchase extends Base_Page {
//How to initialize pagefactory concept?
	public LoginAndPurchase() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//*[contains(text(), 'Sign In ')])[1]")
	@CacheLookup
	private WebElement clickSigninBTN;
	public WebElement getClickSignInBTN() {
		return clickSigninBTN;
	}
	@FindBy(xpath="//*[@id='email']")
	@CacheLookup
	private WebElement enterUserName;
	public WebElement getEnterUserName() {
		return enterUserName;
	}
	@FindBy(xpath="//*[@title='Password']")
	@CacheLookup
	private WebElement enterPassword;
	public WebElement getEnterPassword() {
		return enterPassword;
	}
	
	@FindBy(xpath="//*[@class='action login primary']")
	@CacheLookup
	private WebElement clickLoginBTN;
	public WebElement getClickLoginBTN() {
		return clickLoginBTN;
	}
	@FindBy(xpath="(//*[text()='Welcome, Bankim Boiragee!'])[1]")
	@CacheLookup
	private WebElement landingPageText;
	public WebElement getVeifyLandingPageText() {
		return landingPageText ;
	}
	@FindBy(xpath="//span[text()='Men']")
	@CacheLookup
	private WebElement menModule;
	public WebElement getMenModule() {
		return menModule;
	}
	@FindBy(xpath="(//span[text()='Tops'])[2]")
	@CacheLookup
	private WebElement selectTops;
	public WebElement getSelectTops() {
		return selectTops;
	}
	@FindBy(xpath="(//span[text()='Jackets'])[2]")
	@CacheLookup
	private WebElement selectJackets;
	public WebElement getSelectJackets() {
		return selectJackets;
	}
	@FindBy(linkText="Jupiter All-Weather Trainer")
	@CacheLookup
	private WebElement selectJupiterJacket;
	public WebElement getSelectJupiterJacket() {
		return selectJupiterJacket;
	}
	@FindBy(xpath="(//div[@class='swatch-option text'])[2]")
	@CacheLookup
	private WebElement selectJacketSize;
	public WebElement getSelectJacketSize() {
		return selectJacketSize;
	}
	@FindBy(xpath="(//div[@class='swatch-option color'])[1]")
	@CacheLookup
	private WebElement selectJacketColor;
	public WebElement getSelectJacketColor() {
		return selectJacketColor;
	}
	@FindBy(id="qty")
	@CacheLookup
	private WebElement selectJacketQuantity;
	public WebElement getSelectJacketQuantity() {
		return selectJacketQuantity;
	}
	
	@FindBy(xpath="//*[text()='Add to Cart']")
	@CacheLookup
	private WebElement selectAddToCart;
	public WebElement getSelectAddToCart() {
		return selectAddToCart;
	}
	@FindBy(linkText="shopping cart")
	@CacheLookup
	private WebElement clickOnShoppingCart;
	public WebElement getClickOnShoppingCart() {
		return clickOnShoppingCart;
	}
	@FindBy(xpath="(//*[contains(@class,'action primary checkout')])[2]")
	@CacheLookup
	private WebElement clickOnProceedToCheckOut;
	public WebElement getclickOnProceedToCheckOut() {
		return clickOnProceedToCheckOut;
	}
	//Address details
	@FindBy(xpath="//button[@class='action action-show-popup']")
	@CacheLookup
	private WebElement enterNewAddress;
	public WebElement getEnterNewAddress() {
		return enterNewAddress;
	}		
	@FindBy(xpath="(//*[@class='input-text'])[6]")
	@CacheLookup
	private WebElement addFirstName;
	public WebElement getEnterFirstName() {
		return addFirstName;
	}
	@FindBy(xpath="(//*[@class='input-text'])[7]")
	@CacheLookup
	private WebElement addLastName;
	public WebElement getEnterLastName() {
		return addLastName;
	}
	@FindBy(xpath="(//*[@class='input-text'])[8]")
	@CacheLookup
	private WebElement addCompanyName;
	public WebElement getEnterCompanyName() {
		return addCompanyName;
	}
	@FindBy(xpath="(//*[@class='input-text'])[9]")
	@CacheLookup
	private WebElement addStreetAddress;
	public WebElement getEnterStreetAddress() {
		return addStreetAddress;
	}
	@FindBy(xpath="(//*[@class='input-text'])[12]")
	@CacheLookup
	private WebElement addCityName;
	public WebElement getEnterCityName() {
		return addCityName;
	}
	@FindBy(xpath="(//select[@class='select'])[1]")
	@CacheLookup
	private WebElement selectStateName;
	public WebElement getSelectStateName() {
		return selectStateName;
	}
	@FindBy(xpath="(//select[@class='select'])[1]/option")   //Drop Down for Multiple elements
	@CacheLookup
	private List<WebElement> selectDropDownStateName;
	public List<WebElement> getSelectDropDownStateName() {
		return selectDropDownStateName;
	}
	
	@FindBy(xpath="(//input[@class='input-text'])[14]")
	@CacheLookup
	private WebElement addZipCode;
	public WebElement getEnterZipCode() {
		return addZipCode;
	}
	@FindBy(xpath="(//select[@class='select'])[2]")
	@CacheLookup
	private WebElement selectCountryName;
	public WebElement getSelectCountryName() {
		return selectCountryName;
	}
	@FindBy(xpath="(//input[@class='input-text'])[15]")
	@CacheLookup
	private WebElement enterPhoneNumber;
	public WebElement getEnterPhoneNumber() {
		return enterPhoneNumber;
	}
	@FindBy(xpath="//*[@class='action primary action-save-address']")
	@CacheLookup
	private WebElement enterShipHere;
	public WebElement getEnterShipHere() {   
		return enterShipHere;
	}
	
	//-->2nd Ship Here
	/*@FindBy(xpath="//button[@class='action action-select-shipping-item']")
	@CacheLookup
	private WebElement clickShipHere;
	public WebElement getClickShipHere() {   
		return clickShipHere;
	}*/
	//-->Radio Button
	@FindBy(xpath="//*[@name='ko_unique_3']")      //input[@class='radio'])[1]
	@CacheLookup
	private WebElement enterRadioButton;
	public WebElement getEnterRadioButton() {
		return enterRadioButton;
	}
	@FindBy(xpath="//button[@class='button action continue primary']")
	@CacheLookup
	private WebElement enterNextButton;
	public WebElement getEnterNextButton() {
		return enterNextButton;
	}
	@FindBy(xpath="//button[@class='action primary checkout']")
	@CacheLookup
	private WebElement enterPlaceOrder;
	public WebElement getEnterPlaceOrder() {
		return enterPlaceOrder;
	}
	//------Verify Thank You for Purchase
	@FindBy(xpath="//*[contains(text(),'Thank you for your purchase!')]")   //*[@class='page-title-wrapper']
	@CacheLookup
	private WebElement verifyText;
	public WebElement getVeifyThankText() {
		return verifyText ;
	}
	//------>Verify Order number
	@FindBy(xpath="(//div[@class='checkout-success']//following::a)[1]")   //linkText="order-number
	@CacheLookup
	private WebElement verifyOrderNumber;
	public WebElement getVeifyOrderNumber() {
		return verifyOrderNumber ;
	}
	
	public  void addShippingDetails() {
		
		log.info("User able to Enter the new address");
		Highlight_Element.drawBorder(getEnterNewAddress());
		Wait_Helper.seleniumWait(getEnterNewAddress(), 30);
		//Common_Utility.getActionClick(getEnterNewAddress());
		Common_Utility.getJsClick(getEnterNewAddress());
				
		getEnterFirstName().clear();
		log.info("User able to Enter the first name");
		Highlight_Element.drawBorder(getEnterFirstName());
		Wait_Helper.seleniumWait(getEnterFirstName(), 30);
		//getEnterFirstName().sendKeys("Bankim");
		getEnterFirstName().sendKeys(Common_Utility.getNewAlphabetValue()+"@gmail.com");
		
		getEnterLastName().clear();
		log.info("User able to Enter the last name");
		Highlight_Element.drawBorder(getEnterLastName());
		Wait_Helper.seleniumWait(getEnterLastName(), 30);
		//getEnterLastName().sendKeys("Boiragee");
		getEnterLastName().sendKeys(Common_Utility.getNewAlphabetValue());
		
		getEnterCompanyName().clear();
		log.info("User able to Enter the company name");
		Highlight_Element.drawBorder(getEnterCompanyName());
		Wait_Helper.seleniumWait(getEnterCompanyName(), 30);
		//getEnterCompanyName().sendKeys("Smart Tech");
		getEnterCompanyName().sendKeys(Common_Utility.getNewAlphabetValue());
		
		getEnterStreetAddress().clear();
		log.info("User able to Enter the street address");
		Highlight_Element.drawBorder(getEnterStreetAddress());
		Wait_Helper.seleniumWait(getEnterStreetAddress(), 30);
		getEnterStreetAddress().sendKeys("82"+ Common_Utility.getNewAlphabetValue());
		
		getEnterCityName().clear();
		log.info("User able to Enter the city name");
		Highlight_Element.drawBorder(getEnterCityName());
		Wait_Helper.seleniumWait(getEnterCityName(), 30);
		getEnterCityName().sendKeys("New York");
		
		//getSelectStateName().sendKeys("New York");
		log.info("User able to select the state name");
		Wait_Helper.seleniumWait(getSelectStateName(), 30);
		//Common_Utility.getSelectValue(getSelectStateName(),"New York");
		Common_Utility.getSelectDropDownList(getSelectDropDownStateName(),"New York" );
		
		getEnterZipCode().clear();
		log.info("User able to Enter the zip code");
		Highlight_Element.drawBorder(getEnterZipCode());
		Wait_Helper.seleniumWait(getEnterZipCode(), 30);
		getEnterZipCode().sendKeys("11373");
				
		//getselectCountryName().sendKeys("Uited State");
		log.info("User able to select the country name");
		Wait_Helper.seleniumWait(getSelectCountryName(), 30);
		Common_Utility.getSelectValue(getSelectCountryName(),"United States");
		
		getEnterPhoneNumber().clear();
		log.info("User able to Enter the phone number");
		Highlight_Element.drawBorder(getEnterPhoneNumber());
		Wait_Helper.seleniumWait(getEnterPhoneNumber(), 30);
		//getEnterPhoneNumber().sendKeys("347 739 6833");
		getEnterPhoneNumber().sendKeys(Common_Utility.getNewNumericNumber());
		
		log.info("User able to Enter ship here");
		Highlight_Element.drawBorder(getEnterShipHere());
		Wait_Helper.seleniumWait(getEnterShipHere(), 30);
		//Common_Utility.getActionClick(getEnterShipHere());
		Common_Utility.getJsClick(getEnterShipHere());
		
		/*log.info("User able to Click ship here");
		Highlight_Element.drawBorder(getClickShipHere());
		Wait_Helper.seleniumWait(getClickShipHere(), 30);
		//Common_Utility.getActionClick(getEnterShipHere());
		Common_Utility.getJsClick(getClickShipHere());
		*/
		//----->>Radio Button
		log.info("User able to Enter the Radio Button");
		Highlight_Element.drawBorder(getEnterRadioButton());
		Wait_Helper.seleniumWait(getEnterRadioButton(), 30);
		//Common_Utility.getActionClick(getEnterRadioButton());
		//Common_Utility.getJsClick(getEnterRadioButton());
		Common_Utility.selectRadioButton(getEnterRadioButton());
		
		log.info("User able to Enter the Next Button");
		Highlight_Element.drawBorder(getEnterNextButton());
		Wait_Helper.seleniumWait(getEnterNextButton(), 30);
		//Common_Utility.getActionClick(getEnterShipHere());
		//Common_Utility.getJsClick(getEnterNextButton());
		Common_Utility.clickUntilElementClickable(getEnterNextButton());
		
		log.info("User able to Enter Place Order");
		Highlight_Element.drawBorder(getEnterPlaceOrder());
		Wait_Helper.seleniumWait(getEnterPlaceOrder(), 30);
		//Common_Utility.getActionClick(getEnterShipHere());
		Common_Utility.getJsClick(getEnterPlaceOrder());
				
	}
	public void getLogin() {
		log.info("User able to click on the signin button");
		Highlight_Element.drawBorder(getClickSignInBTN());
		Wait_Helper.seleniumWait(getClickSignInBTN(), 30);
		Common_Utility.getActionClick(getClickSignInBTN());
		//getClickSignInBTN().click();
		
		log.info("User able to enter username");
		Highlight_Element.drawBorder(getEnterUserName());
		Wait_Helper.seleniumWait(getEnterUserName(), 30);
		getEnterUserName().sendKeys(prop.getProperty("userName"));
				
		log.info("User able to enter password");
		Highlight_Element.drawBorder(getEnterPassword());
		Wait_Helper.seleniumWait(getEnterPassword(), 30);
		getEnterPassword().sendKeys(prop.getProperty("passWord"));
				
		log.info("User able to click login button");
		Highlight_Element.drawBorder(getClickLoginBTN());
		Wait_Helper.seleniumWait(getClickLoginBTN(), 30);
		//getClickLoginBTN().click();
		Common_Utility.getActionClick(getClickLoginBTN());
	}
}
