package hk.mc4u.webtester.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author edmund
 *
 *         This class contain all the locator and methods of login page
 *         Reference: Complete Page Object Model (POM) using Page Factory in
 *         Selenium https://www.youtube.com/watch?v=fUSl-WhqymU
 */

public class GoogleHome extends Page {

	String url = "http://www.google.com";

	@FindBy(how = How.XPATH, using = "//input[@class='gLFyf gsfi']")
	WebElement searchBox;

	@FindBy(how = How.XPATH, using = "//input[@value='Google 搜尋']")
	WebElement searchButton;

	public GoogleHome(WebDriver driver) {
		super(driver);
	}

	public GoogleResult search(String search) throws InterruptedException {
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(1000);
		if (driver.getTitle().startsWith(search))
			return PageFactory.initElements(driver, GoogleResult.class);

		return null;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
