package hk.mc4u.example.validation;

import java.util.Map;

public interface ValidationStrategy {
	public Map<String,String> fillInParam();
	public boolean doSave();
}
