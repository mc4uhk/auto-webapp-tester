package hk.mc4u.example.validation.strategy;

import hk.mc4u.example.validation.ValidationStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExemptionStrategy implements ValidationStrategy {

	
	@Override
	public void fillInParam() {
		log.info("fillInParam: {}",getClass().getName());
		
	}

	@Override
	public void doSave() {
		log.info("doSave: {}",getClass().getName());
	}

}
