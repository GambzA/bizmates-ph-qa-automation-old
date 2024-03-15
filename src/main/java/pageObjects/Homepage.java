package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	public WebDriver driver;
	
	By applyNowBtn = By.linkText("Apply Now!");
	
	public Homepage() throws IOException
    {
        super();
    }
	
	public WebElement getApplyNowBtn() throws IOException{
		this.driver = getDriver();
		return driver.findElement(applyNowBtn);
	}
	
}
