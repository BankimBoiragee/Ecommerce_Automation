package luma.usa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Page {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	public  Base_Page()  {
		log=Logger.getLogger("QA Lead Bankim");
		PropertyConfigurator.configure("log4j.properties");
		prop=new Properties();
		FileInputStream fl;
		try {
		   fl = new FileInputStream("./src/main/java/luma/usa/config/ConfigProperties");
			prop.load(fl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//prop.load(fl);
		/*finally {
			System.out.println("Config file is founding");
		}*/
	}
	public static void startAutomation() {
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			log.info("Start Automation In Chrome Browser");
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			log.info("Start Automation In Edge Browser");
			WebDriverManager.edgedriver().setup();;
		    driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			log.info("Start Automation In Firefox Browser");
			WebDriverManager.firefoxdriver().setup();;
		    driver=new FirefoxDriver();
		}
				
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		//driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.get(prop.getProperty("URL"));
		
	}
}
