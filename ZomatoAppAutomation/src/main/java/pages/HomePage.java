package pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class HomePage extends BaseClass{

	public HomePage() throws FileNotFoundException {
		super();
		PageFactory.initElements(webdriver, this);
	}

}
