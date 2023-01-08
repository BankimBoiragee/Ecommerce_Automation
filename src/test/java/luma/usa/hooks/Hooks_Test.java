package luma.usa.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.usa.basepage.Base_Page;

public class Hooks_Test extends Base_Page{
	@Before
	public void getSetUp() {
		Base_Page.startAutomation();	
	}
	@After
public void getTearDown() {
		//driver.quit();
	
}
}
