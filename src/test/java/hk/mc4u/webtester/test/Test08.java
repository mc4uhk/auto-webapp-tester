package hk.mc4u.webtester.test;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import hk.mc4u.webtester.model.Person;
import hk.mc4u.webtester.model.Pet;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test08 {

	@Test
	public void test01() throws Exception {
			Person person = new Person();
			person.setName("Mr A");
			person.getPets().add(new Pet("Mr Pet A."));
			person.getPets().add(new Pet("Mr Pet B."));
			ObjectMapper mapper = new ObjectMapper();
			String jsonString = mapper
						.writerWithDefaultPrettyPrinter()
						.writeValueAsString(person);
			log.info(jsonString);
			
			
			Person aPerson = mapper.readValue(jsonString, Person.class);
			log.info("aPerson: {}",aPerson);
	}

}
