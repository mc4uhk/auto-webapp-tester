package hk.mc4u.webtester.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hk.mc4u.example.validation.ValidationProcess;
import hk.mc4u.example.validation.ValidationStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test06 {
	private ValidationProcess process;
	
	private ValidationStrategy strategy;
	
	@BeforeEach
	public void setup() {
		strategy = mock(ValidationStrategy.class);
		process = new ValidationProcess(strategy);
	}
	
	@Test
	public void test01() throws Exception {
		
		boolean input = RandomUtils.nextBoolean();
		when(strategy.doSave())
			.thenReturn(input);

		boolean result = process.doValidation();
		log.info("result: {}", result);

		verify(strategy).fillInParam();
		verify(strategy).doSave();
		
		assertEquals(result, input);
	}

}
