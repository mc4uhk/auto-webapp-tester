package hk.mc4u.webtester.test;

import org.junit.jupiter.api.Test;

import hk.mc4u.example.validation.ValidationProcess;
import hk.mc4u.example.validation.strategy.DealerLicenceStrategy;
import hk.mc4u.example.validation.strategy.ExemptionStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test05 {

	@Test
	public void test01() throws Exception {
		ValidationProcess dlProcess = new ValidationProcess(new DealerLicenceStrategy());
		dlProcess.doValidation();

		ValidationProcess epProcess = new ValidationProcess(new ExemptionStrategy());
		epProcess.doValidation();
		
	}

}
