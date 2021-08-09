package hk.mc4u.example.validation.strategy;

import java.util.HashMap;
import java.util.Map;

import hk.mc4u.example.validation.ValidationStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DealerLicenceStrategy implements ValidationStrategy {

	
	@Override
	public Map<String,String> fillInParam() {
		log.info("fillInParam: {}",getClass().getName());
		return new HashMap<>();
		
	}

	@Override
	public boolean doSave() {
		log.info("doSave: {}",getClass().getName());
		return true;
	}

}
