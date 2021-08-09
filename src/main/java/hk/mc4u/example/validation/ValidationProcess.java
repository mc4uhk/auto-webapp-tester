package hk.mc4u.example.validation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidationProcess {
	private ValidationStrategy strategy;

	public ValidationProcess(ValidationStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public boolean doValidation() {
		log.info("{} Start", getClass().getSimpleName());
		strategy.fillInParam();
		boolean result = strategy.doSave();
		log.info("{} Completed", getClass().getSimpleName());
		return result;
	}
}
