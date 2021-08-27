package hk.mc4u.webtester.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Person {
	private String name;
    private int age;
    private List<Pet> pets = new ArrayList<>();
}
