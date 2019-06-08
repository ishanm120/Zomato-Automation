package stepDefiniation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
 
public class ServiceHooks {
    
	
	public static AndroidDriver webdriver;
	//protected static final String ZOMATO_APP_APK_PATH = System.getProperty("user.dir") + "\\APKFolder\\zomato.apk";
	public static Properties properties;

	public ServiceHooks() throws FileNotFoundException {
		properties = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\configuration\\config.properties");
		try {
			properties.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	@Before
	public static AndroidDriver setUp() throws Exception {
		System.out.println("MOved to Base Class for APK install");
		System.out.println(properties.getProperty("deviceName"));
/*		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", properties.getProperty("deviceName"));
		capabilities.setCapability("platformVersion", properties.getProperty("deviceName"));
		capabilities.setCapability("app", properties.getProperty("apkPath")); // Install and Open App
		webdriver = new AndroidDriver(new URL(properties.getProperty("AndroidUrl")), capabilities);*/
		return webdriver;
	}

 
    @After
    public void embedScreenshot(Scenario scenario) {
    	 System.out.println("Code is running with Cucumber @After Hook");
        }
    }
