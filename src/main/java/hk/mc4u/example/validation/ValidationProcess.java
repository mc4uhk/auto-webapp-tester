package hk.mc4u.example.validation;

public class ValidationProcess {
	private ValidationStrategy strategy;

	public ValidationProcess(ValidationStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void doValidation() {
		strategy.fillInParam();
		strategy.doSave();
	}
}
