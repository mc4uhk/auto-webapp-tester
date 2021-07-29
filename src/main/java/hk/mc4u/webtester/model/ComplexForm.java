package hk.mc4u.webtester.model;

public class ComplexForm extends BasicForm implements Part1Component, Part2Component{

	private String name;

	private String expiry;

	@Override
	public String getExpiry() {
		return expiry;
	}

	@Override
	public String setExpiry(String expiry) {
		return this.expiry;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String setName(String name) {
		return this.name;
	}
	
	
	
	
}
