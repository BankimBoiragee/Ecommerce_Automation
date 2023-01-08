package luma.usa.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import luma.usa.basepage.Base_Page;

public class Highlight_Element extends Base_Page {
	public static void drawBorder(WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='6px solid yellow'",ele);
	}

}
