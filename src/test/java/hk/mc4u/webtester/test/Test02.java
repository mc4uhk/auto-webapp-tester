package hk.mc4u.webtester.test;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test02 {

	@Test
	public void test01() throws Exception {
		String[][] data = {
				{"A","a"},	
				{"A","b"},	
				{"A","c", "1"},	
				{"A","d"},	
				{"A","e"},	
		};
		
		List<String[]> list = Arrays.asList(data);
		
		list.forEach(this::process);
	}
	
	public void process(String... params) {
		log.info("Length: {}", params.length);
		for(String param : params) {
			log.info("{}", param);
		}
	}

}
