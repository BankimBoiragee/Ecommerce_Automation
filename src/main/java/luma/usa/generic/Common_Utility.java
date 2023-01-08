package luma.usa.generic;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import luma.usa.basepage.Base_Page;

public class Common_Utility extends Base_Page {
	public static void getActionClick(WebElement ele) {
	Actions click=new Actions(driver);
	click.click(ele).build().perform();
	}
	public static void getJsClick(WebElement ele) {
		JavascriptExecutor click=(JavascriptExecutor)driver;
		click.executeScript("arguments[0].click()",ele);
	}
	public static void getAssert(String expected, String actual) {
		Assert.assertEquals(expected,actual);
		System.out.println("Verify Text " + actual);
	}
	public static void getMousHover(WebElement ele) {
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	public static void getSelectValue(WebElement ele, String text) {
	Select sc= new Select(ele);
	sc.selectByVisibleText(text);
	}
	public static void getSelectDropDownList(List<WebElement> ele, String text) {
		List<WebElement> option = ele;
		for (WebElement newValue : option) {
			if (newValue.getText().contains(text)) {
				newValue.click();
			}
		}
	}
	
	public static void clickUntilElementClickable(WebElement element) {
		WebElement ele=element;
		for(int i=0; i<=299;i++) {
			ele.click();
			break;
		}
		
	}
		
	public static void selectRadioButton(WebElement ele){
		boolean isSelected= ele.isSelected();
		if(!isSelected) {
			ele.click();
		}
	}
   public static String getNewAlphabetValue() {            // For Numeric Value
		String data=RandomStringUtils.randomAlphabetic(5);
		System.out.println(data);
		return data;
	}
   public static String getNewNumericNumber() {
	  String data= RandomStringUtils.randomNumeric(10);
	  System.out.println(data);
	   return data;
   }
   public static void main(String[] args) {
	   getNewAlphabetValue();
	   getNewNumericNumber();
}
}
