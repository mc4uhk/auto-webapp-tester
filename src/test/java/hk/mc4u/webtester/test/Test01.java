package hk.mc4u.webtester.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import hk.mc4u.webtester.page.GoogleHome;
import hk.mc4u.webtester.page.GoogleResult;
import hk.mc4u.webtester.task.SimpleTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test01 {

	@Test
	@Disabled
	public void test() throws Exception {
		log.info("Hi");
		SimpleTest task = new SimpleTest();
		task.run();
		
	}

	@Test
	public void test01() throws Exception {
		log.info("Hi");
		WebDriver driver = new ChromeDriver();

		GoogleHome page = PageFactory.initElements(driver, GoogleHome.class);
		driver.get(page.getUrl());
		Thread.sleep(2000);
		GoogleResult resultPage = page.search("java");
		resultPage.search("maven")
			.search("junit")
			.search("junit 5");
		Thread.sleep(3000);
		
	}

}
