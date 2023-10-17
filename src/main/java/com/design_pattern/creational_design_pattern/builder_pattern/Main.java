package com.design_pattern.creational_design_pattern.builder_pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person.Builder()
				.firstName("prabhat")
				.lastName("Upadhyay")
				.email("prabhatu50@gmail.com")
				.phone("1234567890")
				.build();
		System.out.println(person.toString());
	}

}
