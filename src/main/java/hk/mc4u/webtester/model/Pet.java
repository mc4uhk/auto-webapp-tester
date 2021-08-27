package hk.mc4u.webtester.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pet {
	private String name;
    private int age;
    
    public Pet(String name) {
    	this.name = name;
    }
}
