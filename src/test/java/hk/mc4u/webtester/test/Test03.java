package hk.mc4u.webtester.test;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test03 {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void test01() throws Exception {
		Object[][] data = {
				{"A","a"},	
				{"A","b"},	
				{"A", Keys.DOWN},	
				{"A", Keys.DOWN},	
				{"A", Keys.DOWN},	
				{"A","d"},	
				{"A","e"},	
		};
		
		
		List<Object[]> list = Arrays.asList(data);
		
		list.forEach(this::process);
	}
	
	public void process(Object... params) {
		log.info("Length: {}", params.length);
		String name=(String) params[0];
		CharSequence value=(CharSequence) params[1];
		WebElement e = driver.findElement(By.name(name));
		e.sendKeys(value);
	}


}
