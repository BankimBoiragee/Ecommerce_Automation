package luma.usa.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.usa.basepage.Base_Page;

public class Wait_Helper extends Base_Page {
	public static void seleniumWait(WebElement ele, long time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}
